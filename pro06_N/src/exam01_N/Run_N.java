package exam01_N;

import java.util.Arrays;

public class Run_N {

	public static void main(String[] args) {
		Grade_N g = new Grade_N("국어");
		g.setScore(73.4);
		System.out.println(g.getName());
		System.out.println(g.getScore());
		System.out.println(g.getRank()); // Rank는 설정한게 없지만 score에 의해서 이미 분류
		
		Grade_N g1 = new Grade_N("수학", 85.7);
		System.out.println(g1.getName());
		System.out.println(g1.getScore());
		System.out.println(g1.getRank());
		
		Lotto_N lot = new Lotto_N();
		lot.generate();
		System.out.println(Arrays.toString(lot.getNumbers())); // 베열이라 Arrays.toString 사용
		
		lot.generate(1);
		System.out.println(Arrays.toString(lot.getNumbers()));
		
		lot.generate(10, 20);
		System.out.println(Arrays.toString(lot.getNumbers()));
	}

}
