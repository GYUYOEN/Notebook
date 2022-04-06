package exam06_N;

import java.util.Random;

public class Main_N {

	public static void main(String[] args) {
		/*
		 * 다형성 / 업캐스팅 / 다운캐스팅 활용
		 * 		- 일반 고객 5명을 생성한다.(이름, 나이, 성별 초기화 하지 않아도 됨)
		 * 		- 일반 고객 5명을 배열에 넣어 랜덤한 고객, 랜덤한 가격으로 물품을 구입하게 만든다.
		 * 		- 물품 구입액이 1,000,000 원을 초과하면 프리미엄 고객으로 전환시켜서 물품 구입에 할인율을
		 * 		  적용할 수 있도록 만든다.
		 * 		- 고객이 물품을 구입하는 작업을 반복문을 통해 반복하게 만드며, 100번 반복하게 만든다.
		 * 
		 * 일반 고객 -> 프리미엄 고객 전환
		 * 		NormalCustomer n1 = new NormalCustomer("홀길동"); // 일반 고객 정보를
		 * 		PremiumCustomer p1 = new PremiumCustomer(); // 새로운 프리미엄 객체를 생성하여
		 * 		p1.setName(n1.getName); // 고객 정보만 프리미엄 객체에 저장한다.
		 * 
		 * 일반 고객은 물품 구입 횟수가 10회가 될 때마다
		 * 5% 할인 쿠폰을 발급하도록 한다.
		 * 물품 구입을 할 때 쿠폰이 있는 경우 바로 사용하도록 한다.
		 */
		
		/*
		 * 직원(Employee) 고객 클래스를 별도로 생성하여 다음의 기능이 동작하도록 한다.
		 * 		- 직원 고객이 물품을 구입할 때 직원할인가를 적용하여 구입할 수 있도록 한다.
		 * 		  (직원할인가는 10%이다.)
		 * 
		 * 모든 고객은 구입한 물품에 대해 환불을 받을 수 있다.
		 * 단, 일반고객은 구입 영수증이 있어야 환불을 받을 수 있다.
		 * 
		 * 고객 정보는 1년에 한번씩 갱신을 수행하며, 프리미엄 고객의 경우 갱신할 시점의 
		 * 누적구입액이 최소 5,000,000 원 미만인 경우 일반고객으로 강등된다.
		 * (100번 반복 횟수에서 30, 60, 90 번 반복애 해당하는 경우 모든 고객의 정보를
		 * 갱신하도록 히여 1년에 한번씩 갱신을 수행한 것으로 간주한다.)
		 */
		
		/*
		 * 공통 기능은 부모에, 자식 클래스마다 조금씩 달라지면 자식에다 오버라이드하여 수정/변경
		 * 특정한 자식에게만 적용 해야하는 경우 그 자식 클래스에게만 정의
		 * 그 자식만 가지고 있는 경우 다운캐스팅으로 형변환 시켜줘야함
		 */
//		Random rand = new Random();
//		Customer_N[] cArr = new Customer_N[5];
//		
//		for(int i = 0; i < cArr.length; i++) {
//			cArr[i] = new NormalCustomer_N();
//		}
//		
//		int unit = 10000;
//		for(int i = 0; i < 100; i++) {
//			int idx = rand.nextInt(cArr.length);
//			int price = (rand.nextInt(190000) + unit) / unit * unit;
//			
//			if(cArr[idx] instanceof NormalCustomer_N) { 
//				NormalCustomer_N c = (NormalCustomer_N) cArr[idx];
//				c.buy("xxxxxx", price);
//				
//				if(price > 1000000) {
//					// 배열 밖에서 작업
//					PremiumCustomer_N p = new PremiumCustomer_N();
//					p.setName(c.getName());
//					p.setAge(c.getAge());
//					p.setGender(c.getGender());
//					p.setPriceTotal(price);
//					// 배열에 집어 넣어줌
//					cArr[idx] = p;
//					System.out.println("축하합니다 구입액이 1,000,000 원을 초과하여 프리미엄 등급으로 상승하였습니다.");
//					System.out.println("앞으로 물품 구입 누적액에 따른 할인율이 적용됩니다.");
//				}
//			} else {
//				PremiumCustomer_N p = (PremiumCustomer_N) cArr[idx];
//				p.buy("xxxxxx", price);
//			}
//		}
		
		Customer_N[] cArr = new Customer_N[3];
		cArr[0] = new NormalCustomer_N();
		cArr[1] = new PremiumCustomer_N();
		cArr[2] = new EmployeeCustomer_N();
		
		// 부모를 통해 자식 매서드 실행
		// 자식이 가지고 있는 메서드가 부모에 없으면 실행x
		// 자식이 가지고 있는 고유한 메서드를 실행시키기 위해서 다운캐스팅 필요
		for(int i = 0; i < cArr.length; i++) {
//			cArr[i].buy("xxxxx", 3000000);
//			cArr[i].refund();
			System.out.println(cArr[i].getClass());
			cArr[i] = cArr[i].renewal();
			System.out.println(cArr[i].getClass());
		}
		
	}

}
