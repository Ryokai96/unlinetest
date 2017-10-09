package com.ryoukai.unlinetest.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ryoukai.unlinetest.dto.RegisterInfo;
import com.ryoukai.unlinetest.pojo.User;
import com.ryoukai.unlinetest.service.RegisterService;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="/userregister",method=RequestMethod.POST)
	@ResponseBody
	public RegisterInfo userRegister(User user, HttpSession session) {
		RegisterInfo registerInfo = registerService.userRegister(user);
		//在session里保存信息
		session.setAttribute("username", user.getUsername());
		session.setAttribute("registerInfo", registerInfo);
		return registerInfo;
	}
}
