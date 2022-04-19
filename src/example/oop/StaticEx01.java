package example.oop;

public class StaticEx01 {

	static int num = 1; //클래스 변수 선언
	String name; //인스턴스 변수 선언
	
	
	//호출될 때 마다 클래스 변수 num의 값이 1씩 증가하는 메소드
	void printNum() {
		System.out.println(name + " 기기의 대기순번: " + num);
		num++; 
	}
	
	public static void main(String[] args) {

		//대기번호표 뽑기
		StaticEx01 waitingNum1 = new StaticEx01();
		StaticEx01 waitingNum2 = new StaticEx01();
		StaticEx01 waitingNum3 = new StaticEx01();
		
		waitingNum1.name = "1번";
		waitingNum2.name = "2번";
		waitingNum3.name = "3번";
		
		waitingNum1.printNum();
		waitingNum3.printNum();
		waitingNum3.printNum();
		waitingNum2.printNum();
		waitingNum1.printNum();
		waitingNum2.printNum();
		waitingNum3.printNum();
		waitingNum2.printNum();
		waitingNum1.printNum();
		/*
		 *  메소드 호출시
		   	1번 기기의 대기순번: 1
			3번 기기의 대기순번: 2
			3번 기기의 대기순번: 3
			2번 기기의 대기순번: 4
			1번 기기의 대기순번: 5
			2번 기기의 대기순번: 6
			3번 기기의 대기순번: 7
			2번 기기의 대기순번: 8
			1번 기기의 대기순번: 9
			로 출력된다.
		 */
	}

}