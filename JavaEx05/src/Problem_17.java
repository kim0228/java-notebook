import java.util.Scanner;

public class Problem_17 {
	
	public void baesuHap(int start,int end,int baesu) {
		int i = 0;
		int hap = 0; // i와 hap은 지역변수
		i = start; 
		while( i <= end) {
			if (i % baesu == 0) 
				hap = hap + i;
				i++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d ",start,end,baesu,hap);
	}
	
	public static void main(String[] args) {
		
		Problem_17 problem = new Problem_17(); // 객체 선언
		
		int start,end; // 시작값과 끝값
		int baesu; // 배수
		Scanner s = new Scanner(System.in);
		System.out.print("합계의 시작값 ==> ");
		start = s.nextInt();
		System.out.print("합계의 끝값 ==> ");
		end = s.nextInt();
		System.out.print("배수 ==>");
		baesu = s.nextInt();
		
		problem.baesuHap(start,end,baesu);
		
	}
	
}


// 		for문으로 했을 때
//		for (i = start; i <= end; i++) {
//			if (i % baesu == 0) {
//				hap = hap + i;
//			}
//		}