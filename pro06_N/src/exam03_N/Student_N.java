package exam03_N;

import java.util.Random;

public class Student_N {
	/*
	 * 요구사항
	 * 		- 힉생 객체를 활용하기 위한 클래스를 만들어 본다.
	 * 		- 학생 객체를 사용하여 이름, 나이, 학년, 반, 번호 정보를 다룬다.
	 * 		- 학생의 나이와 학년은 nextYear() 메서드를 사용하여 +1 중가시킬 수 있게 한다.
	 * 		- nextYear() 로 학년이 바뀌면 반 또한 랜덥하게 변경되도록 한다.
	 * 		  반은 1 ~ 9반 사이에서 임의로 바뀌게 한다.
	 * 		- 3학년에서 nextYear() 가 되면, 졸업생으로 만들기 위해 기존의 학년, 반, 번호는 전부 -1로 설정하게 한다.
	 */
	
	private String name;	// 이름
	private int age;		// 나이
	private int classLevel;	// 학년
	private int classRoom;	// 반
	private int classNum;	// 번호
	
	// 처음에 입학한 사람 : 기본새팅
	public Student_N(String name) {
		// this.name = name;
		// this.age = 14;
		// this.classLevel = 1;
		this(name, 14, 1);
	}
	
	// 빠른년생 입학
	public Student_N(String name, int age) {
		// this.name = name;
		// this.age = age;
		// this.classLevel = 1;
		this(name, age, 1);
	}
	
	// 초기값 설정
	public Student_N(String name, int age, int classLevel) {
		this.name = name;
		this.age = age;
		this.classLevel = classLevel;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getClassLevel() {
		return this.classLevel;
	}
	
	public void nextYear() {
		this.age++;
		
		if(this.classLevel == 3) {
			this._graduate();
		} else {
			this.classLevel++;
			this.classRoom = this._assignClassRoom();
			// return 값이 있으므로 this._assignClassRoom()
		}
	}
	
	// 반환할게 있으면 return 변수 사용
	private int _assignClassRoom() {
		Random rand = new Random();
		return rand.nextInt(9) + 1;
	}
	
	// 내부에서만 사용할 거기 때문에 private 사용
	// 반환할게 딱히 없으므로 void 사용
	private void _graduate() {
		this.classLevel = -1; 
		this.classRoom = -1;
		this.classNum = -1;
	}
	
	// std만 사용해서 나오게 하고 싶을때
	public String toString() {
		return String.format("%s(%d): %d 학년 %d 반", this.name, this.age, this.classLevel, this.classRoom);
		// format은 printf에서 f의 약자
		// return this.name + "(" + this.age + "): " + this.classLevel + " 학년 " + this.classRoom + " 반";
	}
}
