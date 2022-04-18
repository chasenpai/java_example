package example.conditional;

import java.util.Random;

public class If03 {

	public static void main(String[] args) {
		
		//주사위 굴리기
		
		Random random = new Random();
		int[] num = new int[2];
		
		num[0] = random.nextInt(6) + 1;		
		num[1] = random.nextInt(6) + 1;	
		
		if((num[0] + num[1]) > 6) {
			System.out.println("당첨입니다.");
		}else {
			System.out.println("꽝입니다.");
		}
		
	}
}
