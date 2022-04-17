package example.oop;

class Phone {

	String number;
	
	void call() {
		System.out.println(this.number + "로 전화를 연결중입니다.");
	}
	
	void message() {
		System.out.println(this.number + "로 문자를 보냈습니다.");
	}
}

class SmartPhone extends Phone { //부모클래스 Phone을 상속받음

	//자식클래스에 부모클래스의 멤버변수와 메소드가 자동으로 추가됨
	
	String web;
	
	void webSurfing() {
		System.out.println(this.web + "사이트로 접속합니다.");
	}

}

public class InheritanceEx01 {

	public static void main(String[] args) {
		
		SmartPhone smp = new SmartPhone();
		
		smp.number = "010-1234-5678";
		smp.web = "www.google.com";
		
		smp.call();
		smp.message();
		smp.webSurfing();
		
		//010-1234-5678로 전화를 연결중입니다.
		//010-1234-5678로 문자를 보냈습니다.
		//www.google.com사이트로 접속합니다. 가 출력된다.

	}
}
