package a02_연산자;

public class OperatorEx01 {

	public static void main(String[] args) {

		//대입 연산자
		boolean trueAndFalse = true;
		trueAndFalse = false;
		System.out.println("boolean: " + trueAndFalse); // false
		
		char character = 'a';
		System.out.println("character: " + character); // a
		
		int integer = 100;	
		System.out.println("integer: " + integer); // 100
		
		double doubleNum = 153.3325;
		System.out.println("double: " + doubleNum); // 153.3325
		
		
		//산술 연산자
		System.out.println("\ninteger + 50 = " + (integer + 50)); // 150
		System.out.println("integer - 50 = " + (integer - 10)); // 90
		int result = integer * 5;
		System.out.println("integer x 5 = " + result); // 500
		System.out.println("result / 2 = " + (result / 2)); // 250
		System.out.println("result % 2 = " + (result % 2)); // 0
		System.out.println("10" + 20); // 1020
		System.out.println(-1); // -1
		
		
		//증감 연산자 -> 무조건 1을 증가시키거나 1을 감소시킨다.
		int number = 80;
		System.out.println("\n"+number); // 80
		System.out.println(number++); // 80
		System.out.println(number); // 81
		
		
		/*
		 * 논리 연산자
		 * true(1), false(0)
		 * 
		 * AND(곱) && -> 모든값이 true여야 결과값이 true.
		 * -> true && true = true
		 * -> true && false = false
		 * -> false && true = false
		 * -> false && false = false
		 * 
		 * OR(합) || -> 모든값이 false여야 결과값이 false.
		 * -> true || true = true
		 * -> true || false = true
		 * -> false || true = true
		 * -> false || false = false
		 * 
		 * NOT(부정) !
		 * !true = false
		 * !false = true
		 */
		
		int score = 0;
		boolean scoreResult1 = score >= 80 && score <90;
		boolean scoreResult2 = score >= 80 || score <90;
		System.out.println("\n" + scoreResult1); // false
		System.out.println(scoreResult2); // true
		System.out.println(score == 0); // true
		System.out.println(score != 0); // false
		
		
		//복합대입 연산자 -> 자기 자신에게 연산처리를한 결과를 대입할 때 사용.
//		score = score + 100;
		score += 100;
//		score -= 100;
//		score *= 100;
//		score /= 100;
//		score %= 100;
		System.out.println("\n" + score); // 100

		score = 80;
		scoreResult1 = score >= 80 && score <90 ? true : false;
		System.out.println("\nscore Result: " + scoreResult1); // true
	
	}

}
