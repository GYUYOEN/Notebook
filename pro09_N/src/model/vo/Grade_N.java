package model.vo;

// 과목에 대한 성적 정보를 가지는 클래스
public class Grade_N extends Subject_N {
	/*
	 * 점수(score)와 등급(level)을 정의
	 * getter/setter 도 작성
	 */
	private double score;
	private char level;
	
	public Grade_N(String name) {
		super(name);
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
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
