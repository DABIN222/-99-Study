package study002;

import java.util.Scanner;

public class BOJ_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//	세준이 성적표조작하기
		//	최댓값 	: M
		//	모든점수 	: 점수/M*100
		//	평균 구하는 프로그램 작성
		
		
		//	값 배열에 입력받기
		Scanner sc03 = new Scanner(System.in);
		
		int n = sc03.nextInt();
		int[] arr = new int[n];
		int[] arv = new int[n];
		
		int avr=0;
		float sum=0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc03.nextInt();
			sum += arr[i];
		}
		
		//	max값 구하기
		int m = arr[0];
		for(int j=0;j<n;j++) {
			if(m >= arr[j]) {
				m = m;
			}else {
				m = arr[j];
			}
		}
		
		//	(점수/최고점*100)/3 평균 구하기
		System.out.println((sum/m)*100/n);
		
	}
}
