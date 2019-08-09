package beeptask;

public class BeepPrintExample {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask(); // Runnable인터페이스로 구현한  BeepTask 객체 생성 
		Thread thread = new Thread(beepTask); // 생성한 객체를 매개값으로 thread 생성자를 호출
		thread.start(); // start()메소드가 실행되면, run()메소드를 호출하여 실행한다.		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // sleep()은 주어진 시간 동안 일시 정지 상태가 된다. 시간이 지나면 실행 대기가 된다.
			} catch (Exception e) {
			}
		}
		
	}
}
