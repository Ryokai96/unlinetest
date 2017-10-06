package com.ryoukai.unlinetest.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	@RequestMapping(value="/userregister")
	public String login(HttpSession session, String username, String password) {
		//在session里保存信息
		session.setAttribute("username", username);
		//重定向
		return "redirect:hello.action";
	}
}
