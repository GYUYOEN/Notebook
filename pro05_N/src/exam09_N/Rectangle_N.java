package exam09_N;

public class Rectangle_N {
	
	public double area(double width) {
		return width * width;
	}
	
	public double area(double width, double height) {
		return width * height;
	}
	
	public double round(double width, double height) {
		double result;
		result = 2 * (width + height);
		return result;
	}

}
