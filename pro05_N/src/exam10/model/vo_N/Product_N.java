package exam10.model.vo_N;

public class Product_N {
	private String pName = "키보드";
	private int price = 250000;
	private String brand = "X오X드";
	
	public Product_N() {}
	
	public void information() {
		System.out.println(pName);
		System.out.println(price);
		System.out.println(brand);
	}
}
