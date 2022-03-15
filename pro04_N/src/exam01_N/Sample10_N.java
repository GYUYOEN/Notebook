package exam01_N;

import java.util.Scanner;

public class Sample10_N {

	public static void main(String[] args) {
		/*
		 * 사용자로 부터 임의의 정수 값을 입력 받고 입력받은 모든 정수의 합과 평균을 구하는
		 * 코드를 작성한다.(동적 배열 활용)
		 * 
		 * -1 입력이 들어오면 종료라고 판별한다.
		 * 
		 * 예제
		 * 		1 번째 정수값 입력 : 7
		 * 		2 번째 정수값 입력 : 12
		 * 		3 번째 정수값 입력 : 24
		 * 		4 번째 정수값 입력 : -1
		 * 
		 * 		총 합 : 43
		 * 		평 균 : 14.3
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[0];
		
		for(int i = 0; i < arr1.length + 1; i++) {
			System.out.printf("%d 번째 정수값 입력 : ", i + 1);
			arr1[i] = sc.nextInt();
			if(arr1[i] == -1) {
				break;
			}
		}
	}

}
