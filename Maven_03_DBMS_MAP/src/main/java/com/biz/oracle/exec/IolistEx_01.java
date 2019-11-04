package com.biz.oracle.exec;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.biz.oracle.config.DBConnection;
import com.biz.oracle.dao.IolistDao;

public class IolistEx_01 {

	public static void main(String[] args) {

		SqlSession sqlSession = DBConnection
				.getSqlSessionFactory()
				.openSession(true);
		IolistDao iolistDao = sqlSession.getMapper(IolistDao.class);
		
		
		
	}

}
