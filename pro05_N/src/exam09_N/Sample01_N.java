package exam09_N;

public class Sample01_N {

	public static void main(String[] args) {
		/*
		 * Circle 클래스, Rectangle 클래스, Triangle 클래스를 만든다.
		 * 
		 * 1. 위의 만들어진 클래스를 이용하여 각 도형의 넓이를 구하기 위한 메서드를
		 *    만들어 본다. (메서드명은 area 로 한다.)
		 * 
		 * 2. 위의 만들어진 클래스를 이용하여 각 도형의 둘레를 구하기 위한 메서드를
		 *    만들어 본다. (메서드명은 round 로 한다.)
		 *    Triangle 은 정삼각형으로 취급해서 둘레를 구한다.
		 */
		
		Circle_N c1 = new Circle_N(3); // 2
		// Circle_N c = new Circle_N(); // 1, 2
		// c1.radius = 3; // 2
		
		// double area = c.area(3); // 1
		// double area = c1.area();
		System.out.println("반지름이 3 인 원의 넓이 : " + c1.getArea());
		
		// double round = c1.round();
		System.out.println("반지름이 3 인 원의 둘레 : " + c1.getRound());
		
		// 4 : 반지름을 나중에 설정 하고 싶을 떄
		Circle_N c2 = new Circle_N();
		// c2.radius = 5; // 4
		c2.setRadius(5);
		
		// area = c2.area();
		// double area = c2.area();
		System.out.println("반지름이 3 인 원의 넓이 : " + c2.getArea());
		
		// round = c2.round();
		// double round = c2.round();
		System.out.println("반지름이 3 인 원의 둘레 : " + c2.getRound());
		
		// 멤버 변수에 저장되어 있는 값을 확인 하기 위하여 getter
		System.out.println("반지름 : " + c2.getRadius());
		
		c2.setRadius(7);
		System.out.println("반지름이 7 인 원의 넓이 : " + c2.getArea());
		System.out.println("반지름이 7 인 원의 둘레 : " + c2.getRound());
		System.out.println("반지름 : " + c2.getRadius());
	}

}
