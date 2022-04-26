package a05_반복문;

public class ForEx04 {

	public static void main(String[] args) {
		
		//중첩 for문으로 구구단 출력하기
		//     1            2        8
		for(int dan = 2; dan < 10; dan++) {
			// 3
			System.out.println(dan+"단");
			//     	    4         6
			for(int i = 1; i < 10; i++) {		
				// 5
				System.out.println(dan + "x" + i  + "=" + dan*i);				
			}
			// 7
			System.out.println();
		}
		// 9
		
		/*
		 * 1. 변수 dan의 값을 2로 초기화
		 * 2. 변수 dan의 크기가 10보다 작을 때 까지 반복하는 조건을 설정
		 * 3. 변수 dan의 값 + "단" 즉 현재 몇단인지를 출력
		 * 4. 중첩된 for문에 변수의 값을 초기화하고 조건을 설정
		 * 5. 변수 dan의 값 곱하기 i의 값을 출력
		 * 6. 반복할 때 마다 i의 값이 1씩 증가
		 * 7. 반복이 끝나면 중첩된 for문을 빠져나감
		 * 8. dan의 값이 1 증가하고 3 ~ 8의 과정을 반복
		 * 9. dan의 값이 10이되면 조건식이 거짓이되므로, for문을 빠져나감
		 */
		
		
	}
}
