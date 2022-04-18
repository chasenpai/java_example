package example.loop;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		// 1부터 N까지의 합 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= num;i ++) {
			sum += i;
		}
		System.out.println("1부터" + num + "까지의 합: " + sum);
	}
}
