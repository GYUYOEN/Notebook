package model.vo;

import java.util.Random;

// 학생 정보를 가지는 클래스
public class Student_N extends Account_N {
	/*
	 * 이름(name)과 성적배열(Grade) 를 정의
	 * getter/setter 도 작성
	 */
	
//	private String name;
	private Grade_N[] grades;
//	private String password;
	
	public Student_N(String name) {
//		this.name = name;
//		this.password = "1111";
		setName(name);
		setPassword("1111");
	}
	
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public Grade_N[] getGrades() {
		return grades;
	}

	public void setGrades(Grade_N[] grades) {
		this.grades = grades;
	}

	@Override
	public String resetPassword() {
		String prefix = "STD_";
		/*
		 * 대소문자 영문자 구분하여 임의로 생성...
		 * ASCII 코드를 활용
		 * 대문자 65 ~ 90, 소문자 97 ~ 122
		 */
		String newPass = super.resetPassword();
		setPassword(prefix + newPass);
		return newPass;
	}
	
	
}
