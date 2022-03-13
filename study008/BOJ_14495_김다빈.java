package study008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14495_김다빈 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[117];					//	int로하니까 오류나서 long으로 사용
		
		arr[1] = arr[2] = arr[3] = 1;				//	배열 초기값
		
		for(int i=4; i<=n; i++) {
			arr[i] = arr[i-1]+arr[i-3];
		}
		System.out.println(arr[n]);
	}
}
