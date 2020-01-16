package api.util;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// 1. key와 value를 한 쌍으로 저장
		// - Generic으로 데이터 타입을 명시할 때도 key에 대한 타입, value에 대한 타입을 같이 정의 해야 한다.
		// 맵에서는 key로 요소를 구분하기 때문에 key가 같으면 덮어쓴다.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "servlet");
		map.put(2, "jsp");
		map.put(3, "spring");
		System.out.println("map에 저장된 요소의 개수: "+map.size());
		System.out.println("key가 1인 요소의 value="+map.get(1));
		
		HashMap<String,String> map2 = new HashMap<String, String>();
		map2.put("a_1", "servlet");
		map2.put("b_2", "jsp");
		map2.put("r_3", "spring");
		map2.put("s_4", "tiles");
		map2.put("ts_5", "mybatis");
		
		// 1. key목록을 추출한다.
		// 2. 반복문 안에서 key를 이용해서 value를 추출한다.
		
		Set<String> keylist = map2.keySet();
		for (String key : keylist) {
			String value = map2.get(key);
			System.out.println(key+ " : "+value);
		}
		
	}
}
