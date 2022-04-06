package exam01_N;

public class Parent_N {
//	public int number = 1;
	// private 사용하면 부모에서만 사용가능(직접 가능 불가능), getter setter 만들어줘서 직접접근 가능
	private int number = 1;
	
	// 오류를 해결하기 위해 기본생성자는 필수지만 상황에 따라 안쓰기도함 -> 이럴 경우 자식 생성자에서 호출해줘야 함
//	public Parent_N() {} 
	
	// 부모에 매개변수 생성자가 있으면 기본 생성자가 자동으로 안만들어짐 -> 자식 클래스에 오류가 뜸
	public Parent_N(int number) {
		this.number = number;
	}
	
	public void setNumber(int number) {
		System.out.println("부모의 setNumber 메서드 동작 시작");
		this.number = number;
		System.out.println("무모의 setNumber 메서드 동작 끝");
	}
	
	public int getNumber() {
		return this.number;
	}
}
