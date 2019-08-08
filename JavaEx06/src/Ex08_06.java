
public class Ex08_06 {

	public static void main(String[] args) {
		
		int aa[] = {10,20,30,40,50};
		int count, size;
		int i = 0;
		int hap = 0;
		
		count = aa.length;
		size = count * Integer.BYTES;
		
		System.out.printf("배열 aa[]의 요소의 개수는 %d개 입니다.\n",count);
		System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다.\n",size);
		
		for (i = 0;i < count; i++) {
			hap = hap + aa[i];
		}
		System.out.print("배열 요소의 전체 합은: " + hap);
	}

}
