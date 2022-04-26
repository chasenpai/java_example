package a11_유용한클래스;

public class SplitEx01 {

	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		
		String[] arrAnimals = animals.split(","); //,를 기준으로 문자열을 잘라서 배열의 인덱스에 저장
			
		for(String i : arrAnimals) {
			System.out.println(i); 
		}
	}

}
