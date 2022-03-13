package exam01_N;

import java.util.Scanner;

public class Sample03_N {

	public static void main(String[] args) {
		/* Scanner 를 사용하여 사용자 입력을 받고 다음의 결과가 나오도록 하시오.
		 *      1. 사용자 입력을 통해 국어, 영어, 수학 점수를 입력 받는다. (점수 데이토를 입력 받는다.)
		 *      2. 입력 받은 점수 데이터의 값에 대해 총점과 평균을 구한다.
		 *      3. 평균 점수가 60 점 이상인 경우에만 다음의 메시지를 출력한다.
		 *           축하 합니다. 합격입니다.
		 *              총점 : 213 점
		 *              국어 : 75 점
		 *              영어 : 70 점
		 *              수학 : 68 점
		 *              평균 : 71.0 점
		 *      4. 평균 점수가 60 점 미만인 경우에는 다음의 메시지를 출력한다.
		 *          평균 점수가 미달하였습니다.
		 *      5. 국어, 영어, 수학, 과목 중 40 점 미만인 과목이 있는 경우 다음의 메시지를 출력한다.
		 *          과락된 과목이 있어 불합격 되었습니다. 
		 */
		Scanner sc = new Scanner(System.in);
		int Korean, English, Math, Total;
		double Avg;
		
		System.out.print("국어 : ");
		Korean = sc.nextInt();
		
		System.out.print("영어 : ");
		English = sc.nextInt();
		
		System.out.print("수학 : ");
		Math = sc.nextInt();
		
		Total = Korean + English + Math;
		System.out.printf("총점 : %d\n", Total);
		
		Avg = (double)Total / 3.0;
		System.out.printf("평균 : %.1f\n", Avg);
		
		if(Avg >= 60) {
			System.out.println("축하합니다.합격입니다.");
			System.out.printf("국어 : %d 점\n", Korean);
			System.out.printf("영어 : %d 점\n", English);
			System.out.printf("수학 : %d 점\n", Math);
			System.out.printf("총점 : %d 점\n", Total);
			System.out.printf("평균 : %.2f 점\n", Avg);
		} else {
				System.out.println("평군 잠수기 미달하였습니다.");
				if(Korean < 40 || English < 40 || Math < 40) {
				System.out.println("과락된 과목이 있어 불합격 되었습니다.");
				System.out.println("과락된 과목은  다음과 같습니다.");
				if(Korean < 40) {
					System.out.println("    국어");
				}
				if(English < 40) {
					System.out.println("    영어");
				}
				if(Math < 40) {
					System.out.println("    수학");
				}
			}
		}
	}
}
