package exam07_N;

// 사원
public class Staff_N extends Employee_N {

	public Staff_N(String name, int age) {
		super(name, age);
		this.setSalary(2800);
	}
	
	@Override
	public void bonus(int month) {
		switch(month) {
			case 6: case 12:
				super.bonus(month);
		}
	}

}
