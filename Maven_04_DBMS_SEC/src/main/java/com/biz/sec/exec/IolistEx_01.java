package com.biz.sec.exec;

import com.biz.sec.config.DBConnectionSEC;
import com.biz.sec.service.IolistService;

public class IolistEx_01 {

	public static void main(String[] args) {

		// mybatis - config.xml, DBConn* 클래스, iolist-mapper.xml 테스트코드
		DBConnectionSEC.getInstance().openSession(true);
		System.out.println("Text OK!!!");
		
		IolistService is = new IolistService();
		is.viewIoList();
		
	}

}
