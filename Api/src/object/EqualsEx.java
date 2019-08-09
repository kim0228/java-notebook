package object;

public class EqualsEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj1);
		// equals()는 두 개의 객체가 같은지 비교하여 같으면 true를, 아니면 false를 반환한다.
		System.out.println(result);
		
		boolean result2 = (obj1 == obj2);
		// ==는 데이터 값과 주소값을 비교한다. 두 객체가 생성된 주소값이 다르기 때문에 결과값으로 false를 반환한다.
		System.out.println(result2);
	}
}
