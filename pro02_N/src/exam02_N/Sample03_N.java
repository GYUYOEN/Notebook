package exam02_N;

public class Sample03_N {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 이스케이프 문자 : 역슬레쉬 조합
		 *      - 문자열에 작성하는 문자들 중 일부 문자에 대해 다른 기능을 부여하기 위해 사용
		 *      - \n, \r, \t, \', \", \\ 등의 이스케이프 문자가 있음
		 *      \n : 개행 , 엔터
		 *      \t : tab 공백 만들어 줌
		 *      \r : 리눅스 운영체제에서 Console(Terminal) 작업으로 프로그램 다운로드 받을 때.
		 *           "진행 프로그레스 바" 와 같은 출력 형태가 필요한 때
		 *           커서만 앞으로 옯겨줌
		 *      \', \" : 문자열에서 따옴표가 중복될때 사용, 큰 따옴표 안에 작은 따옴표 있을때는 상관x
		 *      \\ : 역슬레쉬를 문자열에 써야 할 때
		 */
		System.out.println("\"진행 프로그래스 바\" 와 같은 출력 형태가 필요한 때");
		
		System.out.print("이클립스\r자바\n"); // 이클립스 앞으로 커서 이동 -> 이클이 자바로 수정 -> 자바립스
		
		System.out.print("다운로드 중...[  0%]\r");
		Thread.sleep(1000); // 1000 = 1초 동안 일시정지
		System.out.print("다운로드 중...[ 10%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 20%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 30%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 40%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 50%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 60%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 70%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 80%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 90%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[100%]\r");
	}

}
