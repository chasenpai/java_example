package a03_입력;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		
		System.out.print("첫번째 수를 입력하세요: ");
		result += scanner.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		result += scanner.nextInt();
		System.out.print("세번째 수를 입력하세요: ");
		result += scanner.nextInt();
		System.out.println("세 수의 합: " + result);
	}
}
