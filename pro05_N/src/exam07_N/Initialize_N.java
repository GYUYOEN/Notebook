package exam07_N;

public class Initialize_N { // 멤버변수는 기본값으로 초기화
	public int num1; // JVM 기본값 생성
	public static String name1;
	
	public int num2 = 10; // 명시적 초기값
	public static String name2 = "java";
	
	public int num3 = 20;
	public static String name3 = "programming"; // 클래스 초기화 블록 초기값
	
	{ 
		num3 = num3 + 10; // 인스턴스 초기화 블럭
		name3 = name3 + " " + name3; // 인스턴스 초기화 블럭에는 static 변수 넣어도 상관없음 
	}
	
	static { 
		// num3 = num3 + 10; // -> 오류 : the non-static field num3 : static이 아님
		name3 = name3 + " " + name3; } // static 초기화 블럭
	}
