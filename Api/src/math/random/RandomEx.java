package math.random;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random();
		
		System.out.println("선택 번호: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] winningNumber = new int[6];
		random = new Random(14);
		System.out.println("당첨 번호: ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
		      System.out.print(winningNumber[i] + " ");
		}
		 System.out.println();
		 
		 
		 Arrays.sort(selectNumber);
		 Arrays.sort(winningNumber);
		 boolean result = Arrays.equals(selectNumber,winningNumber);
		 // equals는 두 배열 안에 있는 값이 일치하면 true값을 반환한다.
		 System.out.println("당첨 여부: ");
		 
		 if (result) {
			 System.out.println("1등에 당첨되셨습니다.");
		 } else {
			 System.out.println("당첨되지 않았습니다.");
		 }
		 
	}
}
