import java.text.SimpleDateFormat;
import java.util.Date;

import controller.LoginMenuManager_N;
import controller.MenuManager_N;

public class Main_N {
	// 제일먼저 실행되는 곳, 봐야하는 곳
	public static void main(String[] args) {
		/*
		 * 프로그램 시작 점
		 */
		SimpleDateFormat sFormat = new SimpleDateFormat("현재 시각 : yyyy년 MM월 dd일 a hh시 mm분 ss초");
//		MenuManager_N myMenu = new MenuManager_N();
		LoginMenuManager_N myMenu = new LoginMenuManager_N();
		
		System.out.println(sFormat.format(new Date()));
		myMenu.main();
	}

}
