package a07_메소드;

public class MethodEx01 {

//  1   2    3	
	int add(int a, int b) {
//      4		
		int result = a + b;
		System.out.println(result);
//      5		
		return result;
	}
	/*
	 *  1: 반환타입(출력)
	 *  2: 메소드 이름
	 *  3: 매개변수 선언(입력)
	 *  4: 수행될 코드
	 *  5: 수행 결과를 반환
	 */
	public static void main(String[] args) {
		
		MethodEx01 m1 = new MethodEx01();
		
		m1.add(10, 20); //메소드 호출시 인자 10과 20이 매개변수로 대입됨 : 30 출력
		
	}

}
