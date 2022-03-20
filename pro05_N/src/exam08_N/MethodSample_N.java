package exam08_N;

import java.util.Random;

public class MethodSample_N {
	public void method01() {
		System.out.println("반환 타입은 void 이고 매개변수가 없는 메서드"); // 2. 실행
		// 3. 결과를 반환 후 종료. 봔환하는 곳 : 이 method01를 호출한 곳
	}
	
	public int method02() {
		System.out.println("반환 타입은 int(기본자료형) 이고 매개변수가 없는 메서드");
		return 0;
	}
	
	public int[] method03() {
		int[] res = new int[5];
		System.out.println("반환 타입은 int[](배열) 이고 매개변수가 없는 메서드");
		return res;
		// return new int[5]; 도 가능
	}
	
	public String method04() {
		String res = new String();
		System.out.println("반환 타입은 String(클래스/객체) 이고 매개변수가 없는 메서드");
		return res;
		// return null; 도 가능
	}
	
	public void method05(int[] arr) { // arg1과 같은 배열 사용
		// or arr = arr.clone(); // 깊은 복사 됨. 참조값이 달라짐 -> 수정해도 달라지지 않음
		System.out.println("반환 타입은 void 이고 매개변수가 배열인 메서드");
		System.out.println(arr); // 같은 참조 값 사용 : 얕은 복사 -> 여기서 수정을 해도 arg1도 똑같이 수정되었음 
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] -> " + arr[i]); 
		}
	}
	
	public void method06(Random r) {
		System.out.println("반환 타입은 void 이고 매개변수가 클래스(객체)인 메서드");
		r.nextInt(10);
	}
	
	// public int[] method06(Random r) {
	//  	System.out.println("반환 타입은 void 이고 매개변수가 클래스(객체)인 메서드");
	//  	int x1 = r.nextInt(10);
	//  	int x2 = r.nextInt(10);
	//  	return new int[] {x1, x2}; // return 은 원래 하나의 값만 반환이 되지만 2개 이상을 반환하고 싶을 떄는 배열을 사용
	// }
	
	public void method07(int ... nums) {
		System.out.println("반환 타입은 void 이고 매개변수가 가변인자인 메서드");
		System.out.println(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] -> " + nums[i]);
		}
	}
}
