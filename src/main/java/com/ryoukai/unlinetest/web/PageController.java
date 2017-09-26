package com.ryoukai.unlinetest.web;

import org.springframework.stereotype.Controller;
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
}
