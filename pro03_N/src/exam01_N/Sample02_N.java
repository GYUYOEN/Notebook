package exam01_N;

import java.util.Scanner;

public class Sample02_N {

	public static void main(String[] args) {
		/*
		 * 1. 사용자 입력을 통해 정수 값을 입력받아 다음의 문제를 푸시오.
		 * 
		 *      사용자 입력값의 범위를 설정하여 입력값의 범위를 초과하는 경우 주의 메시지를 출력한다.
		 *         입력값의 범위 : 1 ~ 99
		 *         입력값의 범위를 벗어난 경우 "1 ~ 99 사이의 값을 입력하시오." 라는 메시지를 출력
		 *         올바은 입력값의 범위를 입력한 경우 "정수 값이 정상적으로 입력되었습니다." 라는 메시지를 출력
		 *         
		 * 2. 0 ~ 100 사이의 정수 값을 입력 받아 다음 조건에 헤당하는 경우 적절한 메시지를 출력하도록 한다.
		 *      입력된 정수 값이 0 ~ 39 사이의 값인 경우 "과락입니다." 메시지를 출력
		 *      입력된 정수 값이 40 ~ 59 사이의 값인 경우 "E 등급 입니다." 메시지를 출력
		 *      입력된 정수 값이 60 ~ 69 사이의 값인 경우 "D 등급 입니다." 메시지를 출력
		 *      입력된 정수 값이 70 ~ 79 사이의 값인 경우 "C 등급 입니다." 메시지를 출력
		 *      입력된 정수 값이 80 ~ 89 사이의 값인 경우 "B 등급 입니다." 메시지를 출력
		 *      입력된 정수 값이 90 ~ 100 사이의 값인 경우 "A 등급 입니다." 메시지를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. 사용자 입력을 통해 정수 값을 입력받아 다음의 문제를 푸시오
		
		int num1;
		 
		System.out.print("정수 값을 입력하세요. : ");
		num1 = sc.nextInt();
		  
	    if(num1 >=1 && num1 <= 99) {
		     System.out.println("정수 값이 정상적으로 입력되었습니다.");
		} else
		 	 System.out.println("1 ~ 99 사이의 값을 입력하시오.");
	    }
	    
		 */
		
		// 2. 0 ~ 100 사이의 정수 값을 입력 받아 다음 조건에 헤당하는 경우 적절한 메시지를 출력하도록 한다.
		int num2;
		
	    System.out.print("점수를 입력하세요(0 ~ 100) : ");
	    num2 = sc.nextInt();
	    
	    if(num2 <= 39) {
	    	System.out.println("과락입니다.");
	    } else if(num2 <= 59) {
	    	System.out.println("E 등급 입니다.");
	    } else if(num2 <= 69) {
	    	System.out.println("D 등급 입니다.");
	    } else if(num2 <= 79) {
	    	System.out.println("C 등급 입니다.");
	    } else if(num2 <= 89) {
	    	System.out.println("B 등급 입니다.");
	    } else if(num2 <= 100) {
	    	System.out.println("A 등급 입니다.");
	    }
	    
	    /*
	     * 선언 -> 초기화 -> 로질/연산 -> 출력 순으로 하는 방법 
	     */
	    
	    String result; // String 은 지역변수 -> 필수조건 : 초기화 후 사용
	    result = "";
	    int num3;
	    
	    System.out.print("점수를 입력하세요(0 ~ 100) : ");
	    num3 = sc.nextInt();
	    
	    if(num3 <= 39) {
	    	result = "과락입니다.";
	    } else if(num3 <= 59) {
	    	result = "E 등급 입니다.";
	    } else if(num3 <= 69) {
	    	result = "D 등급 입니다.";
	    } else if(num3 <= 79) {
	    	result = "C 등급 입니다.";
	    } else if(num3 <= 89) {
	    	result = "B 등급 입니다.";
	    } else if(num3 <= 100) {
	    	result = "A 등급 입니다.";
	    }
	    
	    System.out.println(result);
	    
	    /*
	     * or result = ""; 말고
	    
	    if(num2 <= 39) {
	    	result = "과락입니다.";
	    } else if(num2 <= 59) {
	    	result = "E 등급 입니다.";
	    } else if(num2 <= 69) {
	    	result = "D 등급 입니다.";
	    } else if(num2 <= 79) {
	    	result = "C 등급 입니다.";
	    } else if(num2 <= 89) {
	    	result = "B 등급 입니다.";
	    } else {   // 이곳을 else로 작성해서 초기화
	    	result = "A 등급 입니다.";
	    }
	    System.out.println(result);
	    
	     */

	}

}
