package a13_유용한클래스;

class Value {
	
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}

public class EqualsEx01 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다"); //주소값이 다르기 때문
		}
	}
}
