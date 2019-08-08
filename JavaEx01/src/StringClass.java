import java.util.StringTokenizer;

public class StringClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Java의 그림책";
		int len = a.length();
		String b = a.substring(len-3, len);
		int c = b.compareTo("그림책"); // compareTo는 문자열을 사전적으로 비교
		// b가 "그림책"보다 앞이면 음수, 같으면 0, 뒤면 양수를 반환한다.
		
		System.out.println(c);
		System.out.println(len);
		System.out.println("a의 마지막 3문자는" + b);
		System.out.println("그림책" + (c == 0 ? "입니다" : "이 아닙니다"));
		// ?는 조건연산자로 여기서는 c가 0이라면 '입니다', 그렇지 않으면 '아닙니다'를 표시한다.
		
		StringTokenizer v = new StringTokenizer("a b c");
		// StringTokenizer는 문자열을 분할하는 클래스이다.
		String s = v.nextToken();
		
		while(v.hasMoreTokens()) { // 토큰이 있는 한 처리를 반복한다. hasMoreToken는 취득하지 않은 토큰이 있다면 
			// true를 반환한다.
			s = s + "+" + (v.nextToken());
		}
		System.out.println(s);
	}

}
