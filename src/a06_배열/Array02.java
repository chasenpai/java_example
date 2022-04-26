package a06_배열;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		
		//배열에 담긴 값들 중 가장 큰수 출력하기
		Scanner sc = new Scanner(System.in);
		
		int [] intArray = new int[5];
		
		int sum = 0;
		
		int max = intArray[0];
		
		System.out.println("양수 5개를 입력: ");
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}	
		}System.out.println("양수 5개중 가장 큰수: " + max);
	}
}
