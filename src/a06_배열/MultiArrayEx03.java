package a06_배열;

import java.util.Arrays;

public class MultiArrayEx03 {

	public static void main(String[] args) {

		//2차원 배열에 1 ~ 500 담기
		int[][] numbers = new int[5][100];
		
		for(int i = 0, k = 1; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(numbers));
		
	}

}
