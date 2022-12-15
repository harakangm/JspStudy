package ch08_MVC;

public class Product {
	// 모델 : 데이터베이스에서 값을 얻어와서 자바에서 구현
	
	//상품리스트 : 데이터 베이스 의 컬럼값이랑 비슷함
	private String id;
	private String name;
	private String maker;
	private int price;
	private String date;
	
	public Product(String id,String name,String maker,int price,String date) {
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.date = date;
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

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
