package di.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String,String> map;
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	public void getList() {
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
	}
	public void getMap() {
		Set<String> keylist = map.keySet();
		for(String key: keylist) {
			System.out.println("key:" +key+", "+"value: "+map.get(key));
		}
	}
	
}
