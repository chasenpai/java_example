package example.scanner;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {

			
		Scanner scanner = new Scanner(System.in);  // Scanner 객체를 생성
		
		String name = null, schoolName = null;
		int studentYear = 0, studentGroup = 0, studentNumber = 0;
			
		System.out.println("[학생정보 입력]");
			
		System.out.print("이름: ");
		name = scanner.nextLine(); // 입력받은 값을 변수 name에 문자열로 저장
			
		System.out.print("학교명: ");
		schoolName = scanner.nextLine();
			
		System.out.print("학년: ");
		studentYear = scanner.nextInt(); // 입력받은 값을 변수 studentYear에 정수로 저장
			
		System.out.print("반: ");
		studentGroup = scanner.nextInt();
			
		System.out.print("번호: ");
		studentNumber = scanner.nextInt();

			
		System.out.println("\n[학생정보 출력]");
		System.out.println("이름: " + name + "\n학교명: " + schoolName + "\n학년: " 
		+ studentYear + "\n반: " + studentGroup + "\n번호: " + studentNumber); 

//		출력결과:	
//		[학생정보 출력]
//		이름: 홍길동
//		학교명: 서울고등학교
//		학년: 3
//		반: 2
//		번호: 20
			
		}

	
}
