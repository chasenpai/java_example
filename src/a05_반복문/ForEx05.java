package a05_반복문;

public class ForEx05 {

	public static void main(String[] args) {
		
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  ***** 출력하기
		 */
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
