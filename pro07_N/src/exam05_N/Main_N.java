package exam05_N;

public class Main_N {

	public static void main(String[] args) {
		/*
		 * 다형성
		 *     - 객체지향 프로그래밍의 3대 특징 중 하나
		 *     - 하나의 객체가 여러 형태를 가진다는 의미, 관계가 있어야 함
		 *     - 상속을 사용하여 부모 타입으로 부터 파생된 여러 타입의 자식 객체를
		 *       부모 클래스로 다룰 수 있도록 하는 기능
		 */
		
		/*
		 * 업 캐스팅
		 *     - 상위 객체로 변환하는 것
		 *     - 자식 클래스가 부모 클래스로 변화하는 것 -> 부모 타입의 참조변수에 자식 타입의 참조변수를 저장할 수 있다.
		 *     - 자동으로 변환이 이루어지기 때문에 별도의 캐스팅 연산자를 사용할 필요가 없다. (부모는 하나밖에 없으므로)
		 */
		
		Person_N s1 = new Student_N("홍길동", 16);
		Person_N t1 = new Teacher_N("김철원", 28);
		
		// 원래 배열은 같은 타입만 저장 가능
		Person_N[] p1 = new Person_N[3];
		p1[0] = new Teacher_N("김철원", 28);
		p1[1] = new Student_N("홍길동", 16);
		p1[2] = new Student_N("박장석", 16);
		
		// 부모가 가지고 있는 메서드만 출력 가능
		// classLevel, classRoom, subject 출력 불가능 -> 다운캐스팅 해야됨
		for(int i = 0; i < p1.length; i++) {
			System.out.println("이름 : " + p1[i].getName());
			System.out.println("나이 : " + p1[i].getAge());
			System.out.println("====================");
		}
		
		/*
		 * 다운 캐스팅
		 *     - 하위 객체로 변환하는 것
		 *     - 업 캐스팅으로 부모 타입의 참조변수에 저장한 자식 객체의 참조변수를 다시 원래의 타입으로 변환하기 위해 사용
		 *     - 캐스팅 연산자를 사용하여 변환을 시켜야 한다. (자식은 여러개 이므로)
		 */
		
		Person_N s2 = new Student_N("홍길동", 16);
		Student_N s3 = (Student_N) s2;
		s3.setClassLevel(1);
		s3.setClassRoom(2);
		
		Person_N t2 = new Teacher_N("감철원", 28);
		Teacher_N t3 = (Teacher_N) t2;
		t3.setClassLevel(1);
		t3.setClassRoom(2);
		t3.setSubject("국어");
		
		// 다시 업캐스팅 함
		Person_N[] p2 = new Person_N[2];
		p2[0] = s3; p2[1] = t3;
		
		// student, teacher 클래스로 쓸려면 다시 원래의 인스턴스로 되돌려 줘야됨
		for(int i = 0; i < p2.length; i++) {
			int level, room;
			String subject = "";
			
			if(p2[i] instanceof Student_N) {
				level = ((Student_N) p2[i]).getClassLevel();
				room = ((Student_N) p2[i]).getClassRoom();
				System.out.printf("%d 학년 %d 반 학생\n", level, room);
			} else if (p2[i] instanceof Teacher_N) {
				level = ((Teacher_N) p2[i]).getClassLevel();
				room = ((Teacher_N) p2[i]).getClassRoom();
				subject = ((Teacher_N) p2[i]).getSubject();
				System.out.printf("%d 학년 %d 반 %s 담당 선생님\n", level, room, subject);
			}
		}
	}

}
