package example.array;

import java.util.Arrays;

public class MultiArray02 {

public static void main(String[] args) {
		
		//2차원 배열로 구구단 출력하기
		int[][] num = new int [8][9];
		
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				//배열의 i - 2번 행의 j - 1번 열에 i 곱하기 j의 값이 담긴다
				num[i-2][j-1] = i * j;
			}

		}
		for(int i = 0; i < num.length; i++) {
			System.out.print((i + 2) + "단: ");
			System.out.print(Arrays.toString(num[i]));
			System.out.println();
		}
		
	}

}
