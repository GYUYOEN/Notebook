package model.vo;

/*
 * 점수를 수정하면 수정한 점수의 등급이 자동 설정되도록 한다.
 * 새롭개 추가한 학생의 모든 과목의 등급은 F로 설정되도록 한다.
 * 
 * A : 100 ~ 90 이상
 * B : 90 미만 80 이상
 * C : 80 미만 70 이상
 * D : 70 미만 60 이상
 * E : 60 미만 40 이상
 * F : 40 미만
 * 
 * 성적 정보를 수정할 때 학생 이름을 입력하면 해당 학생의 
 * 성적을 출력 하고 출력된 과목명을 순서대로 한번에 점수를 모두 입력받아서
 * 저장할 수 있게 코드 수정...
 */

// 과목에 대한 성적 정보를 가지는 클래스
public class Grade_N extends Subject_N {
	/*
	 * 점수(score)와 등급(level)을 정의
	 * getter/setter 도 작성
	 */
	private double score;
	private char level;
	private char[] levelArr = new char[] {
			'F', 'F', 'F', 'F', 'E', 'E', 'D', 'C', 'B', 'A'
	};
	
	public Grade_N(String name) {
		super(name);
		this.level = 'F';
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
		this.level = levelArr[(int)(score / 10)];
		
//		if(score <= 100 && score >= 90) {
//			this.level = 'A';
//		} else if(score < 90 && score >= 80) {
//			this.level = 'B';
//		} else if(score < 80 && score >= 70) {
//			this.level = 'C';
//		} else if(score < 70 && score >= 60) {
//			this.level = 'D';
//		} else if(score < 60 && score >= 40) {
//			this.level = 'E';
//		} else if(score < 40 && score >= 0) {
//			this.level = 'F';
//		}
	}
	
	public char getLevel() {
		return level;
	}
	
	public void setLevel(char level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Grade_N [name=" + getName() + ", score=" + score + ", level=" + level + "]";
	}
	
	
}
