package beeptask;

import java.awt.Toolkit;

public class BeepPrintLambdaEx {
	public static void main(String[] args) {
		Thread thread = new Thread(()->{ // 람다식으로 thread사용. 괄호 안에 쓰레드가 실행될 코드가 들어간다.
			Toolkit tookit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tookit.beep();
				System.out.println("빞");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		thread.start();
	}
}
