<font class="papago-parent"><font class="papago-source" style="display:none;">package com.our.study;
</font>패키지 com.our.study;
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">import java.util.</font>java.util 가져오기</font><font class="papago-parent"><font class="papago-source" style="display:none;">Scanner;
</font>스캐너;
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">public class Study02_Q3003 {
</font>공공수업 Study02_Q3003 {
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">	public static void main(String[] args) {
</font>	공용 정적 보이드 주(String[] args) {
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		// TODO Auto-generated method stub
</font>		// TODO 자동 생성 메서드 스텁
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		int[] chess = {1,1,2,2,2,8};
</font>		int[] 체스 = {1,1,2,2,2,8};
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		int[] arr = new int[6];</font>		int[] arr = new int[6];</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">		int j = 0;
</font>		int j = 0;
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		
</font>		
		
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		Scanner sc2 = new Scanner(System.in);</font>		스캐너 sc2 = 새 스캐너(System.in);</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">		int[] dh = new int[6];</font>		int[] dh = new int[6];</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">		System.out.print("동혁이의 체스 입력 : ");
</font>		System.out.print("동혁이의 체스 입력 : ");
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		
</font>		
		
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		for(int i=0; i<dh.length;i++) {
</font>		for(i=0; i<length;i++) {
</font><font class="papago-parent"><font class="papago-source" style="display:none;">			
</font>			
			
</font><font class="papago-parent"><font class="papago-source" style="display:none;">			dh[i] = sc2.nextInt();
</font>			dh[i] = sc2.nextInt();
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		}
</font>		}
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		
</font>		
		
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		System.out.print("동혁이 체스 값 : ");
</font>		System.out.print("동혁이 체스 값 : ");
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		for(int i=0; i<dh.length; i++) {
</font>		for(i=0; i<length;i++) {
</font><font class="papago-parent"><font class="papago-source" style="display:none;">			System.out.print("\t" + dh[i])</font>			System.out.print("\t" + dh[i])</font><font class="papago-parent"><font class="papago-source" style="display:none;">;
</font>;
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		}
</font>		}
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		System.out.println();
</font>		System.out.println();
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		System.out.print("부족한 체스 : ");
</font>		System.out.print("부족한 체스 : ");
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		for(int i=0; i<chess.length; i++) {
</font>		for(i=0; i<length; i++) {
</font><font class="papago-parent"><font class="papago-source" style="display:none;">			j = chess[i] - dh[i];</font>			j = 체스[i] - dh[i];</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">			System.out.print("\t" + j);
</font>			System.out.print("\t" + j);
</font><font class="papago-parent"><font class="papago-source" style="display:none;">			
</font>			
			
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		}
</font>		}
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		
</font>		
		
</font><font class="papago-parent"><font class="papago-source" style="display:none;">	
</font>	
	
</font><font class="papago-parent"><font class="papago-source" style="display:none;">		
</font>		
		
</font><font class="papago-parent"><font class="papago-source" style="display:none;">	}
</font>	}
</font><font class="papago-parent"><font class="papago-source" style="display:none;">	
</font>	
	
</font><font class="papago-parent"><font class="papago-source" style="display:none;">
</font>

</font><font class="papago-parent"><font class="papago-source" style="display:none;">}
</font>}
</font>
