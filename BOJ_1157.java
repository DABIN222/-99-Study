package study002;

import java.util.Scanner;

public class BOJ_1157 {
	
	//	영어 알파벳 27개 여서 27개의 배열 생성
	static int arr[] = new int[27];
	static int max = -1;
	static int index = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();				//	input에 단어저장
		scan.close();							//	스캐너쓰고 항상 닫아주기
		
		//	처음부터 대문자로 변환하고 시작하는 함수 toUpperCase
		//	내장함수(toUpperCase) 사용
		input = input.toUpperCase();
		
		//	input의 길이까지 반복
		for (int i = 0; i < input.length(); i++) {
			arr[(input.charAt(i) - 65)]++;	
			//	A=65, B=66, ... 배열 1부터 
			//	대문자니까 -65를 해주면 A=1,B=2,C=3,D=4,... 이렇게 된다.
		}
		
		//	문자만큼 도는 반복문 생성
		for (int i = 0; i < 27; i++) {
			
			if(max < arr[i])
			{
				max = arr[i];			//	max값에 arr[i]값 저장
				index = i;				//	index에 i 값 저장
			} else if(max == arr[i])	// 만약 같다면
			{
				index = -1;				// index = -1 저장
			}
		}
		
		if(index == -1)					//	index=-1이면 ?출력하고 끝
		{
			System.out.println("?");
			System.exit(0);
		}
        //	int index 값을 다시 알파벳으로 변환
		System.out.println((char)(index+65));	
	
	}
}

