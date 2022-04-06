package exam01_N;

public class Sample05_N {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 *     - 기본 자료형을 객체로 만들어서 객체로 다룰수 있게 해주는 클래스
		 *     - 문자열 객체를 Wrapper 클래스로 변환하여 사용할 수 있게 된다.
		 *     
		 *     문자열에 정수나 실수를 기본자료형으로 변경할 수 있개 하는 중간 객체인 Wrapper 클래스
		 *     
		 * Boolean, Byte, Character, Short, Integer, Long, Float, Double 이 Wrapper 클래스들 이다.
		 */
		
		// 문자열을 기본자료형으로 변경하기(Wrapper 사용)
		boolean b1 = Boolean.parseBoolean("true");
		byte b2 = Byte.parseByte("10");
		short s1 = Short.parseShort("20");
		char c1 = "문자열".charAt(0);
		int i1 = Integer.parseInt("30");
		long l1 = Long.parseLong("40");
		float f1 = Float.parseFloat("50.5");
		double d1 = Double.parseDouble("60.6");
		
		// 기본 자료형을 문자열 변경(기존 방식)
		String s2 = new String("" + 10);
		s2 = new String("" + true);
		
		// 기본 자료형을 문자열 변경(Wrapper 사용)
		// Integer.valueOf(10) : 10을 integer 객체로 변환
		String s3 = Integer.valueOf(10).toString();
		s3 = Boolean.valueOf(true).toString();

	}

}
