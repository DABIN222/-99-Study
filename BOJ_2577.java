package study002;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//	문제 접근
		//	숫자의 개수 구하기
		//	A,B,C 값 입력받아서 A*B*C 구한 다음에 0~9 쓰인 갯수구하기
		
		Scanner sc05 = new Scanner(System.in);
		
		//	A,B,C 값 따로 받기
		int A = sc05.nextInt();
		int B = sc05.nextInt();
		int C = sc05.nextInt();
		
		//	A*B*C 곱한 값을 스트링으로 변환하자
		String mul = A*B*C + "";
//		System.out.println(mul);	-- 중간값확인
	
		//	문자형태로 배열 생성
		char arr[] = {'0','1','2','3','4','5','6','7','8','9'};
		//	단어를 담을 용도의 문자형 배열
		char brr[] = new char[mul.length()];			// 곱한 값만큼의 배열을 만들어주자
		int crr[] = new int [10];
		
		int c= 1;
		
		for(int i=0; i<mul.length(); i++) {
			brr[i] = mul.charAt(i);						// 한글자씩 저장한다.
		}

		//	본격적으로,
		//	brr과 arr[i]가 일치할때 crr++해준다.
		for(int i =0; i<brr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if(brr[i]==arr[j]) {
					crr[j]++;
				}
			}
		}
		
		//	crr에저장된 값을 출력해준다.
		for(int i=0; i<crr.length; i++) {
			System.out.println(crr[i]);
		}		
	}		
}
