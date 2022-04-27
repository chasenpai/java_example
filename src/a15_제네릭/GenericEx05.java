package a15_제네릭;

class Zergling<T> implements Unit<T>{

	@Override
	public void attack(T attack) {
		System.out.println("저글링의 공격력: "  + attack);
	}

	@Override
	public void hp(T hp) {
		System.out.println("저글링의 체력: " + hp);
	}
	
}

public class GenericEx05 {

	public static void main(String[] args) {
		
		Zergling<Integer> zergling = new Zergling<>();
		
		zergling.attack(5);
		zergling.hp(35);
	}
}
