package ch08_MVCTEST;

public class Regist {
	//이것은 데이터베이스에서 값을 받아서 저장할곳
	private String id;
	private String name;
	private String address;
	private String grade;
	private String phone;
	
	Regist(String id,String name,String address,String grade,String phone) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.grade = grade;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
