package exam02_N;

public class Sample01_N {

	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다."); // 반갑습니다 다음까지 출력 (커서가 반갑습니다 밑에 있다)
		
		System.out.print("안녕하세요.");
		System.out.print("반갑습니다."); // 안녕하세요 반갑습니다 밑으로 커서가 안가고 계속 문장에 있음
		
		int i = 30;
		System.out.println("당신은 현재 30대 입니다.");
		System.out.println("당신은 현재 " + i + "대 입니다."); // 문자열 연산
		System.out.printf("당신은 현재 %d대 입니다.\n", i);
		System.out.printf("당신은 현재 %o대 입니다.\n", i); // 8진수
		System.out.printf("당신은 현재 %x대 입니다.\n", i); // 16진수
		System.out.printf("당신은 현재 %c대 입니다.\n", i); // 문자(아스키코드 30에 대한 값)
		System.out.printf("당신은 현재 %c대 입니다.\n", i+3);
		
	    double d1 = 1234.6578;
	    double d2 = 1234345.567812341235356856;
	    System.out.printf("%f\n", d1); // 소수점 6번째 자리까지 출력
	    System.out.printf("%.2f\n", d1); // .2 가 소수점자릿수를 나타낸다.
	    System.out.printf("%e\n", d1); // 지수형태
	    System.out.printf("%g / %g\n", d1, d2); // 너무 길면 값을 축소시켜 출력, %f와 %e 중 짧고 간결한거 표기
	    System.out.printf("%A\n", d1); // 16진수 실수
	    
	    boolean b1 = true;
	    boolean b2 = false;
	    int b3 = 0;
	    int b4 = 1;
	    
	    System.out.printf("%b / %b\n", b1, b3);
	    System.out.printf("%b / %b\n", b2, b4);
	    System.out.printf("%b / %b\n", b2, b4);
	    System.out.printf("%b / %b\n", b2, null); // null 데이터만 false 로 출력됨.
	    
	    System.out.println(b1);
	    System.out.println(b2);
	}

}
