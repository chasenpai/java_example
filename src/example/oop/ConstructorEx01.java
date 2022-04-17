package example.oop;


class Car {

	String name;
	String company;
	int year;
	
	Car(){ //기본 생성자
		
	}
	
	//매개 변수가 있는 생성자
	Car(String name){
		this.name = name; //this.name은 인스턴스 변수 name을 가르킴
	}
	
	Car(String name, String company){
		this.name = name;
		this.company = company;
	}
	
	Car(String name, String company, int year){
		this.name = name;
		this.company = company;
		this.year = year;
	}
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car("Bmw i8"); //인스턴스를 생성과 동시에 초기화
		Car car3 = new Car("Bmw i8", "Bmw");
		Car car4 = new Car("Bmw i8", "Bmw", 15);
		
	}
}
