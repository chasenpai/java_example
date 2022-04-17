package example.oop;


public class OverloadingEx01 {

	void add(int a, int b) {
		System.out.println(a + b);
	}
	
	//위의 메소드와 매개변수의 이름만 다를 뿐 개수와 타입이 같으므로 오버로딩이 아니다.(에러 발생)
	//void add(int x, int y) {
		//System.out.println(x + y);
	//}
	
	//위의 메소드와 매개변수 타입은 같지만 개수가 다르므로 오버로딩이 성립된다
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	//위의 메소드와 매개변수의 타입이 다르므로 오버로딩이 성립된다
	void add(long a, long b) {
		System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		
		OverloadingEx01 test = new OverloadingEx01();
		
		test.add(10, 10);
		test.add(10, 10, 10);
		test.add(10L, 10L);
		//메소드 호출시 매개변수의 타입과 개수에 따라 위의 오버로딩된 메소드들 중에 하나가 실행된다.
		
	}
}