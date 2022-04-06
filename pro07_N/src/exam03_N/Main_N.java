package exam03_N;

public class Main_N {

	public static void main(String[] args) {
		Subject_N s1 = new Subject_N("국어");
		Subject_N s2 = new Subject_N("영어", 78.3);
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		
		System.out.println(s1.getGrade());
		System.out.println(s2.getGrade());
		System.out.println(s2.getGrade().getPoint());
	}

}
