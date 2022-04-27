package a10_다형성;

class Car {
	
}

class Firetruck extends Car {
	
}

class Ambulance extends Car {
	
}


public class PolymorphismEx02 {

	public static void main(String[] args) {
		
		Firetruck f = new Firetruck();
		
		Car c = (Car)f; //부모인 Car 타입으로 형변환(생략가능)
		
		Firetruck f2 = (Firetruck)c; //자식인 Firetruck 타입으로 형변환(생략불가)
		
		//Ambulance a = (Ambulance)f; //오류 발생. 상속관계가 아니므로 형변환 불가
	}
}
