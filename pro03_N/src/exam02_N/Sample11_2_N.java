package exam02_N;

import java.util.Scanner;
import java.util.Random;

public class Sample11_2_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String name, me, sCom = "";
		int computer;
		int wCnt = 0, dCnt = 0, lCnt = 0;
		int result = 0;
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		for(;;) {
			System.out.print("가위바위보 : ");
			me = sc.nextLine();
			computer = random.nextInt(3);
			if(computer == 0) {
				sCom = "가위";
			} else if(computer == 1)  {
				sCom = "바위";
			} else if(computer == 2) {
				sCom = "보";
			}
			
			if(me.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", wCnt + dCnt + lCnt, wCnt, dCnt, lCnt);
				break;
			} else if(me.equals("가위")) {
				if(computer == 0) {
					result = 0; dCnt++;
				} else if(computer == 1) {
					result = -1; lCnt++;
				} else if(computer == 2) {
					result = 1; wCnt ++;
				}
			} else if(me.equals("바위")) {
				if(computer == 0) {
					result = 1; wCnt++;
				} else if(computer == 1) {
					result = 0; dCnt++;
				} else if(computer == 2) {
					result = -1; lCnt ++;
				}
			} else if(me.equals("보")) {
				if(computer == 0) {
					result = -1; lCnt++;
				} else if(computer == 1) {
					result = 1; wCnt++;
				} else if(computer == 2) {
					result = 0; dCnt ++;
				}
			} else {
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
			System.out.printf("컴퓨터 : %s\n%s : %s\n", sCom, name, me);
			switch(result) {
				case -1:
					System.out.println("졌습니다.ㅠㅠ");
				case 0:
					System.out.println("비겼습니다.");
				case 1:
					System.out.println("이겼습니다!!");
			}
		}
	}
}
