
public class FormatSample {
	public static void main(String[] args) {
		int a = 10;
		double b = 3.24;
		System.out.printf("%10d\n", a); // 공백을 포함하여 10자리로 표시
		System.out.printf(" X %8.5f\n", b); // 전체를 8자리, 소수점 이하는 5자리로 표시
		System.out.printf("----------------\n"); // \n은 줄 바꿈을 의미
		System.out.printf("%10f\n\n", a * b); // a와 b를 곱하고, 공백을 포함하여 10자리로 나타냄
		
	}
}
