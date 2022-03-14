package exam02_N;

import java.util.Random;

public class Sample11_N {

	public static void main(String[] args) {
		/*
		 * 난수값(랜덤값) 생성
		 *     import java.util.Ramdom; 을 임포드한 후 다음에 코드 작성
		 */
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(100));
		}

	}

}
