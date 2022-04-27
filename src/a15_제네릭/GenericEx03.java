package a15_제네릭;

class Student <T1, T2>{
	
	private T1 name;
	private T1 grade;
	
	public T1 getName() {
		return name;
	}
	public void setName(T1 name) {
		this.name = name;
	}
	public T1 getGrade() {
		return grade;
	}
	public void setGrade(T1 grade) {
		this.grade = grade;
	}

}

class CollageStudent <T1, T2, T3> extends Student{
	
	private T3 major;

	public T3 getMajor() {
		return major;
	}

	public void setMajor(T3 major) {
		this.major = major;
	}
	
}

public class GenericEx03 {

	public static void main(String[] args) {
		
		CollageStudent<String, Integer, String> stu = new CollageStudent<>();
		
		stu.setName("신지드");
		stu.setGrade(4);
		stu.setMajor("화학공학");
		
		System.out.println("이름: " + stu.getName());
		System.out.println("학년: " + stu.getGrade());
		System.out.println("전공: " + stu.getMajor());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
