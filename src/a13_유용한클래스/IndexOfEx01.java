package a13_유용한클래스;

public class IndexOfEx01 {

	public static void main(String[] args) {
		
		String today = "today is monday";
		
		System.out.println(today.indexOf("a")); //문자열의 앞에서 부터 찾아 인덱스를 반환. 결과: 3
		System.out.println(today.lastIndexOf("a")); //문자열의 뒤에서 부터 찾아 인덱스를 반환. 결과: 13
		System.out.println(today.indexOf("x")); //찾지 못했을 경우 -1을 반환
	}

}
