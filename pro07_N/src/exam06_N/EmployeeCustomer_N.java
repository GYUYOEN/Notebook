package exam06_N;

public class EmployeeCustomer_N extends Customer_N{
	@Override
	public void buy(String productName, int price) {
		price = (int)(price * (1 - 0.1));
		super.buy(productName, price);
	}
}
