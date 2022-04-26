package a15_예외처리;

public class ExceptionEx03 {

	static void method1() throws Exception {
		method2();
		//예외를 호출한 method1로 예외를 넘김
	}

	static void method2() throws Exception {
		throw new Exception();
		//예외가 강제적으로 발생
	}
	
	public static void main(String[] args) throws Exception {
		method1();
		//예외를 main으로 넘김
	}
}