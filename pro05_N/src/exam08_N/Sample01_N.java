package exam08_N;

import java.util.Arrays;
import java.util.Random;

public class Sample01_N {

	public static void main(String[] args) {
		MethodSample_N m = new MethodSample_N();
		
		m.method01();  // 1. 호출
		// System.out.println(m.method01()); -> 오류, 프린트 활용 x
		
		int r1 = m.method02(); // r1에는 0이 저장되어있음 (return 값이 0 임으로)
		int[] r2 = m.method03();
		String r3 = m.method04();
		
		int[] arg1 = new int[] {1, 2, 3};
		System.out.println(arg1); // 같은 참조 값 사용 : 얕은 복사
		m.method05(arg1);
		System.out.println(Arrays.toString(arg1));
		// m.method05(arg1.clone()); // 깊은 복사 됨. 참조값이 달라짐 -> 수정해도 달라지지 않음
		
		Random rand = new Random();
		m.method06(rand);
				
		m.method07();
		m.method07(1, 2, 3, 4);
		m.method07(1, 2, 3, 4, 5, 6, 7, 8); // 실제로는 배열이 아님
	}

}
