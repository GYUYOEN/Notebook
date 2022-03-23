package exam10.run;

import exam10.model.vo_N.Member_N;

public class Run1_N {

	public static void main(String[] args) {
		Member_N m = new Member_N(); 
		m.ChangeName("홍길동");
		m.printName();

	}

}
