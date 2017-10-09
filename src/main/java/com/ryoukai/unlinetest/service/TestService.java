package com.ryoukai.unlinetest.service;

import com.ryoukai.unlinetest.dto.PageDataGridResult;
import com.ryoukai.unlinetest.dto.TestPaperInfo;

public interface TestService {
	
	/**
	 * 展示所有试卷信息
	 * @param pageNumber 第几页
	 * @param pageSize 每页几条数据
	 * @return 分页后的数据封装
	 */
	public PageDataGridResult showAllTestInfo(int pageNumber, int pageSize);
	
	/**
	 * 获得整张试卷信息
	 * @param testId TestId
	 * @return Test
	 */
	public TestPaperInfo showTestById(int testId);
}
