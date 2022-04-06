package exam06_N;

public class Grade_N {
	/*
	 * 과목에 대한 성적 점수 정보를 가지는 객체
	 */
	
	private String name;
	private double score;
	
	public Grade_N(String name) {
		this.name = name;
		this.score = 0.0;
	}
	
	public Grade_N(String name, double score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
}
