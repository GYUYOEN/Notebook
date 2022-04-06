package exam02_N;

import java.util.Arrays;

public class ReportGrade_N {
	/*
	 * 요구사항
	 * 		- 점수를 설정 할 때에는 어떤 과목에 대한 점수 인지를 알수 있도록 
	 * 		  setter의 매개변수를 조정하여 사용하도록 한다.
	 * 
	 * 		- 과목 배열의 인덱스와 저수 배열의 인덱스는 서로 동일한 인덱스간에 연계되는 형태이다.
	 * 		  국어 과목의 인덱스가 0번이면 점수는 0번에 저장되어 있는 방식이다.
	 * 
	 * 		- 위에서 제시한 멤버 변수 및 메서드 외에 추가로 필요한 멤버 변수 및 메서드가 있는 경우 추가해도 된다.
	 */
	private String name; // 학생명
	private String[] subjects; // 과목명이 저장되는 멤버변수
	private double[] grades; // 점수가 저장되는 멤버변수
	
	// 학생명이 주어지면 해당 학생의 성적표를 생성하기 위한 생성자
	public ReportGrade_N(String name) {
		this.name = name;
	}
	
	// 학생명과 과목 배열이 주어지면 해당 학생의 성적표를 생성하기 위한 생성자
	public ReportGrade_N(String name, String[] subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public double[] getGrades() {
		return grades;
	}
	
	// 참조만 하고 끝남 : 내가 원하는 것은 특정 과목에 대한 점수 변경
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	// 어떤 과목의 점수를 어떻게 바꿀것이냐
	public void setGrades(String subject, double grade) {
		/*
		 * 과목 배열의 인덱스와 정수 배열의 인덱스는 서로 연관되어 있다.
		 * 과목 배열의 0번 인덱스의 값이 "국어" 이면 국어 과목에 대한 점수는
		 * 점수 배열의 0번 인덱스에 있다.
		 * 
		 * 과목 배열 : {"국어", "영어", "수학", "사회", "체육"}
		 * subject = "수학"; 인덱스 찾기
		 */
		
		int idx = -1; // -1 : "수학"을 못찾았을 때, 지역변수는 초기값 필수
		for(int i = 0; i < this.subjects.length; i++) {
			if(this.subjects[i].equals(subject)) {
				idx = i;
				break;
			}
		}
		this.grades[idx] = grade;
	}
	
	public double getGrade(String subject) {
		int idx = -1;
		for(int i = 0; i < this.subjects.length; i++) {
			if(this.subjects[i].equals(subject)) {
				idx = i;
				break;
			}
		}
		return this.grades[idx];
	}
	
	// 동적배열을 사용하여 새로운 과목과 점수를 추가
	public void addSubject(String subject) {
		// 점수는 0 점으로 추가
		this.addSubject(subject, 0);
	}
	
	public void addSubject(String subject, double grade) {
		// 점수는 grade 값으로 추가
		this.subjects = Arrays.copyOf(this.subjects, this.subjects.length + 1);
		this.grades = Arrays.copyOf(this.grades, this.grades.length + 1);
		
		this.subjects[this.subjects.length - 1] = subject; // 크기는 5, 인덱스 번호는 4, 그러므로 -1
		this.grades[this.grades.length - 1] = grade;
	}
	
	
}
