package ControlFlow;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {

		//학점 구하기
		
		char grade =' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		if(score > 100 || score < 1 ) {
			System.out.println("잘못된 점수 입니다.");
		}else if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';	
		}if(score <= 100 && score >= 0) {
			System.out.println("학점: " + grade);
		}
		
	}

}
