package a11_유용한클래스;

public class ContainsEx01 {

	public static void main(String[] args) {
		
		String s1 = "123456789";
		String s2 = "123";
		
		if(s1.contains(s2)) {
			System.out.println("포함");
		}else {
			System.out.println("미포함");
		}
		
		if(s1.contains("0")) {
			System.out.println("포함");
		}else {
			System.out.println("미포함");
		}
	}

}
