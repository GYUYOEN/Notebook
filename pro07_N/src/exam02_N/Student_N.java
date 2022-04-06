package exam02_N;

public class Student_N extends Person_N {
	private int classLevel; // 학년
	private int classRoom;	// 반
	
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
	
	// 학년, 반이 나오게 하기위해서 해줌
	@Override
	public String toString() {
//		return super.toString() + " | " + getClassLevel() + " | " + getClassRoom();
		return "Student [name=" + getName() + ", gender=" + getGender() + ", age=" + getAge()
				+ ", classLevel=" + classLevel + ", classRoom=" + classRoom + "]";
	}
}
