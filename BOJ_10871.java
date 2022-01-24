package study002;

import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
    	
    	
    	//	문제 
    	//	n,x를 입력 받기
    	//	n은 곧 배열의 길이
    	//	x랑 비교해서 작은수만 출력하기
    	
    	
    	//	스캐너 정의
        Scanner sc06 = new Scanner(System.in);
      
        //	x,(n:배열길이) 값 입력받기
        int n = sc06.nextInt();
        int x = sc06.nextInt();

        //	n길이의 배열 생성
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
        	//	arr에 n개의 값 입력해주기
            arr[i] = sc06.nextInt();
        }
        
        //
        for (int i=0; i<n; i++) {
            if (arr[i]<x) { 			//	arr에 저장된 값이랑 x값이랑 비교해서 x보다 작으면 출력
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
