package example.generic;

import java.util.ArrayList;

public class GenericEx01 {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("호랑이");
		
		String temp = animals.get(0); //형변환이 필요없음
		
//		ArrayList animals = new ArrayList();
//		
//		animals.add("호랑이");
//		
//		String temp = (String) animals.get(0); //형변환이 필요함
		
		
		
	}
}
