package exam01_N;

import java.util.StringTokenizer;

public class Sample04_N {

	public static void main(String[] args) {
		/*
		 * StringTokenizer
		 *     - String 클래스에서 제공하는 split() 메서드와 유사한 기능을 제공하는 클래스
		 * ex) 010-1234-5678 -> "-" 는 구분 문자, "010", "1234", "5678" 은 토큰
		 */
		
		// Sting.split은 배열을 이용함
		String phone = "010-1234-5678";
		StringTokenizer st1 = new StringTokenizer(phone, "-");
		
		// 토큰 갯수
		System.out.println(st1.countTokens());
		
		// hasMoreTokens() : 토큰이 있는지 판단
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	}

}
