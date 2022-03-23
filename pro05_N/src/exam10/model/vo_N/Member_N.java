package exam10.model.vo_N;

public class Member_N {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 기본 생성자는 생략해서 자동으로 생성되게 만듬.
	public Member_N() {}
	
	public void ChangeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
}
