
public class Number {
	public static void main(String[] args) {
		int [][] a = {
				{10,20},
				{30,40},
				{50,60}
		};
		System.out.println("a[0][0]=" + a[0][0] + " a[0][1]=" + a[0][1]);
		System.out.println("a[1][0]=" + a[1][0] + " a[1][1]=" + a[1][1]);
		System.out.println("a[2][0]=" + a[2][0] + " a[2][1]=" + a[2][1]);
		System.out.println( "---------------------------------------------------------------------------");
		
		int i=5, j=0;

		j = i++; // j에 i값을 대입한 후, i값에 1을 더한다.
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j); // i = 6, j = 5

		i=5;        // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i; // i값에 1을 먼저 더한 후, j에 1을 더한 값을 대입한다.
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j); // i = 6, j = 6
	}
}
