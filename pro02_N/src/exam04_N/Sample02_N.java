package exam04_N;

public class Sample02_N {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * +, -, *, /(나누기), %(나머지)
		 */
		int num1, num2;
		num1 = 10;
		num2 = 3;
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %f\n", num1, num2, (double)num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2); // % 기호가 중복되므로 이스케이프 사용 -> %%
		
		/*
		 * 비교 연산자 (질문)
		 * ==(같다), !=(다르다), <(왼쪽 피연산자 값이 작다), >(왼쪽 피연산자 값이 크다)
		 * <=(왼쪽 피연산자 값이 작거나 같다), >=(왼쪽 피연산자 값이 크거나 같다)
		 * 비교 연산의 결과는 true 또는 false 의 논리 값이다.
		 */
		num2 = 10;
		System.out.printf("%d == %d -> %b\n", num1, num2, num1 == num2);
		System.out.printf("%d != %d -> %b\n", num1, num2, num1 != num2);
		System.out.printf("%d < %d -> %b\n", num1, num2, num1 < num2);
		System.out.printf("%d > %d -> %b\n", num1, num2, num1 > num2);
		System.out.printf("%d <= %d -> %b\n", num1, num2, num1 <= num2);
		System.out.printf("%d >= %d -> %b\n", num1, num2, num1 >= num2);
		
		/*
		 * 논리 연산자
		 * &&(and 연산), ||(or 연산)
		 * true, false 논리 값을 가지고 연산을 수행해야 한다.
		 */
		System.out.printf("%b && %b -> %b\n", true, true, true && true); // 둘다 true 일 때만 true
		System.out.printf("%b && %b -> %b\n", true, false, true && false); // 하나만 false 이면 false
		System.out.printf("%b && %b -> %b\n", false, true, false && true);
		System.out.printf("%b && %b -> %b\n", false, false, false && false);
		
		System.out.printf("%b || %b -> %b\n", true, true, true || true); // 둘디 false 일 때민 false
		System.out.printf("%b || %b -> %b\n", true, false, true || false); // 하나만 true 이면 true
		System.out.printf("%b || %b -> %b\n", false, true, false || true);
		System.out.printf("%b || %b -> %b\n", false, false, false || false);
	}

}
