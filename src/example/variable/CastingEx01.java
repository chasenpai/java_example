package example.variable;

public class CastingEx01 {

	public static void main(String[] args) {
		
		char c = 'a'; // 문자형 변수 c에 a를 저장
		int i_c = c; // 정수형 변수 i_c에 변수 c의 값을 저장
		System.out.println(i_c); // 출력시 문자 a가 정수형 자료로 변환되어 97로 출력
		
		int i = 100; // 정수형 변수 i에 100을 저
		char c_i = (char)i; // 문자형 변수 c_i에 변수 i의 값을 저장
		System.out.println(c_i); // 출력시 정수 100이 문자형 자료로 변환되어 d로 출력
		
		double d = i; // 실수형 변수 d에 변수 i의 값을 저장
		System.out.println(d); // 출력시 정수 100이 실수 100.0으로 변환되어 출력
		
		d = 3.14; // 실수인 3.14 값을 저장
		int i_d = (int)d; // 정수형 변수 i_d에 실수형 변수 d의 값을 저장
		System.out.println(i_d); // 출력시 실수 3.14가 정수형 자료로 변환되어 소수점이 버려짐
	}

}
