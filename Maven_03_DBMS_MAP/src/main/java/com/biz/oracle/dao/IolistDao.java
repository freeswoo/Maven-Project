package com.biz.oracle.dao;

import java.util.List;
import java.util.Map;

public interface IolistDao {

	// List<DTO> selectAll()
	// resultMap으로 설정된 형태는
	// Map<String,Object> 형식의 DTO가 만들어 진것으로 본다.
	public List<Map<String,Object>> selectAll();
	
	
}
