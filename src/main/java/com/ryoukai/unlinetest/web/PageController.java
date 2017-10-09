package com.ryoukai.unlinetest.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 * @author Ryoukai
 *
 */
@Controller
public class PageController {
	
	@RequestMapping(value="/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping(value="/userloginpage")
	public String showUserLoginPage() {
		return "login/login";
	}
	
	@RequestMapping(value="/writesubject")
	public String showTestPage(Model model, Integer testId) {
		model.addAttribute("testId", testId);
		return "writesubject/writesubject";
	}
	
	@RequestMapping(value="/userregister")
	public String showRegisterPage() {
		return "register/register";
	}
}
