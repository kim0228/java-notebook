package beeptask;

import java.awt.Toolkit;

// 쓰레드 인터페이스로 구현한 클래스
public class BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("빞");
			toolkit.beep();// 소리를 나게 하는 메소드
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
