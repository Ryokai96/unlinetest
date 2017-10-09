package com.ryoukai.unlinetest.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public UserLoginInfo userLogin(User user, HttpSession session, Model model) {
		UserLoginInfo userLoginInfo = loginService.userLogin(user);
		if(userLoginInfo.getLoginState() == UserLoginConstant.SUCCESS) {
			session.setAttribute("username", userLoginInfo.getUser().getUsername());
			session.setAttribute("userLoginInfo", userLoginInfo);
//			return "redirect:/";
		}
//		else {
//			model.addAttribute("message", userLoginInfo.getLoginStateInfo());
//			return "forward:/userloginpage";
//		}
		return userLoginInfo;
	}
}
