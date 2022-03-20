package exam07_N;

public class Sample01_N {

	public static void main(String[] args) {
		// int y;
		// System.out.println(y); // 오류 -> 지역변수는 초기화 필수

		Initialize_N init = new Initialize_N();
		
		System.out.println("JVM 초기값 : " + init.num1 + "," + Initialize_N.name1); // JVM 기본값 생성	
		System.out.println("명시적 초기값 : " + init.num2 + "," + Initialize_N.name2); // 명시적 초기값	
		System.out.println("초기화 블럭 : " + init.num3 + "," + Initialize_N.name3); // 클래스 초기화 블록 초기값
		
		Constructor_N con1 = new Constructor_N(10); // 1. 10 -> 매개변수에 전달(int num1) 	3. con1에 객체 생성
		System.out.println(con1.num1);
		
		Constructor_N con2 = new Constructor_N(20); // ()에서 초기화 설정 가능
		System.out.println(con2.num1);
		
		Constructor_N con3 = new Constructor_N(); // 기본 생성자 없는 경우 오류
		System.out.println(con3.num1);
		
		Constructor_N con4 = new Constructor_N(1);
		
		// Constructor_N con4 = new Constructor_N(30000L);
		
		// byte b = 10;
		// Constructor_N con4 = new Constructor_N(10);
		
		// char c = 65;
		// Constructor_N con4 = new Constructor_N(c);
		
		Constructor_N con5 = new Constructor_N(10);
		Constructor_N con6 = new Constructor_N(10, 20);
		Constructor_N con7 = new Constructor_N(10, 20, 30);
		Constructor_N con8 = new Constructor_N(10, 20, 30, 40);

	}

}
