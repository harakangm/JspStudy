package ch08_MVCTEST;

import java.util.*;

public class RegistDb {
	HashMap<String, Regist> regiDb = new HashMap<>();
	HashMap<String, Regist> regiDb2 = new HashMap<>();
	
	RegistDb() {
		Regist imsi;
		Regist info = new Regist("101","김지우","서울시","silver","010-1111-1111");
		imsi = new Regist(info);
		regiDb.put("101", info);
		regiDb2.put("101", imsi);
		info = new Regist("102","홍길동","인천시","gold","010-2222-2222");
		imsi = new Regist(info);
		regiDb.put("102", info);
		regiDb2.put("102", imsi);
		info = new Regist("103","율곡","김포시","vip","010-3333-3333");
		imsi = new Regist(info);
		regiDb.put("102", info);
		regiDb2.put("102", imsi);
	}
	
	public List<Regist> showAllInfo() {
		//해쉬맵의 키값을 제외한 벨류값만 리턴해줌
		return new ArrayList<>(regiDb.values());
	}
	
	public Regist find(String name) {
		return regiDb.get(name);
	}
}
