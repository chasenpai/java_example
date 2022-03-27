package example.controlflow;

public class Continue01 {

	public static void main(String[] args) {
		
		//for문에 continue문을 사용해서 홀수만 출력하기
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
