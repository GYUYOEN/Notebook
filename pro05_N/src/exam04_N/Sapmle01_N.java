package exam04_N;

public class Sapmle01_N {

	public static void main(String[] args) {
		StaticTest_N st1 = new StaticTest_N(); 
		StaticTest_N st2 = new StaticTest_N(); 
		StaticTest_N st3 = new StaticTest_N(); 
		
		// static 예약어를 사용한 변수는 클래스 명으로 사용하는 것을 권장한다. : 공유하고 있는게 같기 때문에 구지
		// st1.share = 20;
		StaticTest_N.share = 20;
		// System.out.println(st1.share + "|" + st2.share + "|" + st3.share);
		System.out.println(StaticTest_N.share + "|" + StaticTest_N.share + "|" + StaticTest_N.share);
				
		// st2.share = 30;
		StaticTest_N.share = 30;
		// System.out.println(st1.share + "|" + st2.share + "|" + st3.share);
		System.out.println(StaticTest_N.share + "|" + StaticTest_N.share + "|" + StaticTest_N.share);
				
		// st3.share = 40;
		StaticTest_N.share = 40; // 변수의 얕은 복사처럼 다 같은 static을 보고있음. 그래서 값이 같아짐
		// System.out.println(st1.share + "|" + st2.share + "|" + st3.share);
		System.out.println(StaticTest_N.share + "|" + StaticTest_N.share + "|" + StaticTest_N.share);
		
		FinalTest_N ft1 = new FinalTest_N();
		
		System.out.println(ft1.CONSTANT);
		// ft1.CONSTANT = 20; // -> The final field FinalTest_C.CONSTANT cannot be assigned : fianl 상수이기 때문에 바꿀수 없음
		
		FinalStaticTest_N fst1 = new FinalStaticTest_N();
		FinalStaticTest_N fst2 = new FinalStaticTest_N();
		
		System.out.println(fst1.CONSTSHARE + "|" + fst2.CONSTSHARE);
		System.out.println(FinalStaticTest_N.CONSTSHARE);
		// FinalStaticTest_N.CONSTSHARE = 30; // 오류 발생 : final 때문
	}

}
