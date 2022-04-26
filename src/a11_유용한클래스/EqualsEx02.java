package a11_유용한클래스;

class Person {
	int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return age == ((Person)obj).age; //age의 값을 참조하기 위해 Person타입으로 형변환
		}else {
			return false;
		}
	}
}

public class EqualsEx02 {

	public static void main(String[] args) {
		
		Person p1 = new Person(25);
		Person p2 = new Person(25);
		
		if(p1.equals(p2)) {
			System.out.println("나이가 같습니다.");
		}else {
			System.out.println("나이가 다릅니다");
		}
	}//결과: 나이가 같습니다.
}
