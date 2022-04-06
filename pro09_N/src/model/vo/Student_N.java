package model.vo;

// 학생 정보를 가지는 클래스
public class Student_N {
	/*
	 * 이름(name)과 성적배열(Grade) 를 정의
	 * getter/setter 도 작성
	 */
	
	private String name;
	private Grade_N[] grades;
	
	public Student_N(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade_N[] getGrades() {
		return grades;
	}

	public void setGrades(Grade_N[] grades) {
		this.grades = grades;
	}
	
	
}
