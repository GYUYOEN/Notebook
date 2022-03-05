package exam02_N1;

// 자바의 기본 기능 외의 추가 기능을 사용하기 위해 작성을 하는 구문
import java.util.*;

public class Sample02_N1 {
	// 멤버 변수
	private int number = 0;
	private String name = "hyun";
//  접근제한자 변수타입  변수명    변수값
	
	// 생성자 : 클래스명과 동일한 이름을 사용하는 메서드를 생성자라고 한다. 생성자는 리턴 타입이 없다.(ex) void)
	// 자바에서는 클래스를 사용할 때 반드시 객체로 생성하여 사용해야한다. 이 때 객체를 생성할 때 필요한 것이 생성자이다.
	public Sample02_N1( ) {
		// 현재 이 생성자는 기본생성자로 클래스에 작성을 하지 않아도 기본적으로 생성되어 사용됨.
		// JVM에서는 기본적인 거라 생성자를 만들지 않아도 있는걸로 만들어줌
		// 우리는 이 생성자가 없으면 안된다고 생각하고 있어야됨.
	}
	
	// 멤버 메서드
	public void method() {
		// 프로그램 동작을 위한 실행 코드가 이곳에 정의된다.
		
		// 지역 변수 : 특정 지역안에서만 사용되는 변수. 
		// main에서는 지역 변수에서 지정한 변수 사용 불가능.(중괄호가 다르기 때문, 지역이 다르기 때문)
		int i = 0;
		Srting s = "문자열";
	}
	
	// 메인 메서드(함수) : 자바 프로그램에서 프로그램을 실행하기 위한 시작점으로 사용
	public static void main(String[] args) {
		// 한 줄 주석 : 코드로 실핼하지 않는 문장
		/*
		 * 문장 주석 : 코드로 실행하지 않는 문장
		 * 이 형식의 주석은 여러 줄 작성할 수 있다.
		 */

	}

}