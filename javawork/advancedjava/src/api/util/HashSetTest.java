package api.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");

		System.out.println("사이즈=>" + set.size());

		// set에 저장된 요소를 추출
		// 1. HashSet데이터를 표준 인터페이스인 Iterator로 변환
		// => iterator는 모든 자료구조의 표준
		// 2. 변환 후 추출
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (String string : set) {
			System.out.println("set에 저장된 요소:" + string);
		}

	}

}
