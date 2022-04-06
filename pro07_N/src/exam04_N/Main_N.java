package exam04_N;

/*
 * 고객
 * 		일반 고객
 * 			이름, 나이, 성별
 * 
 * 		프리미엄 고객
 * 			이름, 나이, 성별, 할인률, 누적구입액
 * 
 * 프호미엄 고객의 경우 누적구입액에 따라 할인률울 차등적으로 부여하는 기능이 있다.
 * 		- 누적구입액이 1,000,000 이상의 경우 할인률은 2%
 * 		- 누적구입액이 3,000,000 이상의 경우 할인률은 5%
 * 		- 누적구입액이 10,000,000 이상의 경우 할인률은 10%
 */

public class Main_N {

	public static void main(String[] args) {
		NormalCustomer_N c1 = new NormalCustomer_N();
		
		PremiumCustomer_N p1 = new PremiumCustomer_N();
		
		c1.buy("루이비통", 1000000);
		
		for(int i = 0; i < 12; i++) {
			p1.buy("루이비통", 1000000);
		}
	}

}
