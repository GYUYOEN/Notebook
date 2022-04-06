package exam01_N;

public class Child_N extends Parent_N {
	
	// 부모생성자를 쓸 수 있게 지정해줌 -> 오류 헤결
	public Child_N() {
		super(1);
	}
	
	public void printNumber() {
		setNumber(2);
		System.out.println(getNumber());
	}
	
	// 안해도 상관 없지만 오버라이딩이 가능한 메서드인지 확인시키는 용도로 쓰인다.
	// 오버라이딩은 부모의 기존 기능을 수정하거나 변경할 때 사용한다.
	// super를 통헤 부모의 기능을 덧붙여줌
	// super를 사용안하면 자식에 있는것만 나오고 override를 안쓰면 부모에 있는것만 나옴
	@Override
	public void setNumber(int number) {
		System.out.println("자식의 setNumber 메서드 동작 시작");
		super.setNumber(number);
		System.out.println("자식의 setNumber 메서드 동작 끝");
	}
}
