package com.our.study;

import java.util.Scanner;

public class Study02_Q2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	문제해석
		//	숫자가 주어진다 값은 cdefgabC =12345678 값을 가지고
		//	순서가 1-8이면 ascending, 8-1이면  descending, 아니면 mixed
		
		
		Scanner sc02 = new Scanner(System.in);
		
		int[] number = new int[8];
		for(int i=0; i<number.length; i++) {
			System.out.print("");
			number[i] = sc02.nextInt();
		}
		
		if (number[0]==1 && number[1]==2 && number[2]==3 && number[3]==4 && number[4]==5 && number[5]==6 && number[6] ==7 && number[7]==8 ) {
			System.out.println("ascending");
		} else if (number[0]==8 && number[1]==7 && number[2]==6 && number[3]==5 && number[4]==4 && number[5]==3 && number[6] ==2 && number[7]==1) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	
		
	}
}
