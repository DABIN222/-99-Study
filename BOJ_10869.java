package com.our.study;

import java.util.Scanner;

public class Study04_Q10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc4 = new Scanner(System.in);
		System.out.print("A값 : ");
		int A = sc4.nextInt();
		System.out.print("B값 : ");
		int B = sc4.nextInt();
		
		
		if (1<= A && A <=10000 && 1<=B && B <=10000) {
			
			int add = A+B;
			int sub = A-B;
			int mul = A*B;
			int div = A/B;
			int rem = A%B;
			
			System.out.println(add);
			System.out.println(sub);
			System.out.println(mul);
			System.out.println(div);
			System.out.println(rem);

	
			
		} else {
			System.out.println("다시 입력하시오.");
		}
		
		
		
		
		
		
	}

}
