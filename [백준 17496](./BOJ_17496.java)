package com.our.study;

import java.util.Scanner;

public class Study06_Q17496 {
	public static void main(String[] args) {
	
		Scanner sc6 = new Scanner(System.in);
		System.out.println("여름의 일 수 : ");
		int n = sc6.nextInt();
		
		System.out.println("스타후르츠 성장기간(일) : ");
		int t = sc6.nextInt();
		
		System.out.println("스타후르츠 심을 수 있는 칸 : ");
		int c = sc6.nextInt();
		
		System.out.println("스타후르츠 개당 가격 : ");
		int p = sc6.nextInt();
	
	
		int e;		//	수입
		int e1;		//	여름일 수 / 성장일	
		int e2;		//	수확일 t+1일
		
		e1 = n/t;	//	n/t : 여름일 수 / 성장기간
		
		e2 = t+1;	//	수확일 : 성장기간 +1
		
		if ((e1*t) < n) {		//	(여름일수/성장기간)*성장기간 값이 여름일 수 보다 작을 때
			
			e = e1*c*p;			//	(여름일수/성장기간)*심는칸*개당가격
	
		}else {					//	수확일이 초과하는 경우
			
			e = (e1-1)*c*p;		//	((여름일수/성장기간)-1) = 초과하면 결국 얻을 수 없는 것이므로 -1해준다.
								//	위와 똑같이 *심는칸*개당가격
			
		}
		
		System.out.println(e);
		
		
		
		
	}
}
