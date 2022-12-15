package ch08_MVCTEST;

import java.util.*;

public class RegistDb {
	HashMap<String, Regist> regiDb = new HashMap<>();
	
	RegistDb() {
		Regist info = new Regist("101","김지우","서울시","silver","010-1111-1111");
		regiDb.put("101", info);
		info = new Regist("102","홍길동","인천시","silver","010-2222-2222");
		regiDb.put("102", info);
		info = new Regist("103","율곡","김포시","vio","010-3333-3333");
	}
	
	public List<Regist> showAllInfo() {
		//해쉬맵의 키값을 제외한 벨류값만 리턴해줌
		return new ArrayList<>(regiDb.values());
	}
	
	public Regist find(String name) {
		return regiDb.get(name);
	}
}
