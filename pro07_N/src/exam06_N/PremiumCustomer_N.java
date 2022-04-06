package exam06_N;

public class PremiumCustomer_N extends Customer_N {
	private double discount;
	private int priceTotal;
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(int priceTotal) {
		this.priceTotal = priceTotal;
	}
	
	@Override
	public void buy(String productName, int price) {
		priceTotal += price;
		double p = _calcDiscount(price);
		System.out.printf("%s 상품을 %.2f 할인을 적용하여 %,.1f 원에 구입하였습니다.\n", productName, discount, p);
	}
	
	public Customer_N renewal() {
		// 누적사용액이 500만원 미만이면 일반고객
		// 누적사용액이 500만원 이상이면 프리미엄고객
		// 일반고객 아니면 프리미엄 고객으로 리턴 시켜주기 위해서 반환타임 Customer
		// 여기서 this 는 자식타입, 자식이 부모에 할당 -> 업 캐스팅
		Customer_N c = this;
		if(priceTotal < 5000000) {
			// 업 캐스팅
			// 새로운 객체를 생성해서 반환
			c = new NormalCustomer_N();
			c.setName(getName());
			c.setAge(getAge());
			c.setGender(getGender());
			System.out.println("누적사용액이 기준에 미달하여 일반 고객으로 강등 조치되었습니다.");
		}
		return c;
	}
	
	private double _calcDiscount(int price) {
		if(priceTotal >= 10000000) {
			discount = 0.1;
			return price * (1 - 0.1);
		} else if(priceTotal >= 5000000) {
			discount = 0.05;
			return price * (1 - 0.05);
		} else if(priceTotal >= 3000000) {
			discount = 0.02;
			return price * (1 - 0.02);
		} else {
			return price;
		}
	}
}
