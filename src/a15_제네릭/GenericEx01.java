package a15_제네릭;

class Person01<T>{ //제네릭 클래스 생성
	
	private T age; //제네릭 타입 변수

	public T getAge() { //제네릭 타입을 리턴 받는 getter 메소드
		return age;
	}

	public void setAge(T age) { //제네릭 타입 파라미터를 받는 setter 메소드
		this.age = age;
	}

}

public class GenericEx01<T> {
	
	public static void main(String[] args) {
		
		Person01<Integer> g1 = new Person01<Integer>();//T 제네릭 타입이 Integer로 변환
		Person01<String> g2 = new Person01<String>(); //T 제네릭 타입이 String으로 변환
		
		g1.setAge(25);
		g2.setAge("이십오");
		
		System.out.println(g1.getAge());
		System.out.println(g2.getAge());

		
	}

}
