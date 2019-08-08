
public class Ex06_09 {
	public static void main(String[] args) {
		int hap = 0;
		int i;
		
		for (i = 3; i <= 100; i = i + 3) {
			hap = hap + i;
		}
		System.out.println("3의 배수의 합계는 : " + hap);
	}
}
