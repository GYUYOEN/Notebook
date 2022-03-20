package exam09_N;

public class Circle_N {
	public final static double PI = 3.14;
	// public double radius;
	private double radius;
	// 5
	private double area;
	private double round;
	
	// 4
	public Circle_N() {}
	
	public Circle_N(double radius) { // 3
		setRadius(radius);
	}
	// public double area(double radius) { // 1
	//  	return radius * radius * PI;
	// }
	
	// private 를 사용 하여 간접 접근 하고 싶을 때
	// setter
	public void setRadius(double radius) {
		this.radius = radius;
		// 5
		_area();
		_round();
	}
	// getter
	public double getRadius() {
		return radius;
	}
	// getter 5
	public double getArea() {
		return area;
	}
	// getter 5
	public double getRound() {
		return round;
	}
	
	private void _area() {
		this.area = radius * radius * PI;
	}
	
	private void _round() {
		this.round = 2 * PI * radius;
	}
}
