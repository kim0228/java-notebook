
public class Ex06_14 {
	public static void main(String[] args) {
		int i,j;
		
		for (i = 2; i <= 9; i++) { // 2~9단을 반복
			System.out.printf("##제 %d 단 ## ", i);
			for (j = 1; j <= 9; j++) { // 각 단의 뒷자리 숫자 1~9를 반복
				System.out.printf("%3d X %d = %2d", i, j, i * j);
			}
			System.out.printf("\n");
		}
	}
}
