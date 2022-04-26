package a05_반복문;

public class WhileEx02 {
	public static void main(String[] args) {
	
		//while문으로 1 ~ 100 중 홀수만 출력하기
		
		int j = 1;
		
		while(j<100) {
			if(j <= 100) {
				if(j % 2 != 0) {
					System.out.println(j + "는 홀수입니다.");
				}
			}
			j++;
		}
	}
}
