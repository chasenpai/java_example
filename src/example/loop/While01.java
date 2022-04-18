package example.loop;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		
		//입력받은 정수의 배수를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt();
		int result = 0;
		int i = 1;
		while(num<=100 && result < 100) {
			result = i*num;
			i++;
			System.out.println(result);
		}
	}
}
