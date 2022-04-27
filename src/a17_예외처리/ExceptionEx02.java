package a17_예외처리;

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e; //예외를 발생시킴
            //throw new Exception("고의로 발생시킴"); 위의 두 줄을 한줄로 요약 
		}catch(Exception e) {
			System.out.println("에러: " + e.getMessage());
			e.printStackTrace();
		}
	}
} //결과
//에러: 고의로 발생시킴
//java.lang.Exception: 고의로 발생시킴
	//at text02.Exam01.main(Exam01.java:8)
