import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SungJuk sunjuk = new SungJuk();
		int i = 0;
		
		while(true) {
			Student student = new Student();
			System.out.println("1. 입력 2. 수정(이름) 3. 삭제(이름) 4. 출력");
			
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				sunjuk.Input(student);
				i++;
				break;
				
			case 2:
				sunjuk.Modify();
				break;
				
			case 3:
				sunjuk.Delete();
				break;
				
			case 4:
				sunjuk.Output();
				break;
			
			default:
				break;
			}
		}
	}
}