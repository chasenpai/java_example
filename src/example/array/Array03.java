package example.array;

import java.util.Arrays;
import java.util.Random;

public class Array03 {
	public static void main(String[] args) {
			//주사위 굴리기
		
			Random random = new Random(); //random 클래스를 사용하기 위해 생성
			
			int sum = 0;
			
			int[] dice = new int [3]; //주사위 세개의 값을 받을 수 있는 배열 생성
			
			for(int i = 0; i < 3; i++) {
				dice[i] = random.nextInt(6) + 1; //1 ~ 6의 정수중 하나가 랜덤으로 배열의 i번 인덱스에 담긴다
				sum += dice[i];
			}
			
			System.out.println(Arrays.toString(dice));
			
			if(sum > 9) {
				System.out.println("주사위 눈의 합은: " + sum + " 당첨입니다.");
			}else {
				System.out.println("주사위 눈의 합은: " + sum + " 꽝입니다.");
			}
			
		}
}
