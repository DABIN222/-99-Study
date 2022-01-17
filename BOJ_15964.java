package com.our.study;

import java.util.Scanner;

public class Study05_Q15964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc5 = new Scanner(System.in);
		
		System.out.print("A값 : ");
		int A = sc5.nextInt();
		
		System.out.print("B값 : ");
		int B = sc5.nextInt();
		
		
		if(0<A && A<100001 && 0<B && B<100001) {
			int C = (A+B)*(A-B);
			
			System.out.println("A@B = "+ C);
			
			
		}else {
			System.out.println("다시 입력하시오.");
		}
	
	
	
	}

}
