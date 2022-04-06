package exam10_N;

public class EngineerCalc_N extends Calculator_N implements Engineer_N{
	
	@Override
	public int mod(int n1, int n2) {
		return n1 % n2;
	}
	
	@Override
	public int sqrd(int n1, int n2) {
		int tot = n1;
		for(int i = 0; i < n2; i++) {
			tot *= n1;
		}
		return tot;
	}
	
	@Override
	public int abs(int n1) {
		return -n1;
	}
	
	@Override
	public double abs(double n1) {
		return -n1;
	}
}
