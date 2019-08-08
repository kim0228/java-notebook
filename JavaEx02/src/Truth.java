
public class Truth {
	public static void main(String[] args) {
		String right = "정답", wrong = "오답";
		boolean value;
		
		value = true;
		String answer = value ? right : wrong; // :의 왼쪽은 true, 오른쪽은 false를 선택하게 된다.
		System.out.println(answer);
		
		value = false;
		answer = value ? right : wrong;
		System.out.println(answer);
	}
}
