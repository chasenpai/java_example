package example.loop;

public class For03 {

	public static void main(String[] args) {
		
//		//100까지 짝수의 합을 구하시오. %연산 사용x
//		int sum = 0;
//		
//		for(int i = 0; i <= 100; i += 2) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		//1부터 100까지 짝수만 출력하기
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) { //i를 2로나눈 값의 나머지가 0 = 짝수
				System.out.println(i);
			}
		}
	
	}
}
