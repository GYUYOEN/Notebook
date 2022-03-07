package exam03_N;

import java.util.Scanner;

public class Sample02_N {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 받기 위한 Scanner 클래스
		 *      - 기본적으로 모든 사용자 입력 데이터는 문자열이다.
		 */
		
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력 받기 (정수만 입력 받도록 되어 있기 때문에  정수값에 해당하는 문자열만 입력해야 한다.)
		int iInput = sc.nextInt(); // 형변환
		
		System.out.println("사용자 입력 값 : " + iInput);
		System.out.printf("사용자 입력 값 : %d\n", iInput);
		
		double dInput = sc.nextDouble();
		
		System.out.println("사용자 입력 값 : " + dInput);
		System.out.printf("사용자 입력 값 : %f", dInput);
	}

}
