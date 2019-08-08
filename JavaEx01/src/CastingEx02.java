
public class CastingEx02 {
	public static void main(String[] args) {
		// 1byte = 8bit이다. 
		// byte는 1byte, int는 4byte, short는 2byte, long은 8byte이다.
		// 보통 int형을 사용한다.
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 
		
		System.out.println("i="+Integer.toBinaryString(i)); 
		// toBinaryString은 int값을 2진수 형태의 문자열로 변환해주는 메소드이다.
		
		float f   = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double)f;

		System.out.printf("f =%20.18f\n", f);
		System.out.printf("d =%20.18f\n", d);
		System.out.printf("d2=%20.18f\n", d2);
		// 실수형에는 float와 double을 사용하는데, 보통 double을 많이 사용한다.
		// float는 4바이트, double은 8바이트이다.
		
		
	}
}
