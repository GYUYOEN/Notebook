package exam03_N;

public class Main_N {

	public static void main(String[] args) {
		Student_N std = new Student_N("홍길동", 13);
		
		// 초기값을 설정해야함 아니면 기본값을 사용하게 됨
		std.nextYear();
		
		// getter 필요
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getClassLevel());
		
		System.out.println(std);

	}

}
