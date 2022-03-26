package example.controlflow;

public class For03 {

	public static void main(String[] args) {
		
		//100까지 짝수의 합을 구하시오. %연산 사용x
		int sum = 0;
		
		for(int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
