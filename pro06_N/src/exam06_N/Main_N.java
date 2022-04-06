package exam06_N;

import java.util.Arrays;

public class Main_N {

	public static void main(String[] args) {
		// 오버로딩 : 여러개의 생성자를 만들어서 사용
		GradeList_N gList1 = new GradeList_N();
		GradeList_N gList2 = new GradeList_N(5);
		GradeList_N gList3 = new GradeList_N("국어", "영어", "수학", "과학");
		
		for(int i = 0; i < gList3.length(); i++) {
			// System.out.println(gList3.get(i)); // 참조값으로 생성
			System.out.println(gList3.getName(i) + ":" + gList3.getScore(i));
			
		}
		
		System.out.println("--------------------------");
		
		Grade_N[] gArr = new Grade_N[2]; // gArr : 참조값이 있는 공간
		gArr[0] = new Grade_N("과학");
		gArr[1] = new Grade_N("영어");
		
		GradeList_N gList4 = new GradeList_N(gArr); // 참조값 전달
		// gArr 이 참조하고 있는 객체와 gList안에 배열이 참조하고 있는 객체 같은 곳을 참조 하고 있음 -> 얕은 복사(어느것의 설정을 바꿔도 둘다 바뀜)
		gArr[0].setName("국어"); 
		gList4.get(1).setName("수학");
		
		gList4.add("역사");
		gList4.add("영어", 89.4);
		gList4.add(new Grade_N("과학", 78.8));
		
		
		for(int i = 0; i < gList4.length(); i++) {
			System.out.println(gList4.getName(i) + ":" + gList4.getScore(i));
			
		}
		
		GradeList_N gList5 = new GradeList_N();
		gList5.add("국어", 67.8);
		gList5.add("영어", 78.4);
		gList5.add("수학", 82.8);
		gList5.add("과학", 83.6);
		gList5.add("사회", 93.2);
		
		System.out.println(Arrays.toString(gList5.getTop(3)));
		System.out.println(Arrays.toString(gList5.getBottom(3)));
	}

}
