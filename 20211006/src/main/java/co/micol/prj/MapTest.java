package co.micol.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	//MAP은 인터페이스 객체(자기자신 인스턴스 생성 못함), 하위객체인 HashMap으로 만들어준다
	private Map<String, String> map = new HashMap<String, String>();
	
	public void setMap(String id, String password) { //맵 구조에 데이터 삽입
		map.put(id, password);
	}
	
	public String getMap(String id) { //맵에서 Key에 맞는 데이터를 가져온다
		return map.get(id);
	}
}
