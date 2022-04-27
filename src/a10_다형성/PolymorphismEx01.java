package a10_다형성;

class Tv {
	boolean power;
	int channel;
	
	void power() {
		power =! power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv {
	String text;
	
	void caption() {

	}
}

public class PolymorphismEx01 {

	public static void main(String[] args) {
		
		Tv tv = new SmartTv(); //부모 타입 참조변수로 자식 타입 인스턴스 참조
		
		//tv.caption(); //오류 발생
	}
	
}
