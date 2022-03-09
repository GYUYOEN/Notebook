package exam04_N;

import java.util.Scanner;

public class Sample03_N {

	public static void main(String[] args) {
		/*
		 * Scanner 를 사용하여 사용자 입력을 받는다.
		 * 입력 받은 값에 대해 산술연산, 비교연산을 수행하도록 만든다.
		 */
		
		/*
		 * 출력 형식
		 *      첫 번째 값 입력 : 10
		 *      두 번째 값 입력 : 15
		 *      더하기 계산 결과 : 25
		 *      빼기 계산 결과 : -5
		 *      곱하기 계산 결과 : 150
		 *      나누기 계산 결과 : 0.6667
		 *      나머지 계산 결과 : 10
		 *      
		 * 나누기 계산 결과는 실수값으로 나오게 한다. 그리고 반드시 소수점 4번째 자리까지만 나오게 한다.
		 */
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫 번째 값 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 값 입력 : ");
		num2 = sc.nextInt();
		
		System.out.printf("더하기 계산 결과 : %d\n", num1 + num2);
		System.out.printf("빼기 계산 결과 : %d\n", num1 - num2);
		System.out.printf("곱하기 계산 결과 : %d\n", num1 * num2);
		System.out.printf("나누기 계산 결과 : %.4f\n", (double)num1 / num2);
		System.out.printf("나머지 계산 결과 : %d\n", num1 % num2);
		
		// 강사님이 하신 것
		int n1, n2, r1, r2, r3, r5; // 선언
		double r4;
		
		System.out.print("첫 번째 값 입력 : "); // 초기화
		n1 = sc.nextInt();
		System.out.print("두 번째 값 입력 : ");
		n2 = sc.nextInt();
		
		r1 = n1 + n2; // 로직/연산
		r2 = n1 - n2;
		r3 = n1 * n2;
		r4 = (double)n1 / n2; // 형변환을 한쪽만 시켜준 이유
		// 크기가 큰걸로 따라서 자동형변환됨 -> n2가 실수로 자동형변환됨 (형변환은 같은 종류 자료형만 계산 가능)
		r5 = n1 % n2;
		
		System.out.println("더하기 계산 결과 : " + r1); // 출력
		System.out.println("빼기 계산 결과 : " + r2);
		System.out.println("곱하기 계산 결과 : " + r3);
		System.out.printf("나누기 계산 결과 : %.4f\n", r4); // 소수점 4번째 자리까지만 나오게 해달라는 요구사항 -> printf 사용
		System.out.println("나머지 계산 결과 : " + r5);
		
		

	}

}
