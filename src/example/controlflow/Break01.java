 package example.controlflow;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {

		//break문을 사용한 while문 예제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("명령을 선택해주세요: ");
		System.out.println("1: 실행");
		System.out.println("2: 종료");
		
		int i = sc.nextInt();
		
		while(true) {
			if(i == 1) {
				System.out.println("프로그램을 실행합니다.");
				break;
			}else if(i == 2) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}
