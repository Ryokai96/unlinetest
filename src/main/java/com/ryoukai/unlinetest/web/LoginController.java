package com.ryoukai.unlinetest.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ryoukai.unlinetest.dto.request.UserLoginRequest;
import com.ryoukai.unlinetest.dto.response.UserLoginInfo;
import com.ryoukai.unlinetest.service.LoginService;


@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/userlogin",method=RequestMethod.POST)
	public String userLogin(@PathVariable UserLoginRequest userLoginRequest, HttpSession session, Model model) {
		UserLoginInfo userLoginInfo = loginService.userLogin(userLoginRequest);
		if(userLoginInfo.getUserId() != null) {
			session.setAttribute("userLoginInfo", userLoginInfo);
		}
		else {
			model.addAttribute("message", userLoginInfo.getStateInfo());
		}
		return "redirect:/index";
	}
}
