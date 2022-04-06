package exam07_N;

import java.util.Random;

/*
 * 		직위		연봉
 * =======================
 * 		사원		2800
 * 		대리		3000
 * 		과장		4000
 * 		차장		5500
 * 		부장		8000
 * 
 * 과장 이상 부터는 침장 직책을 수행할 수 있으며, 차장 이상 부터는 본부장 직책을 수행 할 수 있다.
 * 
 * 팀장 직책을 수행하는 경우 연봉의 10% 를 보너스로 받을 수 있습니다.
 * 본부장 직책을 수행하는 경우 연봉의 20% 를 보너스롤 받을 수 있습니다.
 * 
 * 모든 직원들은 1달에 1번 급여를 지급받습니다.
 * 
 * 모든 직원들은 급여외 보너스를 빋을 수 있으나 직위마다 받는 시점이 다릅니다. 보너스는 연봉의의 25% 입니다.
 * 
 * 모든 직원들은 급여외 보너스를 받을 수 있으나 직위마다 받는 시점이 다릅니다. 보너스는 연봉의 25% 입니다.
 * (사원/대리 : 6개월에 1번, 과장/차장 : 4개월에 1번, 부장 : 1년에 1번)
 * 
 * 대리 이상의 직원들은 법인카드를 발급받아 사용할 수 있습니다. 
 * 단, 법인카드 사용액은 연봉의 1.5% 이며, 그 이상을 초과할 수 없습니다.
 * 
 * 위의 조건에 해당하는 클래스와 반복문을 작성한다.
 * 
 * 반복문의 1회 반복시마다 1달의 시간이 흐르는 것으로 간주한다.
 * 법인카드 사용은 이벤트성으로 1 ~ 9 사이의 랜덥값 중 4의 배수에 해당하는 겂이 발생했을 떄
 * 대리, 과장, 차장, 부장 중 한명이 사용하는 것으로 한다.
 * 
 * 과장 + 팀장
 * 	기본 연봉 4000 + 팀장 수행 추가(4000 * 0.1 = 400)
 * 
 *  4개월에 1번 보너스(4000 * 0.25 * 3 = 3000)
 *  총 7400
 */

/* 캐스팅 관계
 * Employee <-------
 *     ↑           |                
 *	Staff    AssistantManager           TeamManager       HeadManager
 *                 ↑                         ↑                ↑
 *          DepartmentManager ----------------                |
 *                 ↑                                          |
 *         DeputyGeneralManager -------------------------------
 *                 ↑
 *              Director
 */

public class Main_N {

	public static void main(String[] args) {
		Random rand = new Random();
		
		// 업 캐스팅
		Employee_N e1 = new Staff_N("김사원", 28);
		Employee_N e2 = new AssistantManager_N("박대리", 32);
		Employee_N e3 = new DepartmentManager_N("이과장", 38);
		Employee_N e4 = new DeputyGeneralManager_N("차차장", 43);
		Employee_N e5 = new Director_N("곽부장", 48);
		
		Employee_N[] empArr = new Employee_N[5];
		empArr[0] = e1;	empArr[1] = e2;	empArr[2] = e3;
		empArr[3] = e4;	empArr[4] = e5;
		
		// 한번 반복할 때마다 한달의 시간이 흐름
		int year = 2022;
		for(int i = 0; i < 30; i++) {
			for(int idx = 0; idx < empArr.length; idx++) {	
				// 월(12), 시간(12), 분(60), 초(60) 등 값이 정해져 있으면 나머지 사용
				int month = (i + 1) % 12 == 0 ? 12 : (i + 1) % 12;
				// =
//				if((i + 1) % 12 == 0) {
//					month = 12;
//				} else {
//					month = (i + 1) % 12;
//				}
				System.out.printf("%d년 %d월 급여명세\n", year + (i + 1) / 12, month);
				System.out.printf("이름 : %s\n", empArr[idx].getName());
				empArr[idx].payMonth();
				empArr[idx].bonus(month);
				// =
//				if(empArr[idx] instanceof Staff_N || empArr[idx] instanceof AssistantManager_N) {
//					switch(month) {
//						case 6: case 12:
//							empArr[idx].bonus();
//					}
//				} else if(empArr[idx] instanceof DepartmentManager_N || empArr[idx] instanceof DeputyGeneralManager_N) {
//					switch(month) {
//					case 4: case 8: case 12:
//						empArr[idx].bonus();
//					}
//				} else if(empArr[idx] instanceof Director_N) {
//					switch(month) {
//					case 1:
//						empArr[idx].bonus();
//					}
//				}
				System.out.println("==============================");
			}
			if((rand.nextInt(9) + 1) % 4 == 0) {
				int loc = rand.nextInt(4) + 1;
				System.out.printf("%s 가 ", empArr[loc].getName());
				((AssistantManager_N)empArr[loc]).corpCard(3000000);
				// corpCard는 대리, 과장, 차장, 부장 빆에 없어서 상속에 포함되어 있지않음 -> 다운케스팅
//				empArr[idx].corpCard(1000);
				
				// 법인카드 사용하는게 대리이상부터 다 똑같음
//				switch(rand.nextInt(4)) {
//					case 0:
//						System.out.printf("%s 가 ", empArr[1].getName());
//						((AssistantManager_N)empArr[1]).corpCard(1000);
//						break;
//					case 1:
//						System.out.printf("%s 가 ", empArr[2].getName());
//						((DepartmentManager_N)empArr[2]).corpCard(1000);
//						break;
//					case 2:
//						System.out.printf("%s 가 ", empArr[3].getName());
//						((DeputyGeneralManager_N)empArr[3]).corpCard(10000);
//						break;
//					case 3:
//						System.out.printf("%s 가 ", empArr[4].getName());
//						((Director_N)empArr[4]).corpCard(1000);
//				}
			}
		}
		
		// 다운 캐스팅
//		e1.payMonth();	e1.bonus();
//		e2.payMonth();	e2.bonus();	((AssistantManager_N)e2).corpCard(460000);
//		e3.payMonth();	e3.bonus();	((DepartmentManager_N)e3).corpCard(610000);
//		e4.payMonth();	e4.bonus();	((DeputyGeneralManager_N)e4).corpCard(826000);
//		e5.payMonth();	e5.bonus();	((Director_N)e5).corpCard(1300000);

	}

}
