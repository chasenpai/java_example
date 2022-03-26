package example.controlflow;

public class For04 {

	public static void main(String[] args) {
		
		//구구단 출력하기
		
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(dan+"단");
			for(int i = 0; i < 9; i++) {				
				System.out.println(dan + "x" + (i + 1) + "=" + (dan*(i + 1)));				
			}
			System.out.println();
		}
	}
}
