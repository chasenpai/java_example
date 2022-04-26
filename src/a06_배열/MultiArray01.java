package a06_배열;

import java.util.Scanner;

public class MultiArray01 {

	public static void main(String[] args) {

		//2차원 배열로 학점 구하기
		double score[][] = new double[4][2];
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println((i+1) + "학년 " + (j+1) + "학기 " + "학점을 입력하시오: ");
				score[i][j] = sc.nextDouble(); //입력받은 값이 배열의 i행 j번열 인덱스에 담긴다
				sum += score[i][j];
				
			}
			
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println((i+1) + "학년 " + (j+1) + "학기 "+ score[i][j]);
			}
		}
		System.out.println();
		System.out.println("평점: " + String.format("%.2f", sum/(score.length * score[0].length)));
	}

}
