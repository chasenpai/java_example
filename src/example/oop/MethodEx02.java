package example.oop;

import java.util.Scanner;

public class MethodEx02 {
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int subtract(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static int divide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int select;
		
		while(true) {
			System.out.println("1.더하기\n2.빼기\n3.곱하기\n4.나누기\n5.종료\n명령을 선택하세요: ");
			select = sc.nextInt();
			if(select == 1) {
				System.out.print("두 수를 입력하세요: ");
				System.out.println("\n두 수의 합은: " + add(sc.nextInt(), sc.nextInt()) + "\n");
			}else if(select == 2) {
				System.out.print("두 수를 입력하세요: ");
				System.out.println("\n두 수의 차는: " + subtract(sc.nextInt(), sc.nextInt()) + "\n");
			}else if(select == 3) {
				System.out.print("두 수를 입력하세요: ");
				System.out.println("\n두 수의 곱은: " + multiply(sc.nextInt(), sc.nextInt()) + "\n");
			}else if(select == 4) {
				System.out.print("두 수를 입력하세요: ");
				System.out.println("\n두 수의 몫: " + divide(sc.nextInt(), sc.nextInt()) + "\n");
			}else if(select == 5) {
				System.out.println("\n계산기를 종료합니다..");
				break;
			}
		}	
	}
}

