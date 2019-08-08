package beeptask;

public class BeepPrintExample {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask(); // Runnable구현 객체 생성 후, 이것을 매개값으로 thread 생성자를 호출
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		
	}
}
