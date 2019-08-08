
public class Compare {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
//		System.out.println("a = " + a + " b = " + b);
//		System.out.println("a < b --------" + (a < b));
//		System.out.println("a > b --------" + (a > b));
//		System.out.println("a == b --------" + (a == b));
//		System.out.println("a = b --------" + (a = b));
		
		boolean c, d, e;
		
		c  = a < b;
		d = a > b;
		e = a == b;
		System.out.println("a = " + a + " b = " + b);
		System.out.println("a < b -----------" + c);
		System.out.println("a > b -----------" + d);
		System.out.println("a == b ---------" + e);
	}

}
