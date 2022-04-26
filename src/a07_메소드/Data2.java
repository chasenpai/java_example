package a07_메소드;

public class Data2 {

	int x;
	
	static Data2 copy(Data2 data) {
		Data2 tmp = new Data2(); //새로운 객체 tmp를 생성
		
		tmp.x = data.x; //data.x의 값을 tmp.x에 저장
		
		return tmp; //복사한 객체의 주소를 반환한다
	}
	
	public static void main(String[] args) {
		
		Data2 data = new Data2();
		
		data.x = 10;
		
		Data2 data2 = copy(data); //반환한 tmp의 값을 참조변수  data2에 저장함
		
		System.out.println("data = " + data.x);
		System.out.println("data2 = " + data2.x);
		
		//data = 10
		//data2 = 10

	}

}
