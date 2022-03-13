package study008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2748_김다빈 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0;		//	초기값 0
		int b = 1;		//	초기값 1
		int tmp =0;		//	
		int i=1;		//	반복문 초기값
		
		while(i<n) {	//	n만큼 반복
			tmp = a;	//	tmp에 a저장
			a = b;		//	a에 b저장
			b = tmp+a;	//	b에 a+b
			i++;		//	i증감
		}
		System.out.println(b);
		
	}

}
