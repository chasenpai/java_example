package example.thread;

class Thread01 extends Thread{
	@Override
	public void run() { //Thread 클래스의 run()을 오버라이딩
		for(int i = 0; i < 1000; i++) {
			System.out.println("Hi");
		}
	}
}


class Thread02 implements Runnable{
	@Override
	public void run() { //Runnable 인터페이스의 run()을 구현
		for(int i = 0; i < 1000; i++) {
			System.out.println("Bye");
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		
		Thread01 th1 = new Thread01(); //Thread의 자식 클래스의 인스턴스 생성
		Thread th2 = new Thread(new Thread02()); //Runnable을 구현한 클래스의 인스턴스 생성
		
		th1.start(); //start()를 호출하여 스레드를 실행
		th2.start();
		//
	}
}
