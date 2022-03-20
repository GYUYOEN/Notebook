package exam03.pack1_N;

// AccessMain_N : 자손
// extends Accessparent_N : 부모
// 상속 같은 패키지
public class AccessMain_N extends AccessParent_N { 
	public int v1;
	protected int v2;
	int v3;
	private int v4;
	
	public void method101() {
		// 해당 클래스 내부에 있는 멤버 변수에 접긎
		System.out.println(v1); // public 가능
		System.out.println(v2); // protected 가능
		System.out.println(v3); // default 가능
		System.out.println(v4); // private 가능
	}
	
	public void method02() {
		// 다른 클래스, 같은 패키지 그라고 후손
		System.out.println(p1); // public 가능 
		System.out.println(p2); // protected 가능
		System.out.println(p3); // default 후손에는 해당 안되지만 같은 패키지라서 가능 
		System.out.println(p4); // private 불가능

	}
}
