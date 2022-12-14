package ch07;

public class Calculator {
	// 자바빈즈
	// 재사용성이 높다
	
	// 필드
	private int n1;
	private int n2;
	private String op;

	// 메소드
	// 계산을 구현해줌
	public long calc() {
		long result = 0;

		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		}
		return result;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	
}
