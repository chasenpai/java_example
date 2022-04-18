package example.loop;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {

		// 입력받은 두 수의 사이 숫자들을 출력해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = a; i < b + 1; i++) {
			System.out.println(i);
		}
	}

}
