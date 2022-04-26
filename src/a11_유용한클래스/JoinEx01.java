package a11_유용한클래스;

public class JoinEx01 {

	public static void main(String[] args) {
		
		String[] arrAnimals = {"dog","cat","bear"};
		
		String strAnimals = String.join("-", arrAnimals);
		
		System.out.println(strAnimals);
		//결과: dog-cat-bear
	}

}
