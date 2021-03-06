package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("java");
		
		HashSet<String> set2 = new HashSet<String>(set);
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("java");
		set3.add("jdbc");
		set3.add("oracle");
		set3.add("hive");
		
		
		print(set,"set1");
		print(set2,"set2");
		print(set3,"set3");
		
		set.retainAll(set3); //set과 set3에 저장된 요소중 중복되는 요소만 가지고 새로운 set구조를 생성
		print(set,"교집합set");
		
		
	}

	public static void print(Set<String> set,String setname) {
		System.out.println("사이즈=>" + set.size());
		for (String data : set) {
			System.out.println(setname+"에 저장된 요소=>" + data);
		}
		System.out.println("===========================================================");
	}
}
