package a08_클래스;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product("D110200", "아이폰", "애플");
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println();
		
		p1.productCode = "P010101";
		p1.productName = "텀블러";
		p1.company = "스타벅스";
		p1.productInfo();
		System.out.println();
		p2.productInfo();
		
		Product p3 = null;
		//null --> 주소가 0번지임을 가르킨다.
		int num = 0;
		String name = null;
		String name2 = "";
	}

}
