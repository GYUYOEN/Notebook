package exam01_N;

import java.util.Scanner;

public class Homework_N {

	public static void main(String[] args) {
		/*
		 * 환율 계산 프로그램 
         * 원달러 환율 값 입력 : 1235.00          
         * 
         * 달러를 원화로 계산하겠습니까? 아니면 원화를 달러로 계산하겠습니까? 
		 ​* (1:달러->원화, 2:원화->달러) 
		 ​* 
		 * 달러값 입력 : 100 
		 * 100 달러는 123500 원 입니다. 
	     * 
	     * 원화값 입력 : 100000 
	     * 100000 원은 약 80.97 달러 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		 
	    int num1, num2;
	    double num3;
	    num3 = 1235.00;
	    
	    System.out.print("값을 입력하시오. : ");
	    num1 = sc.nextInt();
	    
	    System.out.print("1. 달러를 원화로 계산하시겠습니까? 아니면 2. 원화를 달러로 계산하시겠습니까? : ");
	    num2 = sc.nextInt();
	     
	    if(num2 == 1) {
	    	System.out.printf("%d 달러는 %.0f 원 입니다", num1, num1 * num3);
	     } else {
	    	System.out.printf("%d 원은 %.2f 달러 입니다", num1, num1 / num3);
	     }
		

	}

}
