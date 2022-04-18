package example.loop;

public class Continue01 {

	public static void main(String[] args) {
		
		//for문에 continue문을 사용해서 홀수만 출력하기
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) { //변수 i의 값을 2로 나눈 나머지가 0(짝수)이면 
				continue;//해당 반복을 건너뛴다
			}
			System.out.println(i);
		}
	}
}
