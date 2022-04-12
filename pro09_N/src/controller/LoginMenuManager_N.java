package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.vo.Student_N;
import model.vo.Teacher_N;

public class LoginMenuManager_N {
	
/*
 * 해당 프로그햄을 사용하기 위한 로그인 기능(LoginMenuManager)을 추가하도록 한다.
 * 		1. 교사용 로그인
 * 		2. 학생용 로그인
 * 		3. 종료
 * 
 * 교사용 로그인은 teacherLogin 메서드를 만들어서 계정과 암호를 확인하도록 한다.
 * 학생용 로그인은 studentLogin 메서드를 만들어서 계정과 암호를 확인하도록 한다.
 * 		- 계정은 이름으로 사용한다.
 * 		- 암호는 Student, Teacher 클래스에 별도의 password 멤버 변수를 만들어서 체크할 수 있게 한다.
 * 
 * 교사용으로 로그인을 한 경우
 * 		성적 정보를 추가, 수정, 삭제, 조회할 수 있는 모든 메뉴가 나온다.
 * 
 * 학생용으로 로그인을 한 경우
 * 		본인 성적에 대한 조회만 가능한 메뉴가 나오게 한다.
 */
	
	private Scanner sc = new Scanner(System.in);
	private TeacherDatabaseManager_N tDB = new TeacherDatabaseManager_N();
	private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	private DatabaseManager_N sDB = new DatabaseManager_N();
	
	public void main() {
		StringBuilder menu = new StringBuilder();;
		menu.append("1. 교사용 로그인\n");
		menu.append("2. 학생용 로그인\n");
		menu.append("3. 패스워드 초기화\n");
		menu.append("4. 종료\n");
		menu.append(">>> ");
		
		while(true) {
			System.out.print(menu);
			
			// hasNextInt() 를 이용해 String 말고 int형으로 반환하기
			// sc.nextInt()에 Enter 키 누르면 개행문자 \n도 들어감 
			// -> int 말고 잘못 입력했다고 생각해 무한 반복이 될 수 있음
			// 뒤에 sc.nextLine();를 붙여 \n을 없애둠
//			int input = 0;
//			while(true) {
//				if(sc.hasNextInt()) {
//					input = sc.nextInt();	sc.nextLine();
//					break;
//				}
//				sc.nextInt();
//			}
//			
//			switch(input) {
//				case 1:
//					teacherLogin();
//				case 2:
//					studentLogin();
//				case 3:
//					resetPassword();
//				case 4:
//					System.out.println("프로그램을 종료 합니다.");
//					System.exit(0);
//			}
			
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				teacherLogin();
			} else if(input.equals("2")) {
				studentLogin();
			} else if(input.equals("3")) {
				resetPassword();
			} else if(input.equals("4")) {
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			}
		}
	}

	private void resetPassword() {
		// 교사용... 학생용... 2가지 방법 중 2번으로 할거임
		// 1. 아이디(이름)만 입력하면 교사용에서 학생용에서 동일한 계정을 찾아서 변경하게 한다.
		// 2. 교사용, 학생용을 먼저 선택 후 선택한 항목에 대해서 동일한 계정을 찾아서 변경하게 한다.
		System.out.print("1. 교사용 계정\n");
		System.out.print("2. 학생용 계정\n");
		System.out.print(">>> ");
		String type = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		// ''사용 이유 : charAt()으로 인해 문자로 변경됐기때문
		switch(type.charAt(0)) {
			case '1':
				if(tDB.isExisted(name)) {
					teacherResetPassword(name);
				}
				break;
			case '2':
				if(sDB.isExisted(name)) {
					studentResetPassword(name);
				}
		}
	}


	private void studentResetPassword(String name) {
		Student_N s = sDB.getStudent(name);
		String password = s.resetPassword();
		System.out.println(password + " 로 변경되었습니다. 초기화 패스워드로 로그인 후 다시 패스워드를 변경하세요.");
	}

	private void teacherResetPassword(String name) {
		Teacher_N t = tDB.getTeacher(name);
		String password = t.resetPassword();
		System.out.println(password + " 로 변경되었습니다. 초기화 패스워드로 로그인 후 다시 패스워드를 변경하세요.");
	}

	private void teacherLogin() {
		System.out.print("교사명 : ");
		String username = sc.nextLine();
		
		Teacher_N loginAccount = null;
		
		// 비밀번호 3회 입력 제한.
		for(int i = 0; i < 3; i++) {
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			loginAccount = tDB.login(username, password);
			if(loginAccount != null) {
				break;
			}
		}
		
		if(loginAccount == null) {
			System.out.println("로그인에 실패하였습니다. 다시 시도하세요.");
		} else {
			if(loginAccount.getLoginDate() == null) {
				System.out.println("환영합니다. 첫 로그인 입니다.");
			} else {
				Date now = new Date();
				System.out.println("최근 접속 시간은 " + loginAccount.getLoginDateFormat() + " 입니다.");
				System.out.println("현재 로그인 시간은 " + sFormat.format(now) + " 입니다.");
				loginAccount.setLoginDate(now);
			}
			MenuManager_N tMenu = new MenuManager_N(loginAccount);
			tMenu.main();
		}
		
		
	}

	private void studentLogin() {
		System.out.print("학생명 : ");
		String username = sc.nextLine();
		
		Student_N loginAccount = null;
		
		// 비밀번호 3회 입력 제한.
		for(int i = 0; i < 3; i++) {
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			loginAccount = sDB.login(username, password);
			if(loginAccount != null) {
				break;
			}
		}
		
		if(loginAccount == null) {
			System.out.println("로그인에 실패하였습니다. 다시 시도하세요.");
		} else {
			Date now = new Date();
			System.out.println("현재 접속 시간은 " + sFormat.format(now) + " 입니다.");

			MenuManager_N sMenu = new MenuManager_N(loginAccount);
			sMenu.main();
		}
	}
}
