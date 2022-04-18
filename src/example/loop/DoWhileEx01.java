package example.loop;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		//입력받은 숫자를 홀수인지 짝수인지 판별하기
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		
		do {
			System.out.print("숫자를 입력하세요: ");
			select = sc.nextInt();
			if(select % 2 != 0) {
				System.out.println("홀수입니다.");
			}else {
				System.out.println("짝수입니다.");
			}
		}while(select != 0);
			System.out.println("프로그램 종료..");
	}
}
