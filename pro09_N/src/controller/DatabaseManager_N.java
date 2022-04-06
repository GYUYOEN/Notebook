package controller;

import model.vo.Grade_N;
import model.vo.Student_N;

// 여기 있는 메서드들을 MenuManager_N 에서 사용
public class DatabaseManager_N implements ImplDatabaseManager_N {
	
	private Student_N[] datas;
	
	// 초기화 블럭
	{
		datas = new Student_N[5];
		datas[0] = new Student_N("홍길동");	datas[1] = new Student_N("김도원");
		datas[2] = new Student_N("박수아");	datas[3] = new Student_N("최종희");
		datas[4] = new Student_N("이정우");
		
		for(int i = 0; i < datas.length; i++) {
			datas[0].setGrades(new Grade_N[] {
					new Grade_N("국어"), new Grade_N("영어"), new Grade_N("수학"), new Grade_N("과학")
			});
		}
	}

	@Override
	// 학생 이름 가지고 모든 성적 정보 반환
	public Grade_N[] search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// 학생 이름이 주어지면 정보 추가
	public boolean add(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	// 특정 학생의 특정 과목에 대한 점수 수정
	public Student_N modify(String name, String subject, int score) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// 학생 이름 지정해주면 그 학생에 대한 정보 삭제
	public boolean remove(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	// 학생 정보를 추가, 수정, 삭제할 수 있는 기능이 정의되어 있는 매니저 클래스
}
