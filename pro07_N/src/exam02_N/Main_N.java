package exam02_N;

public class Main_N {

	public static void main(String[] args) {
//		Person_N p = new Person_N();
//		p.setName("이름");
//		p.setAge(10);
//		p.setGender('M');
//		System.out.println(p);
//		
//		
//		Student_N s = new Student_N();
//		s.setName("홍길동");
//		s.setAge(16);
//		s.setGender('M');
//		s.setClassLevel(1);
//		s.setClassRoom(5);
//		System.out.println(s);
//		
//		Teacher_N t = new Teacher_N();
//		t.setName("박주성");
//		t.setAge(30);
//		t.setGender('M');
//		t.setClassLevel(1);
//		t.setClassRoom(5);
//		t.setSubject("영어");
//		System.out.println(t);
		
		Person_N p1 = new Person_N();
		Person_N p2 = new Person_N();
		
		p1.setName("김정수");	 p1.setAge(25);	 p1.setGender('M');
		p2.setName("김정수");	 p2.setAge(24);	 p2.setGender('M');
		
		System.out.println(p1.equals(p2));
	}

}
