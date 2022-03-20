package exam06_N;

public class StopWatch_N {
	/*
	 * 사물을 추상화하여 클래스(객체)를 만드는 과정
	 * 
	 * 1. 사물이 가지는 속성과 시능을 분휴한다.
	 * 2. 분류된 속성과 기능 중 프로그램에 필요한 속성과 기능만 재분류한다.
	 *    예)
	 * 		쇼핑몰용 회원 정보 관리에 필요한 사람정보
	 * 		대학교 학생 정보 관리에 필요한 사람정보
	 * 		회사 직원 정보 관리에 필요한 사람정보
	 * 3. 재분류한 속성 및 기능만을 정의한 클래스 다이어그램을 만든다.
	 * 4. 클래스 다이어그램을 참고하여 클래스를 만든다.
	 */
	
	/*
	 * +------------------+
	 * | exam06.StopWatch |
	 * +------------------+
	 * | - hour:int       |
	 * | - minute:int     |
	 * | - second:int     |
	 * +------------------+
	 * | + start():void   |
	 * | + stop():void    |
	 * | + pause():void   |
	 * | + reset():void   |
	 * +------------------+
	 */
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int h) {	// setter
		hour= h;
	}
	public int getHour() {	// getter
		return hour;
	}
	
	public void start() {}
	public void stop() {}
	public void pause() {}
	public void reset() {}
}
