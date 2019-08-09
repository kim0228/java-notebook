package arrays.sort;

import java.util.Arrays;


public class SortEx {
	public static void main(String[] args) {
		int[] scores = { 99, 94, 14 };
		Arrays.sort(scores); // sort()으로 오름차순 및 내림차순을 할 수 있다. 
		// 파라미터로 기본 데이터 타입과 객체를 받을 수 있다.
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();

		String[] names = { "최선호", "홍길동", "김남준" };
		// String클래스에서는 사전순으로 정렬이 된다.
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
		System.out.println();

		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김남준");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
	}
}
