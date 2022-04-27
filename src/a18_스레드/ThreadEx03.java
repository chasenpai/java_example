package a18_스레드;

class Thread03 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("thread1");
		}
	}
}

class Thread04 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("thread2");
		}
	}
}

public class ThreadEx03 {

	public static void main(String[] args) {
		
		//멀티스레드 - 작업을 번갈아가면서 실행
		Thread03 th3 = new Thread03();
		Thread04 th4 = new Thread04();
				
		th3.start();
		th4.start();
	}
}
