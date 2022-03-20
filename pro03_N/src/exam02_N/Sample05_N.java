package exam02_N;

import java.util.Scanner;

public class Sample05_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean existed = false;
		
		System.out.println("다음의 메뉴 번호 중 하나를 입력하시오.");
		for(int i = 0; i < 3; i++) {
			System.out.println("1. 조회");
			System.out.println("2. 추가");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("9. 종료");
			System.out.println(": ");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					System.out.println("조회 메뉴를 선책했습니다.");
					existed = true;  // 정상적으로 입력했으니까 종료하려는 flag
					break;  // 인접한 switch에만 발동. for 문에는 발동
				case 2:
					System.out.println("추가 메뉴를 선책했습니다.");
					existed = true;
					break;
				case 3:
					System.out.println("수정 메뉴를 선책했습니다.");
					existed = true;
					break;
				case 4:
					System.out.println("삭제 메뉴를 선책했습니다.");
					existed = true;
					break;
				case 9:
					System.out.println("종료 메뉴를 선책했습니다.");
					existed = true;
					break;
			}
			
			if(existed) break;  // 코드 라인 줄이기 위해 중괄호 생략 가능 (주의 : 1줄만 가능)
			
			if(menu != 1 || menu != 2 || menu != 3 || menu != 4 || menu != 9) {
				if(i == 2) {
					System.out.println("입력횟수를 초과하였습니다.");
				} else {
				System.out.println("잚못 입력했습니다. 다시 입력하세요.");
				}
			}
		}
	}

}
