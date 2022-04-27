package a12_인터페이스;

public class InterfaceEx01 implements UserService{

	@Override
	public void inserUser() {
		System.out.println("회원가입");
		System.out.println("회원정보를 추가합니다.");
	}

	@Override
	public void getUser() {
		System.out.println("로그인");
		System.out.println("회원정보를 조회합니다.");
	}

	@Override
	public void updateUser() {
		System.out.println("프로필 수정, 비밀번호 변경");
		System.out.println("회원정보를 수정합니다.");
	}

	@Override
	public void deleteUser() {
		System.out.println("회원탈퇴");
		System.out.println("회원정보를 삭제합니다.");
	}
}
