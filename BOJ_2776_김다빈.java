package study020;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2776_김다빈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// t : test 개수
		// n : 수첩 1 숫자 개수 , arr : 수첩 1 숫자 순서
		int t = sc.nextInt();
		int cnt = 0;
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		// 수첩 1 숫자 받기
		while(cnt < t) {
			for(int i=0; i<t; i++) {
				for(int j=0; j<arr.length; j++) {
					arr[j] = sc.nextInt();
				}
			}
			cnt++;
		}
		
		cnt = 0;
		// m : 수첩 2 숫자 개수, brr : 수첩 2 숫자 순서
		int m = sc.nextInt();
		int[] brr = new int[m];
		
		// 수첩 2 숫자 받기
		while(cnt < t) {
			for(int i=0; i<t; i++) {
				for(int j=0; j<brr.length; j++) {
					brr[j] = sc.nextInt();
				}
			}
			cnt++;
		}
		
		// 수첩 2숫자를 수첩 1 숫자와 비교하기
		Arrays.sort(arr);
		
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		for(int i=0; i<brr.length; i++) {
//			System.out.print(brr[i] + " ");
//		}
		cnt = 0;
		while(cnt < t) {
			for(int i=0; i<brr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(brr[i]==arr[j]) {
						System.out.println(1);
						break;
					}else if(j==arr.length-1 && brr[i] != arr[j]) {
						System.out.println(0);
					}
				}
			}
			cnt++;
		}	
	}
}
