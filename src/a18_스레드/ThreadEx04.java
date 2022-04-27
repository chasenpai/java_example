package a18_스레드;

class Thread05 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				sleep(1000); //스레드를 1000밀리초 만큼 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.interrupted();
		}
	}
}

public class ThreadEx04 {
	
	public static void main(String[] args) {
		
		Thread05 th5 = new Thread05();
		
		th5.start();
		
	}

}
