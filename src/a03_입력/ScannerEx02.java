package a03_입력;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("연락처: ");
		String phone = scanner.nextLine(); //nextLiune --> 스페이스바&엔터를 먹음
		System.out.print("주소: ");
		String adrs = scanner.next(); //next --> 스페이스바&엔터 기준으로 컷
		
		System.out.println("이름 : " + name + "\n연락처: " + phone);
		System.out.println("주소: " + adrs);
	}
}
