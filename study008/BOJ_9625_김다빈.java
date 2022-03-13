package study008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9625_김다빈 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		문제 접근
		1단계 : 0 1
		2단계 : 1 1
		3단계 : 1 2
		4단계 : 2 3
		5단계 : 3 5
		6단계 : 5 8 ... a[0]+a[1]=a[2] / b[0]+b[1]=b[2] 의 반복 -> 수열의 규칙
		
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		int a = 0;		//	a 초기값
		int aa = 1;		//	a 다음 값
		int b = 1;		//	b 초기값
		int bb = 1;		//	b 다음 값
		int tmpa = 0;	//	
		int tmpb = 1;	//
		
		int i=1;
		while (i<=k) {	//	k만큼 반복
			tmpa = a;	//	tmp = 0 (a초기값 저장)
			a = aa;		//	a = 1	(a다음값 저장)
			aa = tmpa+a;//	aa = 0+1(a의 이전값과 다음값 더하기를 k만큼 반복)
			
			tmpb = b;	//	tmp = 1 (b초기값 저장)
			b = bb;		//	b = 1   (b다음값 저장)
			bb = tmpb+b;//	bb = 1+1(b의 이전값과 다음값 더하기를 k만큼 반복)
			
			i++;		//	i++
		}
		System.out.println(tmpa + " "+tmpb); // 값 출력하기
	}

}
