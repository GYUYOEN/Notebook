package exam05_N;

public class Main_N {

	public static void main(String[] args) {
		Person_N p1 = new Person_N("홍길동");
		System.out.println(p1.getName());
		
		Person_N p2 = new Person_N("박지수");
		System.out.println(p2.getName());
		
		Person_N p3 = new Person_N("김정우");
		System.out.println(p3.getName());
		
		System.out.println("--------------------------");
		
		// 배열을 이용한 객체 사용법 -> 객체배열
		Person_N [] pArr = new Person_N[4];
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		pArr[3] = new Person_N("최가은");
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i + "] -> " + pArr[i].getName());
		}
		
		System.out.println("--------------------------");
		
		
		PersonList_N pList = new PersonList_N(pArr);
		
		// 그냥 이렇게만 쓰면 pArr[0]에 대한 참조값만 나옴
		// System.out.println(pList.get(0)); 
		
		for(int i = 0; i < pList.length(); i++) {
			Person_N data = pList.get(i);
			System.out.println(data.getName());
		}
		
		System.out.println("--------------------------");
		// 추가
		pList.add("이장수");
		pList.add("이세영");
		pList.add("최종현");
		
		for(int i = 0; i < pList.length(); i++) {
			Person_N data = pList.get(i);
			System.out.println(data.getName());
		}
		
		System.out.println("--------------------------");
		// 수정
		pList.update("홍길동", "홍길명");
		pList.update(1, "박채은");
		
		for(int i = 0; i < pList.length(); i++) {
			Person_N data = pList.get(i);
			System.out.println(data.getName());
		}
		
		System.out.println("--------------------------");
		// 삭제
		pList.remove("김정우");
		pList.remove(2);
		
		for(int i = 0; i < pList.length(); i++) {
			Person_N data = pList.get(i);
			System.out.println(data.getName());
		}
	}

}
