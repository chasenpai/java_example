package a06_배열;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		
		//배열에 담긴 숫자들의 합 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 5개를 입력하시오: ");
		
		int[] numbers = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i];
		}
		System.out.println("숫자 5개의 합 : " + sum);
		
	}
}
