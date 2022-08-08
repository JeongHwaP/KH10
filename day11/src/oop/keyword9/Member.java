package oop.keyword9;

public class Member {
	//사용자에게 정보를 입력받아 회원가입을 하는 프로그램을 구현
	//사용자에게 입력받는 정보는 아이디, 비밀번호, 닉네임 총 세 가지
	//아이디는 한 번 설덩되면 변경 불가능
	//비밀번호와 닉네임은 변경 가능
	// 비밀번호는 정보 출력 시 출력되지 않아야 함
	//사용자에게 정보를 입력받아 회원 객체를 생성하고 정보를 출력
	
	//field
	private final String id;
	private String password;
	private String nickname;
	
	public String getId() {
		return id;
	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public Member(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}
	
	public void print() {
		System.out.println("아이디 : " + this.id);
		System.out.println("비밀번호 : " + this.password);
		System.out.println("닉네임 : " + this.nickname);
	}
}
