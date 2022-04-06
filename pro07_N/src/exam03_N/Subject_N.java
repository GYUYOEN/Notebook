package exam03_N;

// 상속 x
public class Subject_N {
	// 과목 정보를 가지는 객체
	private String name;
	// 과목에는 Grade 를 포함시킨다.
	private Grade_N grade;
	
	public Subject_N(String name) {
		this.name = name;
	}
	
	public Subject_N(String name, double point) {
		this.name = name;
		this.grade = new Grade_N(point); // 매개변수 생성자를 만들어 줘야함
//		grade.setPoint(point);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade_N getGrade() {
		return grade;
	}

	public void setGrade(Grade_N grade) {
		this.grade = grade;
	}
	
}
