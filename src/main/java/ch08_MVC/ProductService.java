package ch08_MVC;

import java.util.*;

//데이터 샘플을 제공해주는 클래스
public class ProductService {
	//일단 샘플데이터 (지금은 일단 db역활을 해줌)
	HashMap<String, Product> products = new HashMap<>();
	
	public ProductService() {
		//상품을 만듬 일단 데이터베이스;;
		Product p = new Product("101","아이폰12","애플", 1200000, "2020.12.12");
		products.put("101", p);
		p = new Product("102","삼전우주폰","삼성전자", 1300000, "2021.02.02");
		products.put("102", p);
		p = new Product("103","엘스듀얼폰","엘스전자", 1500000, "2021.03.02");
		products.put("103", p);
	}
	
	//모든 상품 데이터를 가져오는 메서드(select *from)
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}
	
	// id로 원하는 상품을 가져오는 메소드(select * from where id = "102")
	public Product find(String id) {
		return products.get(id);
	}
	
}
