package exam05_N;

public class Student_N extends Person_N {
	private int classLevel;
	private int classRoom;
	
	public Student_N(String name, int age) {
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
	
}
