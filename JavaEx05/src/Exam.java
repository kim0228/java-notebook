
public class Exam {
	public static void main(String[] args) {
		int i;
		int hap = 0;
		
		i = 1;
		while (i <= 100) {
			if ((i % 5 == 0) || (i % 8 == 0))
				hap = hap + i;
			
			i++;
		}
		System.out.printf("5의 배수와 8의 배수의 합: %d \n", hap);
		
		// for문
		int hap1 = 0;
		
		for (int j = 1; j <= 100; j++) {
			if((j % 5 == 0) || (j % 8 == 0)){
				hap1 = hap1 + j; 
			}
		}
		System.out.printf("5의 배수와 8의 배수의 합: %d \n", hap1);
	}
}