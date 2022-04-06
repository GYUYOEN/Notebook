package exam08_N;

// 추상 클래스를 상속한 자식 들은 추상 클래스에 있는 추상 메서드를 구현해야함
// 안그러면 오류뜸
public class Circle_N extends Shape_N{

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getRound() {
		return 0;
	}

}
