package com.ryoukai.unlinetest.web.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录验证拦截器
 * @author Ryoukai
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	//Handler执行完成之后调用
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exc)
			throws Exception {
		
	}
	
	//Handler执行之后，ModelAndView返回之前调用这个方法
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
	}

	//Handler执行之前调用这个方法
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//获取请求的url
		String url = request.getRequestURI();
		
		//login.jsp可以直接访问，其他url都进行拦截控制
		if(url.indexOf("login.action") >= 0) {
			return true;
		}
		
		//获取session
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		if(username != null) {
			return true;
		}
		
		//不符合条件的，跳转到登录界面
		request.getRequestDispatcher("/WEB-INF/jsp/login/login.jsp").forward(request, response);
		return false;
	}

}
