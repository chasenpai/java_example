package example.generic;

class Person02<T1, T2>{
	
	private T1 age;
	private T2 gender;
	
	public T1 getAge() {
		return age;
	}
	public void setAge(T1 age) {
		this.age = age;
	}
	public T2 getGender() {
		return gender;
	}
	public void setGender(T2 gender) {
		this.gender = gender;
	}

}

public class GenericEx02 {

	public static void main(String[] args) {
		
		Person02<Integer, String> p = new Person02<>();
		
		p.setAge(25);
		p.setGender("male");
		System.out.println(p.getAge());
		System.out.println(p.getGender());
	}
}
