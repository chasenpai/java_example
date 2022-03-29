package example.array;

import java.util.Arrays;
import java.util.Random;

	public class Array04 {
	
	public static void main(String[] args) {
		
			//숫자 섞기
			Random random = new Random(); //Random클래스 생성
			
			int[] numbers = {1, 2, 3, 4, 5, 6 ,7 ,8, 9, 10};
			
			for(int i = 0; i < 100; i++) { //100번 반복해서 뒤섞이게 만든다
				int n = random.nextInt(9); //0 ~ 9중 랜덤값을 얻는다
				int temp = numbers[0];
				numbers[0] = numbers[n]; 
				numbers[n] = temp; //numbers[0]과 numbers[n]이 서로 값을 바꿈
			}
			System.out.println(Arrays.toString(numbers));
		}
}
