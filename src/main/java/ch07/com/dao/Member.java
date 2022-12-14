package ch07.com.dao;

public class Member {
	public static final String pattern1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	public static final String pattern2 = "(02|010)-\\d{3,4}-\\d{4}";
	
	private String email;
	private String phone;
	
	public String result() {
		String res;
		if(email.matches(pattern1) && phone.matches(pattern2)) {
			res = "환영합니다.";
		}else {
			res ="유효성 검사에 통과하지 못했습니다";
		}
		
		return res;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
