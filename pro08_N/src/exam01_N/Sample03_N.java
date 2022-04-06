package exam01_N;

public class Sample03_N {

	public static void main(String[] args) {
		/*
		 *  StringBuilder / StringBuffer
		 *      - String 은 불변(Immutable)의 특징을 가진다.
		 *        불변 : 문자열의 문자값을 변경 할 수 없다. -> 새로운 문자열로 만들어서 변경된 것 처럼 썼을 뿐이다.
		 *      - StringBuilder, StringBuffer 는 가변(Mutable)의 특징을 가진다.
		 *      - StringBuilder와 StringBuffer 의 기능을 동일하다. 단, 멀티쓰레드 관련 기능 중 Thread Safe 기능에 대해
		 *        StringBuffer가 제공을 한다. StringBuilder는 제공 안한다.
		 *      - Thread Safe 기능은 멀티쓰레드에서 발생할 수 있는 문제중 공유자원에 대한 접근을 하나의 쓰레드만 접근하여
		 *        사용하도록 락을 걸어 다른 쓰레드가 작업을 하지 못하게 막아주는 기능이다.
		 */
		
//		StringBuilder sb1 = new StringBuilder();
		StringBuffer sb1 = new StringBuffer();
		
		// .append(string)
		// append는 항상 뒤에먼 붙여줌
		sb1.append("문자열");
		sb1.append(" 추가");
		System.out.println(sb1);
		
		// .insert(offset, string) -> offset : 위치값
		// 원하는 위치에 추가
		sb1.insert(0, "StringBuilder ");
		System.out.println(sb1);
		sb1.insert(14, "클래스 : ");
		System.out.println(sb1);
		
		// .indexOf(string)
		int idx = sb1.indexOf("Builder");
		System.out.println("Builder 문자열의 위치 -> " + idx);
		
		// .charAt(index)
		for(int i = 0; i < sb1.length(); i++) {
			System.out.println("StringBuilder 에서 문자만 추출 -> " + sb1.charAt(i));
		}
		
		// .replace(start, end, string)
		System.out.println(sb1);
		sb1.replace(14, 17, "Class");
		System.out.println(sb1);
		
		// .deleteCharAt(index) 또는 .delete(start, end)
		// idx에 해당하는 문자 지우기
		sb1.deleteCharAt(20);
		System.out.println(sb1);
		// 범위로 지우기
		sb1.delete(19, 24);
		System.out.println(sb1);
		
		// .setCharAt(index, char)
		// 문자 변경
		sb1.setCharAt(14, 'c');
		System.out.println(sb1);
	}

}
