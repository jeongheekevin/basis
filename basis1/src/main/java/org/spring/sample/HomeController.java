package org.spring.sample;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.sample.dto.LicenseInfoVO;
import org.spring.sample.dto.MemberVO;
import org.spring.sample.service.LicenseInfoService;
import org.spring.sample.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private LicenseInfoService licenseInfoService;

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Model model) throws Exception {

		return "home";
	}
	
	
	
	//insertForm
	@RequestMapping(value = "/insertForm.do", method = RequestMethod.GET)
	public void insertForm() throws Exception {
		
		logger.info("insertForm Get");
		//return "insertForm";
	}
	
	//insertLicense
	@RequestMapping(value = "/insertForm.do", method = RequestMethod.POST)
	public String insertLicense(LicenseInfoVO licenseInfoVO, RedirectAttributes rttr) throws Exception {
		
		logger.info("insertForm POST");
		System.out.println(licenseInfoVO.getSerialNumber());
		System.out.println(licenseInfoVO.getLicenseName());
		System.out.println(licenseInfoVO.getLicenseType());
		licenseInfoService.insertLicenseList(licenseInfoVO);
		//SerialNumber, LicenseType, LicenseName
		
		
		return "redirect:/list.do";
	}
	
	
	
	//read list
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String getList(LicenseInfoVO licenseInfoVO, Model model) throws Exception {
		logger.info("list");

		List<LicenseInfoVO> licenseInfoList = licenseInfoService.selectLicenseList(licenseInfoVO);
		model.addAttribute("licenseInfoList", licenseInfoList);
		return "list";
	}

	
	//return 없는것 의심해보기 
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public void updateGET(LicenseInfoVO licenseInfoVO) throws Exception {
		
		
		logger.info("update Get");
	}
	
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public String updatePOST(LicenseInfoVO licenseInfoVO, RedirectAttributes rttr) throws Exception {
		
		logger.info("update POST");
		
		System.out.println(licenseInfoVO.getSerialNumber());
		System.out.println(licenseInfoVO.getLicenseName());
		System.out.println(licenseInfoVO.getLicenseType());
		
		licenseInfoService.updateLicenseList(licenseInfoVO);
		rttr.addFlashAttribute("msg","성공");
		
		return "redirect:/list.do";
	}
	
	
	//delete
	@RequestMapping(value = "/delete.do", method = RequestMethod.POST)
	public String deletePOST(LicenseInfoVO licenseInfoVO, RedirectAttributes rttr) throws Exception {
		
		logger.info("delete");
		
		licenseInfoService.deleteLicenseList(licenseInfoVO);
		
		return "redirect:/list.do";
	}
	
	

}
