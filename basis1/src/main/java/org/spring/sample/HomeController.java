package org.spring.sample;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.sample.dto.MemberVO;
import org.spring.sample.service.MemberService;
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
	
	@Inject
    private MemberService service;
    
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String home(Locale locale, Model model) throws Exception{
	 
	        logger.info("home");
	        
	        List<MemberVO> memberList = service.selectMember();
	        
	        model.addAttribute("memberList", memberList);
	 
	        return "home";
	    }

	
}
