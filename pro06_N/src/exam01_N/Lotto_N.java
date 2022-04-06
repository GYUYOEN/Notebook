package exam01_N;

import java.util.Random;

public class Lotto_N {
	private int rangeMin = 1; // 로또 번호 범위 최소값
	private int rangeMax = 45; // 로또 번호 범위 최대값
	private int count = 6; // 로또 번호 생성 수
	private int[] numbers; // 로또 번호 생성 수 만큼 생성될 번호들이 저장될 배열
	private Random rand = new Random();
	
	public Lotto_N() {
		this.numbers = new int[count];
	}
	
	public Lotto_N(int min, int max, int count) {
		this.rangeMin = min;
		this.rangeMax = max;
		this.count = count;
		this.numbers = new int[count];
		// this() 사용 x -> 첫줄에 써야하는 데 첫줄에 쓸 수 없어서(count 때문에)
	}
	
	public int getRangeMin() {
		return rangeMin;
	}
	
	public void setRangeMin(int rangeMin) {
		this.rangeMin = rangeMin;
	}
	
	public int getRangeMax() {
		return rangeMax;
	}
	
	public void setRangeMax(int rangeMax) {
		this.rangeMax = rangeMax;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	
	// 이 메서드를 실행시켜 로또 번호가 생성될 수 있개  한다.
	public void generate(int ... nums) { // nums는 배열로 처리됨
		int cnt = nums.length;
		
		for(int i = 0; i < cnt; i++) { // 가변인자에 전달된 인자 수에 맞춰 값을 numbers에 전달
			numbers[i] = nums[i];
		}
		// = numbers[0] = n1;	numbers[1] = n2; numbers[2] = n3;	numbers[3] = n4;
		
 		for(int i = cnt; i < count;) { // 남은 부분(cnt)부터 실제체워야 하는 부분(count)까지
 			int num = this.rand.nextInt(rangeMax) + rangeMin;
			if(!_isDuplicate(num)) {
				numbers[i] = num;
				i++;
			}
 		}
	}
	
	/*
	 * 가변인자 사용하면 없어도됨. 매개변수의 수만 변하고 코드는 거의 동일 
	 * 로직과 흐름이 거의 동일 -> 가변인자 사용
	public void generate(int n1) {
		numbers[0] = n1;
		for(int i = 1; i < count; i++) {
			numbers[i] = this.rand.nextInt(rangeMax) + rangeMin;
		}
	}
	
	public void generate(int n1, int n2) {
		numbers[0] = n1;	numbers[1] = n2;
		for(int i = 2; i < count; i++) {
			numbers[i] = this.rand.nextInt(rangeMax) + rangeMin;
		}
	}
	
	public void generate(int n1, int n2, int n3) {
		numbers[0] = n1;	numbers[1] = n2;	
		numbers[2] = n3;
		for(int i = 3; i < count; i++) {
			numbers[i] = this.rand.nextInt(rangeMax) + rangeMin;
		}
	}
	
	public void generate(int n1, int n2, int n3, int n4) {
		numbers[0] = n1;	numbers[1] = n2;	
		numbers[2] = n3;	numbers[3] = n4;
		for(int i = 4; i < count; i++) {
			numbers[i] = this.rand.nextInt(rangeMax) + rangeMin;
		}
	}
	
	public void generate(int n1, int n2, int n3, int n4, int n5) {
		numbers[0] = n1;	numbers[1] = n2;	
		numbers[2] = n3;	numbers[3] = n4;	
		numbers[4] = n5;
		for(int i = 5; i < count; i++) {
			numbers[i] = this.rand.nextInt(rangeMax) + rangeMin;
		
	 */
	
	private boolean _isDuplicate(int number) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == number) {
				return true;
			}
		}
		return false;
	}
}
