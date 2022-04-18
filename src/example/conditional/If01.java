package example.conditional;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		
		//10의 배수인지 아닌지를 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int num = sc.nextInt();
		
		if(num%10 == 0) {
			System.out.println("10의 배수입니다.");
		}else {
			System.out.println("10의 배수가 아닙니다.");
		}
	}

}
