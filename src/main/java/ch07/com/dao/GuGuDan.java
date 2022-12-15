package ch07.com.dao;

public class GuGuDan {
	private int num;
	
	public String calc() {
		StringBuilder str = new StringBuilder();
		
		for(int i = 1; i < 10; i++) {
			
			str.append("5*" + i + " = ").append(num*i).append("<br>");
		}
		
		return str.toString();		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	

	
	
	
}
