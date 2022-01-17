package com.our.study;

import java.util.Scanner;

public class Study03_Q5554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("집-학교 : ");
		int s2 = sc3.nextInt();
		System.out.println();
		System.out.print("학교-PC방 : ");
		int s3 = sc3.nextInt();
		System.out.println();
		System.out.print("PC방-학원 : ");
		int s4 = sc3.nextInt();
		System.out.println();
		System.out.print("학원-집 : ");
		int s5 = sc3.nextInt();
		
		
		int s1 = s2+s3+s4+s5;
		
		int h;
		int m;
		int s;
		
		h = s1 / 60 / 60;
		System.out.println(h+"시간");
		
		
		if (s1/60 > 60) {
			m = (s1/60)%60;
			System.out.println(m+"분");
		}else {
			m = s1/60;
			System.out.println(m+"분");
		}
	
		s = s1%60;
		System.out.println(s+"초");
		
		
		
		
	}

}
