package a11_추상클래스;

class Darius extends Champion {

	@Override
	void activeSkill() {
		System.out.println("다리우스가 Q를 사용합니다");
	}

	@Override
	void passiveSkill() {
		System.out.println("다리우스가 패시브 스킬 효과로 적 챔피언을 출혈상태로 만들었습니다.");
	}

}

class Garen extends Champion {

	@Override
	void activeSkill() {
		System.out.println("가렌이 W를 사용합니다");
	}

	@Override
	void passiveSkill() {
		System.out.println("가렌이 패시브 스킬 효과로 스스로 체력을 회복합니다.");
	}

}

public class AbstractEx01 {

}
