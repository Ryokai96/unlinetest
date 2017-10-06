package com.ryoukai.unlinetest.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ryoukai.unlinetest.constant.UserLoginConstant;
import com.ryoukai.unlinetest.dto.UserLoginInfo;
import com.ryoukai.unlinetest.pojo.User;
import com.ryoukai.unlinetest.service.LoginService;


@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/**
	 * 用户登录
	 * @param user 用户登录所填信息
	 * @param session session
	 * @param model model
	 * @return 首页
	 */
	@RequestMapping(value="/userlogin",method=RequestMethod.POST)
	public String userLogin(User user, HttpSession session, Model model) {
		UserLoginInfo userLoginInfo = loginService.userLogin(user);
		if(userLoginInfo.getLoginState() == UserLoginConstant.SUCCESS) {
			session.setAttribute("userLoginInfo", userLoginInfo);
		}
		else {
			model.addAttribute("message", userLoginInfo.getLoginStateInfo());
		}
		return "redirect:/index";
	}
}
