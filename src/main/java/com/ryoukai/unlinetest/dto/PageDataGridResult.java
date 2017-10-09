package com.ryoukai.unlinetest.dto;

import java.util.List;

/**
 * 需分页传送的数据封装
 * @author Ryoukai
 *
 */
public class PageDataGridResult {
	
	/**
	 * 数据总条数
	 */
	private long total;
	/**
	 * 每页显示的数据
	 */
	private List<?> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
