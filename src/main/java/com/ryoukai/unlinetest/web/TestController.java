package com.ryoukai.unlinetest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ryoukai.unlinetest.dto.PageDataGridResult;
import com.ryoukai.unlinetest.dto.TestPaperInfo;
import com.ryoukai.unlinetest.service.TestService;

/**
 * 显示试题列表Controller
 * @author Ryoukai
 *
 */
@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/testlist",method=RequestMethod.POST)
	@ResponseBody
	public PageDataGridResult showAllTest(Integer pageNumber, Integer pageSize) {
		PageDataGridResult result = testService.showAllTestInfo(pageNumber, pageSize);
		return result;
	}
	
	@RequestMapping(value="/showtest",method=RequestMethod.POST)
	@ResponseBody
	public TestPaperInfo showTest(Integer testId) {
		TestPaperInfo testPaperInfo = testService.showTestById(testId);
		return testPaperInfo;
	}
}
