package a11_유용한클래스;

public class HashcodeEx01 {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		//결과: 
		//true
		//96354
		//96354
		//2104457164
		//1521118594
	}

}
