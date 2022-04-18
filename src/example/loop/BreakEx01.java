 package example.loop;

import java.util.Scanner;

public class BreakEx01 {

	public static void main(String[] args) {

		//break문을 사용한 while문 예제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("명령을 선택해주세요: ");
		System.out.println("1: 실행");
		System.out.println("2: 종료");
		
		int i = sc.nextInt();
		
		while(true) {
			if(i == 1) { //입력받은 변수 i의 값이 1일 경우
				System.out.println("프로그램을 실행합니다.");
				break; //위에 내용을 출력하고 반복문을 벗어난다
			}else if(i == 2) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

}
