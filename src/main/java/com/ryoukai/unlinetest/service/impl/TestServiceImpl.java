package com.ryoukai.unlinetest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ryoukai.unlinetest.dto.PageDataGridResult;
import com.ryoukai.unlinetest.dto.TestInfo;
import com.ryoukai.unlinetest.dto.TestPaperInfo;
import com.ryoukai.unlinetest.dto.UserInfo;
import com.ryoukai.unlinetest.mapper.SolutionMapper;
import com.ryoukai.unlinetest.mapper.TestMapper;
import com.ryoukai.unlinetest.pojo.Solution;
import com.ryoukai.unlinetest.pojo.SolutionExample;
import com.ryoukai.unlinetest.pojo.Test;
import com.ryoukai.unlinetest.pojo.TestExample;
import com.ryoukai.unlinetest.pojo.User;
import com.ryoukai.unlinetest.service.TestService;
import com.ryoukai.unlinetest.service.UserService;
import com.ryoukai.unlinetest.util.TestOperate;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper testMapper;
	
	@Autowired
	private SolutionMapper solutionMapper;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 展示所有试卷信息
	 */
	public PageDataGridResult showAllTestInfo(int pageNumber, int pageSize) {
		//分页处理
		PageHelper.startPage(pageNumber, pageSize);
		//执行查询
		TestExample testExample = new TestExample();
		List<Test> testList = testMapper.selectByExample(testExample);
		//转换为TestInfo
		List<TestInfo> testInfos = new ArrayList<TestInfo>();
		for(Test test : testList) {
			TestInfo testInfo = new TestInfo();
			testInfo.setTestId(test.getTestId());
			testInfo.setTestDesc(test.getTestDesc());
			testInfo.setTestType(test.getTestType());
			UserInfo userInfo = new UserInfo();
			userInfo.setUserId(test.getUploaderId());
			//获取上传者信息
			User user = userService.getUserInfoById(test.getUploaderId());
			userInfo.setUsername(user.getUsername());
			userInfo.setUserType(user.getUserType());
			userInfo.setState(user.getState());
			testInfo.setUploader(userInfo);
			testInfos.add(testInfo);
		}
		//取分页信息
		PageInfo<Test> pageInfo = new PageInfo<Test>(testList);
		//返回处理结果
		PageDataGridResult result = new PageDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(testInfos);
		return result;
	}
	
	/**
	 * 获得整张试卷信息
	 */
	public TestPaperInfo showTestById(int testId) {
		//通过TestId查找Test
		TestExample testExample = new TestExample();
		TestExample.Criteria testCriteria = testExample.createCriteria();
		testCriteria.andTestIdEqualTo(testId);
		List<Test> testList = testMapper.selectByExample(testExample);
		Test test = testList.get(0);
		
		//通过TestId查找Solution
		SolutionExample solutionExample = new SolutionExample();
		SolutionExample.Criteria solutionCriteria = solutionExample.createCriteria();
		solutionCriteria.andTestIdEqualTo(testId);
		List<Solution> solutionList = solutionMapper.selectByExample(solutionExample);
		Solution solution = solutionList.get(0);
		
		//读取xml文件转换为TestPaperInfo
		TestPaperInfo testPaperInfo = new TestPaperInfo();
		testPaperInfo.setTestId(testId);
		TestOperate.readTest(System.getProperty("user.dir") + "/" + test.getTestPath().trim(), testPaperInfo);
		TestOperate.readSolution(System.getProperty("user.dir") + "/" + solution.getSolutionPath().trim(), testPaperInfo);
		
		return testPaperInfo;
	}
}
