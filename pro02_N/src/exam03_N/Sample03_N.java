package exam03_N;

import java.util.Scanner;

public class Sample03_N {

	public static void main(String[] args) {
		// 사용자가 입력한 한 줄 데이터를 처리하기 위한 sc.nextLine()
		
		Scanner sc = new Scanner(System.in);
		
		// String sInput = sc.next(); // -> next는 공백을 기준으로 잘라서 앞에 있는 값만 저장, 출력
		String sInput = sc.nextLine();
		
		System.out.println("입력 문자열 : " + sInput);
	}

}
