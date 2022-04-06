package exam01_N;

import java.util.Arrays;

public class Sample01_N {
	// java api 11 검색 -> JDK 11 Documentation -> API Documentation

	public static void main(String[] args) {
		// 문자열 생성
		String s1 = "문자열";
		String s2 = new String("문자열");		
		
		char[] cArr = new char[] {'문', '자', '열'};
		String s3 = new String(cArr);
		
		byte[] bArr = new byte[] {65, 66, 67, 68};
		String s4 = new String(bArr);
		
		System.out.println(s1 + " | " + s2 + " | " + s3 + " | " + s4);
		
		// 문자열 관련 메서드
		boolean equal = s1.equals(s2);
		System.out.println("동일한 문자열 값 비교 : " + equal);
		
		for(int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			System.out.println("\"문자열\" 문자에서 추출 : " + c1);
		}
		
		s1 = "String(문자열) 관련 메서드";
		boolean contain = s1.contains("문자");
		System.out.println("문자열 에서 \"문자\" 포함 유무 : " + contain);
		
		int index = s1.indexOf("문자");
		System.out.println("문자열 에서 \"문자\" 가 포함되어 있으면 그 위치가 어디냐? : " + index);
		
		// 메서드를 method로 바꿔줌
		s1 = s1.replace("메서드", "method");
		System.out.println(s1);
		
		// " "공백을 기준으로 배열 생성
		String[] sArr = s1.split(" ");
		System.out.println(Arrays.toString(sArr));
		
		// "-"를 기준으로 배열 생성
		s1 = "010-1234-5678";
		sArr = s1.split("-");
		System.out.println(Arrays.toString(sArr));
		
		// "/"로 배열 결합
		s1 = String.join("/", sArr);
		System.out.println(s1);
		
		// 가장 앞뒤 공백 없애줌
		s1 = "	앞/뒤로 공백이 포함된 문자열	";
		s1 = s1.trim();
		System.out.println(s1);
		
		// 3번 인덱스 부터 6번 인덱스 전까지 자름
		s1 = s1.substring(3, 6);
		System.out.println(s1);
		
		// 2번 이후로만 출력
		s1 = s1.substring(2);
		System.out.println(s1);
		
		s1 = "영문자 upper/lower";
		// 대문자로 변환
		s1 = s1.toUpperCase();
		System.out.println(s1);
		// 소문자로 변환
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		// 문자열을 문자 배열로 반환
		cArr = s1.toCharArray();
		System.out.println(cArr);
		
		// 정규표현식 -> 이메일, 패스워드, 아이디...
		// \d : 숫자형식을 판단
		s1 = "010-1234-5678";
		boolean isPhone = s1.matches("\\d{3}-\\d{4}-\\d{4}");
		System.out.println(isPhone);
		
		// System에 사용하는 format과 결과는 동일
		// System.out.printf() : 한계가 있음 -> 출력 후 소멸
		// String.fotmat : 문자열을 생성해해줌 -> 후속 작업 가능
		s1 = String.format("%s-%s-%s", "010", "1234", "5678");
		System.out.println(s1);
	}

}
