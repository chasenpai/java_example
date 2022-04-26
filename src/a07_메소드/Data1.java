package a07_메소드;

public class Data1 {

	int x;
	
	static void change1(int x) {
		x = 1000;
		System.out.println("메소드 호출: x = " + x);
	}
	
	static void change2(Data1 data) { //참조형 매개변수
		data.x = 1000;
		System.out.println("메소드 호출: x = " + data.x);
	}

	
	public static void main(String[] args) {
		
		Data1 data1 = new Data1();
		
		data1.x = 10;
		System.out.println("메소드 호출 전: x = " + data1.x);
		change1(data1.x);
		System.out.println("메소드 호출 후: x = " + data1.x);
        //메소드 호출 전: x = 10
		//메소드 호출: x = 1000
		//메소드 호출 후: x = 10
		
		Data1 data2 = new Data1();
		
		data2.x = 10;
		change2(data2); //data2.x의 값이아닌 data2의 주소를 넘겨받아 메소드를 호출
		System.out.println("메소드 호출 후: x = " + data2.x); 
		//메소드 호출 전: x = 10
		//메소드 호출: x = 1000
		//메소드 호출 후: x = 1000


	}

}
