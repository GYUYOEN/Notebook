package exam03_N;

import java.util.Scanner;

public class Sample04_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2; // 상단에는 선언부
		
		System.out.print("첫 번째 정수 값 입력 : ");
		num1 = sc.nextInt(); // 초기 값 설정
		
		System.out.print("두 번째 정수 값 입력 : ");
		num2 = sc.nextInt();
		
		int result = num1 + num2; // 계산 조직
		
		System.out.printf("결과 : %d", result); // 결과 출력

	}

}
