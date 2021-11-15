package mmms.member.vo;

public class Member {
//	id NUMBER PRIMARY KEY,
//	name VARCHAR2(12) UNIQUE NOT NULL,
//	addr VARCHAR2(50) NOT NULL,
//	nation VARCHAR2(12) NOT NULL,
//	email VARCHAR2(30) NOT NULL,
//	age NUMBER NULL
	
	private int id;
	private String name; //식별값
	private String addr;
	private String nation;
	private String email;
	private int age;
	
	//id 제외: sequence 사용하므로
	public Member(String name, String addr, String nation, String email, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
		public String toString() {
		String result = "name = " + name + ", addr = " + addr + ", email = " + email + ", nation = " + nation + ", age = " + age;
		return result;
		}
	
	
	
}
