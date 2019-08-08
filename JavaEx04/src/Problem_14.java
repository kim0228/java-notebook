
public class Problem_14 {
	public static void main(String[] args) {
	int i,j;
		for (i = 2; i<= 9; i++) {
			System.out.printf("  #제%d단#", i);
		}
		System.out.println("\n\n");
		for (i = 1; i <= 9; i++) { // 각 단의 뒷자리 숫자 1~9를 반복
			for (j = 2; j <= 9; j++) { // 2~9단을 반복
				System.out.printf("%2d X %2d =%2d ",  j,  i,  j * i);
			}
			System.out.printf("\n");
		}
	}
}
