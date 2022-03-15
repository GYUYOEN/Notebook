package exam01_N;

import java.util.Random;
import java.util.Scanner;

public class Homework_N {
	public static void main(String[] args) {
		/* 
		 * 배열을 적용한다.
		 *      - 컴퓨터가 생성한 정수 값을 가위. 바위, 보로 치환하기 위한 배열
		 *      - 전적 기록을 배열을 사용하여 관리 할 수 있도록 한다.
		 */
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String name, me, sCom = "";
		String[] data = {"가위", "바위", "보"};
		int computer;
		int result = 0;  // 지면 0, 비기면 1,이기면 2
		int[] record = new int[3];
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		for(;;) {
			System.out.print("가위바위보 : ");
			me = sc.nextLine();
			
			computer = random.nextInt(3);
			sCom = data[computer];
			
			if(me.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", record[0] + record[1] + record[2], record[2], record[1], record[0]);
				break;
			} else if(me.equals("가위")) {
				if(computer == 0) {
					result = 1; 
				} else if(computer == 1) {
					result = 0; 
				} else if(computer == 2) {
					result = 2; 
				}
			} else if(me.equals("바위")) {
				if(computer == 0) {
					result = 2; 
				} else if(computer == 1) {
					result = 1; 
				} else if(computer == 2) {
					result = 0; 
				}
			} else if(me.equals("보")) {
				if(computer == 0) {
					result = 0; 
				} else if(computer == 1) {
					result = 2;
				} else if(computer == 2) {
					result = 1;
				}
				record[result]++;
			} else {
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
			System.out.printf("컴퓨터 : %s\n%s : %s\n", sCom, name, me);
			switch(result) {
				case 0:
					System.out.println("졌습니다.ㅠㅠ");
					break;
				case 1:
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("이겼습니다!!");
			}
		}
	}

}
