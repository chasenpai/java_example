package example.generic;

class Box<T> {
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class GenericEx04 {
	
	public static <T>Box<T> boxing(T t){
		Box<T> box = new Box<>(); //Box 클래스를 생성하고 매개변수로 받은 값을
		box.setData(t); //Box 클래스의 멤버변수 data의 값으로 초기화하고 리턴
		
		return box;
	}
	
	public static void main(String[] args) {
		
		Box<Integer> box1 = boxing(100);
		
		int value1 = box1.getData(); //T 제네릭 타입이 Integer로 변환
		System.out.println(value1);
		
		Box<String> box2 = boxing("백");
		
		String value2 = box2.getData(); //T 제네릭 타입이 String으로 변환
		System.out.println(value2);
	}

}
