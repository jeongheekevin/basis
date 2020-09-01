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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
    private MemberService service;
	
	@Autowired
	private LicenseInfoService licenseInfoService;
    
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String home(Locale locale, Model model) throws Exception{
	 
	        logger.info("home");
	        List<MemberVO> memberList = service.selectMember();
	        model.addAttribute("memberList", memberList);
	        return "home";
	    }
	 

		@RequestMapping(value = "/tables.do", method = RequestMethod.GET)
		public String tables(Locale locale, Model model) throws Exception {
			  logger.info("tables");
			  List<MemberVO> memberList = service.selectMember();
		      model.addAttribute("memberList", memberList);
		      
		      List<LicenseInfoVO> licenseInfoList = licenseInfoService.selectLicenseList();
			  model.addAttribute("licenseInfoList", licenseInfoList);
			  
			return "tables";
		}
		
		@RequestMapping(value = "/index.do", method = RequestMethod.GET)
		public String index() {
			return "index";
		}
		
	
		@RequestMapping(value = "/dropdown.do", method = RequestMethod.GET)
		public String dropdown(Locale locale, Model model) throws Exception {
			
			List<LicenseInfoVO> licenseInfoList = licenseInfoService.selectLicenseList();
		    model.addAttribute("licenseInfoList", licenseInfoList);
		     
			
			return "dropdown";
		}
		
		@RequestMapping(value = "/insertPage.do", method = RequestMethod.GET)
		public String insertPage(Locale locale, Model model) throws Exception {
			
			List<LicenseInfoVO> licenseInfoList = licenseInfoService.selectLicenseList();
		    model.addAttribute("licenseInfoList", licenseInfoList);
		     
			
			return "insertPage";
		}
		
}
