package exam02_N;

// import exam01_N.*; : exam01_N에 있는 클래스명을 명시해주지 않아도 해당 패키지에 클래스를 다 사용할수 있도록 해줌
// import java.util.*;

import exam01_N.PersonPub_N;
import exam01_N.PersonDef;


public class Sample01_N {

	public static void main(String[] args) {
		
		PersonPub_N P1 = new PersonPub_N(); // public 접근제한자로 외부 내부 다가능 
		// import 를 안했을 경우 exam01_N.PersonPub_N P1 = new exam01_N.PersonPub_N(); 써야됨
		// import 문을 사용하면 패키지명 생략가능
		PersonDef p2 = new PersonDef(); // default 접근제한자로 같은 패키지(exam01_N)가 아니라서 오류가 됨
	}

}
