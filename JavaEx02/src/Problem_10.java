import java.util.Scanner;

public class Problem_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.print("연도를 입력하세요 : ");
		year = s.nextInt();
		
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + " 년은 윤년입니다.");
		} else {
			System.out.print("윤년이 아닙니다.");
		}
		
		int a = 100;
		
		System.out.printf(" %d \n", ++a); // 101
		System.out.printf(" %d \n", a++); // 101이 출력되고 그 다음에 1이 증가하여 a의 값은 여기서 102가 되어있다.
		System.out.printf(" %d \n", --a); // a가 102였으니 하나 감소하여 101이 나옴.
	}
}
