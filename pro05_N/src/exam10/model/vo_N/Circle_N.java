package exam10.model.vo_N;

public class Circle_N {
	private final static double PI = 3.14;
	public int radius = 1;
	
	public Circle_N() {}
	
	public void incrementRadius() {
		// 원 반지름의 크기를 +1 시키는 함수
		radius++;
	}
	
	public void getAreaOfCircle() {
		// 원 넓이를 출력하는 함수
		System.out.println(PI * radius * radius);
	}
	
	public void getSizeOfCircle() {
		// 원 둘레를 출력하는 함수
		System.out.println(2 * PI * radius);
	}
	
	
}
