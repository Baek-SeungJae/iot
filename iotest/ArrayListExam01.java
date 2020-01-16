package api.util;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		score.add(79);
		score.add(55);
		score.add(100);
		score.add(98);
		score.add(99);
		
		int total=0;
		double avg;
		
		for(int i=0; i<score.size(); i++)
		{
			total+=score.get(i);
		}
		avg = 1.0*total / score.size();
		
		System.out.println("ÃÑÁ¡:"+total);
		System.out.println("Æò±Õ:"+avg);
	}
}
