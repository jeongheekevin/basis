package org.spring.sample;

import java.util.List;
import java.util.Locale;

import org.spring.sample.dto.LicenseInfoVO;
import org.spring.sample.dto.MemberVO;
import org.spring.sample.service.LicenseInfoService;
import org.spring.sample.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@Autowired
    private MemberService service;
	
	@Autowired
	private LicenseInfoService licenseInfoService;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/license.do", method = RequestMethod.GET)
	public String license(Locale locale, Model model) throws Exception{
		
		
		 List<MemberVO> memberList = service.selectMember();
	     model.addAttribute("memberList", memberList);
	     
	     
	     List<LicenseInfoVO> licenseInfoList = licenseInfoService.selectLicenseList();
	     model.addAttribute("licenseInfoList", licenseInfoList);
	     
		return "T32LicensePage";
	}
	
	@RequestMapping(value = "/body.do", method = RequestMethod.GET)
	public String body(Locale locale, Model model) throws Exception {
		
		 
		 List<MemberVO> memberList = service.selectMember();
	     model.addAttribute("memberList", memberList);
	     
		return "T32BodyPage";
	}
	
}
