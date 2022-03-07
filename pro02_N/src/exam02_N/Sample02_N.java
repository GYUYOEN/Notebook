package exam02_N;

public class Sample02_N {

	public static void main(String[] args) {
		/*
		 * format 활용
		 */
		
		// 졍렬(왼쪽 또는 오른쪽)
		
		// 오른쪽 정혛
		System.out.printf("%5s | %5s\n", "name", "age"); //정렬 쓸때 영문으로
		System.out.printf("%5s | %5s\n", "Hong", 32);
		System.out.printf("%5s | %5s\n", "Kim", 27);
		System.out.printf("%5s | %5s\n", "Park", 29);
		
		System.out.println("-----------------------------");
		
		// 왼쪽 정렬
		System.out.printf("%-5s | %-5s\n", "name", "age");
		System.out.printf("%-5s | %-5s\n", "Hong", 32);
		System.out.printf("%-5s | %-5s\n", "Kim", 27);
		System.out.printf("%-5s | %-5s\n", "Park", 29);
		
		System.out.println("-----------------------------");
		
		System.out.printf("%-5s | %-5s\n", "name", "age"); // 10 과 5 에 소수점도 포함
		System.out.printf("%-5s | %-5.1f\n", "Hong", 32.0); // .1 은 소수점 자릿수를 의미
		System.out.printf("%-5s | %-5.1f\n", "Kim", 27.1);
		System.out.printf("%-5s | %-5.1f\n", "Park", 29.2);
		
		System.out.println("-----------------------------");
		
		// 한글을 사용할 때 문제점
		System.out.printf("%5s | %5s\n", "이름", "나이"); // 한글은 2자리 차지
		System.out.printf("%5s | %5s\n", "홀길동", 32);
		System.out.printf("%5s | %5s\n", "김건", 27);
		System.out.printf("%5s | %5s\n", "박지우", 29);
		
		
	}

}
