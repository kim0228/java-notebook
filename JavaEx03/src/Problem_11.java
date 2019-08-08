import java.util.Scanner;

public class Problem_11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		char c;
		
		System.out.print("첫번째 수를 입력하세요 : ");
		a = s.nextInt();
		System.out.print("계산할 연산자를 입력하세요 : ");
		c = s.next().charAt(0); // next()는 문자열을 입력받고, charAt(0)은 그중 첫번째 글자를 추출해준다.
		System.out.print("두번째 수를 입력하세요 : ");
		b = s.nextInt();
		
//		if (c == '+') 
//			System.out.printf("%d + %d = %d입니다.", a, b, a + b);
//		if (c == '-')
//			System.out.printf("%d - %d = %d입니다.", a, b, a - b);
//		if (c == '*')
//			System.out.printf("%d * %d = %d입니다.", a, b, a * b);
//		if (c == '/')
//			System.out.printf("%d / %d = %d입니다.", a, b, a / b);
//		if (c == '%')
//			System.out.printf("%d %% %d = %d입니다.", a, b, a % b);
		
		// Problem_12
		if (c == '+') 
			System.out.printf("%d + %d = %d입니다.", a, b, a + b);
		else if (c == '-')
			System.out.printf("%d - %d = %d입니다.", a, b, a - b);
		else if (c == '*')
			System.out.printf("%d * %d = %d입니다.", a, b, a * b);
		else if (c == '/')
			System.out.printf("%d / %d = %d입니다.", a, b, a / b);
		else if(c == '%')
			System.out.printf("%d %% %d = %d입니다.", a, b, a % b);
		else
			System.out.printf("연산자를 잘못 입력했습니다. \n");
	}
}
