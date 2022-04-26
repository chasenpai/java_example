package a05_반복문;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//반복문으로 사칙연산 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 종료");
			System.out.print("선택하세요: ");
			int select = sc.nextInt();
			int a = 0;
			int b = 0;
			if(select == 1) {
				System.out.print("\n두 수를 입력하세요: ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("\n" + a + " + " + b + " = " + (a + b) + "\n");
			}else if(select == 2) {
				System.out.print("\n두 수를 입력하세요: ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("\n" + a + " - " + b + " = " + (a - b) + "\n");
			}else if(select == 3) {
				System.out.print("\n두 수를 입력하세요: ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("\n" + a + " x " + b + " = " + (a * b) + "\n");
			}else if(select == 4) {
				System.out.print("\n두 수를 입력하세요: ");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("\n" + a + " / " + b + " = " + (a / b) + "\n");
			}else if(select == 5) {
				System.out.println("\n프로그램을 종료합니다..");
				break;
			}else if(select < 1 || select > 5) {
				System.out.println("\n잘못된 입력입니다\n");
			}
			
		}
		
	}
}
