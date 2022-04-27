package a12_인터페이스;

public class InterfaceEx02 implements UserService {

	@Override
	public void inserUser() {
		System.out.println("사용자를 추가합니다.");
	}

	@Override
	public void getUser() {
		System.out.println("사용자 정보를 가져옵니다.");	
	}

	@Override
	public void updateUser() {
		System.out.println("사용자 정보를 수정합니다.");
	}

	@Override
	public void deleteUser() {
		System.out.println("사용자 정보를 삭제합니다.");
	}
}
