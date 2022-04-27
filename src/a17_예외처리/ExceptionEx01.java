package a17_예외처리;

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		try {
			System.out.println(4 / 0); //예외가 발생
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다."); //예외를 처리
			e.printStackTrace(); //발생한 예외에 대한 자세한 정보를 출력
			System.out.println(e.getMessage()); //발생한 예외에 간단한 정보 출력
		}
		
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); //예외가 발생하지 않으므로 실행되지 않음
		}finally {
			System.out.print(6); //예외 발생 여부와 관계없이 수행	
		}


	}
}
