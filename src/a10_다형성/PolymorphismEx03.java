package a10_다형성;

class Product {
	int price;
	int bonusPoint;

}

class Xbox extends Product {
	
}

class Ps5 extends Product {
	
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
//	void buy(Xbox x) {
//		money = money - x.price;
//		bonusPoint = bonusPoint + x.bonusPoint;
//	}
//	
//	void buy(Ps5 s) {
//		money = money - s.price;
//		bonusPoint = bonusPoint + s.bonusPoint;
//	}
	
	//메소드의 매개변수로 Product를 받는다
	void buy(Product p) {
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
	}
}

public class PolymorphismEx03 {

	public static void main(String[] args) {
		
		Buyer buy = new Buyer();
		Xbox xbox = new Xbox();
		Ps5 ps5 = new Ps5();
		
		//Product 클래스의 자식 클래스를 매개변수로 받을 수 있음.
		buy.buy(ps5);
		buy.buy(xbox);
	}
}
