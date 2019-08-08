import java.util.Scanner;

public class Ex06_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i;
		int dan;
		
		System.out.printf(" 몇 단? ");
		dan = s.nextInt();
		
		for (i = 9; i >= 1; i--) {
			System.out.printf(" %d X %d = %d \n", dan, i, dan * i);
		}
	}
}
