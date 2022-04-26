package a08_클래스;

public class Product {
	/*
	 * 변수
	 * 상품코드
	 * 상품명
	 * 제조사
	 */
	
	String productCode;
	String productName;
	String company;
	
	
	public Product() {
		System.out.println("생성자");
	}
	
	public Product(String productCode, String productName, String company) {
		this.productCode = productCode;
		this.productName = productName;
		this.company = company;
	}
	
	/*
	 * 메소드
	 * 상품정보출력
	 */
	
	public void productInfo() {
		System.out.println("상품코드: " + productCode + "\n상품명: " + productName + "\n제조사: " + company);
	}
	

}
