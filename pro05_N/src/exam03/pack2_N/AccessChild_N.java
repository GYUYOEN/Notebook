package exam03.pack2_N;

import exam03.pack1_N.AccessParent_N;
//AccessMain_N : 자손
//extends Accessparent_N : 부모
// 상속 다른 패키지
public class AccessChild_N  extends AccessParent_N{
	public void method() {
		// 다른 클래스, 다른 페키지민 후손임
		System.out.println(p1); // public 가능
		System.out.println(p2); // protected 다른 패키지에 있지만 후손 클래스 내라서 가능
		System.out.println(p3); // default 다른 패키지에 있어서 불가능
		System.out.println(p4); // private 불가능
	}
}
