package study002;

import java.util.Scanner;

public class BOJ_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc04 = new Scanner(System.in);
		int n = sc04.nextInt();
		int dan=0;
		for(int i=1; i<10; i++) {
			dan = i*n;
			System.out.println(n+" * "+i+" = "+dan);
		}	
	}
}
