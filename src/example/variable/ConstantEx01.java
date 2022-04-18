package example.variable;

public class ConstantEx01 {

	public static void main(String[] args) {

		int birthYear = 97; // 변수를 선언하고 값을 저장한다
		
		final int BIRTHYEAR = 97; // 상수를 선언하고 값을 저장한다. 
		
		birthYear = 98; // 변수는 값을 변경 가능
		
		//BIRTHYEAR = 98; // 상수는 한번 선언하면 값을 변경할 수 없어서 오류가 뜬다
		
	}
}
