
public class Ex08_09 {

	public static void main(String[] args) {
		
		int[][] aa = {
				{1,2,3,4},
				{5,6,7,8},
				{9, 10, 11, 12} // 배열 정의 및 초기화
		};
		int i,k;
		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력 \n");
		for (i = 0;i<3;i++) {
			for(k = 0;k<4; k++) {
				System.out.printf("%3d", aa[i][k]); // 배열값 출력
			}
			System.out.println("\n"); // 배열이 모두 출력되면 줄바꿈을 해준다.
		}
	}

}
