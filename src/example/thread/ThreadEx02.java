package example.thread;

public class ThreadEx02 {

	public static void main(String[] args) {

		//싱글스레드 - 작업을 순차적으로 실행
		for(int i = 0; i < 1000; i++) {
			System.out.println("thread1");
		}
		for(int i = 0; i < 1000; i++) {
			System.out.println("thread2");
		}
	
	}
}
