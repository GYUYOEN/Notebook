package exam05_N;

public class Teacher_N extends Person_N {
	private int classLevel;
	private int classRoom;
	private String subject;
	
	public Teacher_N(String name, int age) {
		super(name, age);
	}

	public int getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
