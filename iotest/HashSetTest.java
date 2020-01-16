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

		System.out.println("������=>" + set.size());

		// set�� ����� ��Ҹ� ����
		// 1. HashSet�����͸� ǥ�� �������̽��� Iterator�� ��ȯ
		// => iterator�� ��� �ڷᱸ���� ǥ��
		// 2. ��ȯ �� ����
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for (String string : set) {
			System.out.println("set�� ����� ���:" + string);
		}

	}

}
