package com.biz.oracle.exec;

import java.util.Map;
import java.util.Set;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncEx_04 {

	public static void main(String[] args) {

		// OS의 환경변수값을 가져와서 Map에 저장하기
		Map<String,String> systemENV = System.getenv();
		Set<String> keys = systemENV.keySet();
		for(String s : keys) {
			
			System.out.printf("%s = %s \n",s,systemENV.get(s));
		}
				
		
		
		
		
		String user = "";
		String password = "";
		
		String encUser = "+Pa1TFtKrqy1zTXgEz1BGQ==";
		String encPassword = "XJTm/4OS6fP++GJ9TeRzSQ==";
		
		// salt값을 외부에 노출하지 않기 위해서
		// system(OS)의 환경변수중 일부 값을 가져와서 사용하기
		String salt = systemENV.get("USERNAME");
		
		//String encUser = "+Pa1TFtKrqy1zTXgEz1BGQ==";
		//String encPassword = "XJTm/4OS6fP++GJ9TeRzSQ==";
		
		user = pb
		
		// 문자열을 암호화 시키기 위한 클래스
	      StandardPBEStringEncryptor pbEnc 
	            = new StandardPBEStringEncryptor();
	      
	      // 암호화 타입
	      // MD5 또는 DE5형식의 암호화 타입
	      // 가장 쉽게 접근할수 있는 암호화 타입
	      // jasypt만으로 암호화 시키는 방법
	      String encType = "PBEWithMD5AndDES";
	      
	      // MD5,DES방식으로 암호화를 하고 Key값으로 salt 문자열을
	      // 사용하라
	      pbEnc.setAlgorithm(encType);
	      pbEnc.setPassword(salt);
	      user = pbEnc.decrypt(encUser);
	      password = pbEnc.decrypt(encPassword);
	      
	      System.out.printf("%s -> %s\n", encUser, user);
	      System.out.printf("%s -> %s\n", encPassword, password);
		
	      /*
	       * iolist2 -> +Pa1TFtKrqy1zTXgEz1BGQ==
		   * iolist2 -> XJTm/4OS6fP++GJ9TeRzSQ==
		   *
	       */
	}

}
