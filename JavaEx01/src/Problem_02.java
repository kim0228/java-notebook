import java.util.Scanner;

public class Problem_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a, b;
		int result;
		int k;
		
		// 값을 입력받는 부분
		System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
		a = s.nextInt();
		System.out.print("<1>덧셈 <2>뺄셈 <3>곱셉 <4>나눗셈 ==>");
		k = s.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ==> ");
		b = s.nextInt();
		
		// if문으로 사칙연산 조건을 나눔
		if (k == 1) {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		} else if (k == 2){
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		} else if (k == 3) {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		} else if(k == 4) {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		} else {
			System.out.println("오류가 났습니다. 다시 처음부터 입력해주세요.");
		}
	}
}