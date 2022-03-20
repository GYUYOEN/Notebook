package exam03.pack2_N;

import exam03.pack1_N.AccessMain_N;

public class AccessTest2_N {
	// 다른 클래스, 다른 패키지에서 AccessMain_N 클래스의 멤버 변수에 접근
	public static void main(String[] args) {
			AccessMain_N m1 = new AccessMain_N();
			// 전체(외부)
			System.out.println(m1.v1); // public 가능
			System.out.println(m1.v2); // protected 불가능
			System.out.println(m1.v3); // default 불가능
			System.out.println(m1.v4); // private 불가눙
	}
}
