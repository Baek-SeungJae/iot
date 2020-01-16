package api.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for(int i=1; i<=10; i++)
			set1.add(i);
		for(int i=5; i<=15; i++)
			set2.add(i);
		 unionPrint(set1,set2);
		 System.out.println("==================================");
		 interPrint(set1,set2);
	}
	public static void unionPrint(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		for (Integer data : set2) {
			set3.add(data);
		}
		for (Integer data : set3) {
			System.out.println("union=>"+data);
		}
	}
	public static void interPrint(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> set3 = new HashSet<Integer>(set1);
		set3.retainAll(set2);
		for (Integer data : set3) {
			System.out.println("inter=>"+data);
		}
	}
}
