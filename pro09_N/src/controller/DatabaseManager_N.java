package controller;

import java.util.Arrays;

import model.vo.Grade_N;
import model.vo.Student_N;
import model.vo.Teacher_N;

// 여기 있는 메서드들을 MenuManager_N 에서 사용
public class DatabaseManager_N implements ImplDatabaseManager_N {
	// 학생 정보를 추가, 수정, 삭제할 수 있는 기능이 정의되어 있는 매니저 클래스
	
	private Student_N[] datas;
	
	// 초기화 블럭
	{
		datas = new Student_N[5];
		datas[0] = new Student_N("홍길동");	datas[1] = new Student_N("김도원");
		datas[2] = new Student_N("박수아");	datas[3] = new Student_N("최종희");
		datas[4] = new Student_N("이정우");
		
		for(int i = 0; i < datas.length; i++) {
			datas[i].setGrades(new Grade_N[] {
					new Grade_N("국어"), new Grade_N("영어"), new Grade_N("수학"), new Grade_N("과학")
			});
		}
	}

	@Override
	// 학생 이름 가지고 모든 성적 정보 반환
	public Grade_N[] search(String name) {
		int idx = _findIndex(name);
		if(idx == -1) {
			return null;
		}
		return datas[idx].getGrades();
	}

	@Override
	// 학생 이름이 주어지면 정보 추가
	public boolean add(String name) {
		if(isExisted(name)) {
			return false;
		}
		
		datas = Arrays.copyOf(datas, datas.length + 1);
		datas[datas.length - 1] = new Student_N(name);
		datas[datas.length - 1].setGrades(_initGrade());
		return true;
	}

	private Grade_N[] _initGrade() {
		Grade_N[] gArr = new Grade_N[] {
				new Grade_N("국어"), new Grade_N("영어"), new Grade_N("수학"), new Grade_N("과학")
		};
		return gArr;
	}

	@Override
	// 특정 학생의 특정 과목에 대한 점수 수정
	public Student_N modify(String name, String subject, int score) {
		int idx = _findIndex(name);
		Grade_N[] grades = datas[idx].getGrades();
		for(int i = 0; i < grades.length; i++) {
			if(subject.equals(grades[i].getName())) {
				grades[i].setScore(score);
				return datas[idx];
			}
		}
		return null;
	}

	@Override
	// 학생 이름 지정해주면 그 학생에 대한 정보 삭제
	public boolean remove(String name) {
		int idx = _findIndex(name);
		
		if(idx == -1) {
			return false;
		}
		Student_N[] temp = new Student_N[datas.length - 1];
		System.arraycopy(datas, 0, temp, 0, idx);
		System.arraycopy(datas, idx + 1, temp, idx, datas.length - (idx + 1));
		
		return true;
	}
	
	public Student_N getStudent(String name) {
		return datas[_findIndex(name)];
	}
	
	
	public boolean isExisted(String name) {
		return _isExisted(name);
	}
	
	private boolean _isExisted(String name) {
		return _findIndex(name) != -1 ? true : false;
	}
	
	private int _findIndex(String name) {
		int idx = -1;
		
		for(int i = 0; i < datas.length; i++) {
			if(name.equals(datas[i].getName())) {
				idx = i;
				return idx;
			}
		}
		return idx;
	}
	
	public Student_N login(String name, String password) {
		for(int i = 0; i < datas.length; i++) {
			if(name.equals(datas[i].getName()) && password.equals(datas[i].getPassword())) {
				return datas[i];
			}
		}
		return null;
	}

}
