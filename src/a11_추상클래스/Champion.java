package a11_추상클래스;

public abstract class Champion{

	int hp;

	abstract void activeSkill();
	abstract void passiveSkill();
	
	void currentHp(int hp) {
		System.out.println("현재 체력 : "  + this.hp);
	};

}


