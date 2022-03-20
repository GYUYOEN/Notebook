package exam07_N;

public class Constructor_N {
	
	public int num1;
	public int num2;
	public int num3;
	public int num4;
	
	// 기본 생성자
	// 매개변수가 있는 생성자가 없는 경우 JVM 이 자동 생성
	// 매개변수가 있는 생성자가 있는 경우 JVM 이 자동 생성하지 않음
	public Constructor_N() {
		
	}
	
	// 매개변수가 있는 생성자
	public Constructor_N(int num1) { // 여기서 num1은 외부로 부터 전달받는 변수
		// 전달받은 먀갸변수 값을 이용하여 초기화
		this.num1 = num1; // 2.  int num1에 전달 받은 값(10)으로 초기화 진행
		// this는 Constructor_N 클래스에 정의가 되있는 num1(자기자신)이라고 알려주기 위해서 사용
		// System.out.println("int");
	}
	
	public Constructor_N(int num1, int num2) {
		this(num1); // this.num1 = num1;
		this.num2 = num2;
	}
	
	public Constructor_N(int num1, int num2, int num3) {
		this(num1, num2); // this.num1 = num1; this.num2 = num2;
		this.num3 = num3;
	}
	
	public Constructor_N(int num1, int num2, int num3, int num4) {
		this(num1, num2, num3); // this.num1 = num1; this.num2 = num2; this.num3 = num3
		this.num4 = num4;
	}
	
	
	
	// 오버로딩 : 같은 클래스 이름 메서드 하나밖에 못만들지만 매개변수의 개수 또는 타입을 다르게 해주면 가능
	// public Constructor_N(int num1, int num2) {
	//  	this.num1 = num1;
	// }
	// public Constructor_N(int num1, String num2) {}
	// public Constructor_N(String num1, int num2) {}
	
	public Constructor_N(byte b) {
		System.out.println("byte");
	}
	
	public Constructor_N(char c) {
		System.out.println("char");
	}
	
	public Constructor_N(short s) {
		System.out.println("short");
	}
	
	public Constructor_N(long l) {
		System.out.println("long");
	}
	
}
