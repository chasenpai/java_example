package a11_유용한클래스;

public class SubStringEx01 {

	public static void main(String[] args) {

		String champ = "가렌갈리오갱플랭크";
		
		System.out.println(champ.substring(2)); //2번 인덱스부터 출력
		System.out.println(champ.substring(0, 2)); //0번 인덱스부터 출력하고 2번 인덱스부터 짜름
		System.out.println(champ.substring(champ.indexOf("갱"))); //"갱"이 위치한 인덱스부터 출력
	}

}
