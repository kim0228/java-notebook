
public class Ex03_12 {
	public static void main(String[] args) {
		char a,b,c,d,e;
		
		a = 'A';
		System.out.printf(" %c \t", a);
		System.out.printf(" %d \n", (int)a);
		
		b = 'a'; // 'a'는 아스키코드로 숫자 97이랑 동일하다. 그래서, 숫자 97이 b로 대입된다. 
		c = (char)(b + 1); // 그래서 b + 1은 98이 되지만 char형으로 형변환을 해주었기에 
		System.out.printf(" %c \t", b);
		System.out.printf(" %c \n", c); // 여기서는 문자 'b'가 출력하게 된다.
		
		d = 90; // char형은 문자뿐만 아니라 값의 범위에 해당하는 정수도 넣을 수 있다. 
		System.out.printf(" %c \n", d);
		
		d = '가'; // 한글 '가'는 44032 코드 값인 걸로 확인됨.
		e = (char)(d + 1);
		System.out.printf(" %d \t", (int)d);
		System.out.printf(" %c \n", e);
	}

}
