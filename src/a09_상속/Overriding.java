package a09_상속;

class Student {

	String name;
	int grade;
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("학년: " + this.grade);
	}
}

class CollegeStudent extends Student {
	 
	 String major;

	 @Override  //상속받은 showInfo 메소드를 수정함(오버라이딩)
	public void showInfo() {
		super.showInfo(); //super는 상속받은 멤버를 참조함
		System.out.println("전공: " + this.major);
	}

}

public class Overriding {

	public static void main(String[] args) {
		
		CollegeStudent cstu = new CollegeStudent();
		
		cstu.name = "홍길동";
		cstu.grade = 4;
		cstu.major = "의적";
		
		cstu.showInfo();
	}
}
