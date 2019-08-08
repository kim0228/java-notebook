
public class Ex04_04 {
	public static void main(String[] args) {
		int a = 10,b;
		
		
		b = a++; // b = a를 먼저 실행하고, a의 값을 1 증가시킨다. 
		System.out.printf(" %d \n", b); // 그래서 b의 값은 10이고, a는 1 증가 되어서 11인 상태이다.
		
		b = ++a; // a의 값을 먼저 1 증가시킨 뒤, a를 b에 대입한다.
		System.out.printf(" %d \n",b); // 그래서 b는 12이다.
		
	}
}
