package exam08_N;

public class Main_N {

	public static void main(String[] args) {
		/*
		 * 추상 클래스
		 *     - 몸체 없는 메서드(추상 메서드)를 포함하는 클래스, abstract 키워드를 사용해서 만든다.
		 *     - 미완성된 클래스(추상 클래스)를 만들어서 이를 상속하는 자식 클래스들이 미완성된
		 *       부분을 완성할 수 있게 강제시키기 위한 용도로 사용.
		 *     - 추상 클래스를 상속하는 모든 자식들은 미완성된 부분을 완성해야 하기 때문에 일관성이 높아진다.(일관성이 높은 매서드명 활용)
		 *     - 추상 클래스를 사용하여 객체를 직접 생성할 수는 없다.
		 *       (단, 참조 타입으로는 사용할 수 있다.)
		 *       
		 *       자식 기능이 비슷/동일 -> 부모에 적어줌
		 *       완전히 동일할 경우 추상하지 말고 그냥 부모클래스에 적어줌
		 *       정해진 틀안에서 작성 가능
		 */
		// 부모가지고는 만들지 말고 자식가지고만 만들라
		// Shape_N s = new Shape_N(); // -> 오류

		Shape_N s1 = new Circle_N();
		Shape_N s2 = new Square_N();
		Shape_N s3 = new Triangle_N();
	}

}
