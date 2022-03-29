package example.array;

import java.util.Arrays;
import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		
			//배열의 중복값 제거
			int[] nums = new int[10];
			
			Random rd = new Random();
			
			for(int i = 0; i < nums.length; i++) {
				nums[i] = rd.nextInt(nums.length); //배열의 크기만큼 랜덤 숫자를 받는다
				for(int j = 0; j < i; j++) {
					//배열의 i번 인덱스의 값과 j번 인덱스의 값이 같으면
					// i의 값을 1 빼주어 반복을 다시 실행
					if(nums[i] == nums[j]) { 
						i--;
					}
				}
			}
			System.out.println(Arrays.toString(nums));
	}
}
