package exam03.pack1_N;

public class AccessTest1_N {
	// 다른 클래스, 같은 패키지에서 AccessMain_N  클래스의 멤버 변수에 접근
	public static void main(String[] args) {
		AccessMain_N m1 = new AccessMain_N();
		// 같은 패키지 내
		System.out.println(m1.v1); // public 가능
		System.out.println(m1.v2); // protected 가능
		System.out.println(m1.v3); // default 가능
		System.out.println(m1.v4); // private 불가능
	}
}
