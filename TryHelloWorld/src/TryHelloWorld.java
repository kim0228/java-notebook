import java.util.Arrays;
import java.util.Scanner;

public class TryHelloWorld {
	
	public int[] gcdlcm(int a, int b) {
		int [] answer = new int[2];
		int temp = 1;
		int gcd = a*b;
		while(temp != 0) {
			temp = b%a;
			b = a;
			a = temp;
		}
		answer[0] = b;
		answer[1] = gcd/b;
			return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		TryHelloWorld c = new TryHelloWorld();
		System.out.println(Arrays.toString(c.gcdlcm(num1, num2)));
	}

}