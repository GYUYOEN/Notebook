package exam10_N;

public class Main_N {

	public static void main(String[] args) {
		/*
		 * 계산기(Calculator) 클래스
		 * 		- 기본 사칙연산을 수행할 수 있다.
		 * 
		 * 공학용 계산기 클래스
		 * 		- 기본 사칙연산을 수행할 수 있다.
		 * 		- 나머지 계산, 제곱 계산, 절대값 계산을 수행할 수 있다.
		 * 
		 * 프로그래머용 계산기 클래스
		 * 		- 기본 사칙연산을 수행할 수 있다.
		 * 		- 2진수, 8진수, 16진수 계산을 수행할 수 있다.
		 * 
		 * 실제 로직 구현은 신경안써도 됩니다.
		 * 추상 클래스, 인터ㅔ이스에 대한 개념에 맞추어 작업하면 됩니다.	
		 */
		
		Operator_N op1 = new Calculator_N();
		
		System.out.println(op1.add(4, 2));
		System.out.println(op1.sub(4, 2));
		System.out.println(op1.mul(4, 2));
		System.out.println(op1.div(4, 2));
		
		// ======================================
		
		Operator_N op2 = new EngineerCalc_N();
		
		System.out.println(op2.add(4, 2));
		System.out.println(op2.sub(4, 2));
		System.out.println(op2.mul(4, 2));
		System.out.println(op2.div(4, 2));
		
		Engineer_N eng = (Engineer_N)op2;
		System.out.println(eng.mod(4, 2));
		System.out.println(eng.sqrd(4, 2));
		System.out.println(eng.abs(-4));
		
		// ======================================
		
		Operator_N op3 = new ProgrammerCalc_N();
		
		System.out.println(op2.add(4, 2));
		System.out.println(op2.sub(4, 2));
		System.out.println(op2.mul(4, 2));
		System.out.println(op2.div(4, 2));
		
		Programmer_N pro = (Programmer_N)op3;
		
		System.out.println(pro.binary(100));
		System.out.println(pro.octal(100));
		System.out.println(pro.hexa(100));
		
	}
}
