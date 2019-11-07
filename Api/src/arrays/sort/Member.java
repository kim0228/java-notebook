package arrays.sort;

public class Member implements Comparable<Member>{
	String name;
	
	 Member(String name) {
		this.name = name;
	}
	 
	 @Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		// 현재 객체 < 파라미터로 넘어온 객체: 음수를 리턴
		// 현재 객체 == 파라미터로 넘어온 객체: 0을 리턴
		// 현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
		// 양수일 때에는 두 객체의 자리가 바뀌지만, 음수 또는 0일 때에는 객체의 자리가 그대로 유지된다.
	}
}
