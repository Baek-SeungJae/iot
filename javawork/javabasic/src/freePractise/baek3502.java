package freePractise;

public class baek3502 {

	public static void main(String[] args) {

		int[] input={39,40,41,42,43,44,82,83,84,85};
		int count =0;
		int input2 = 42;
		int[] result = new int[input2];
		for(int i=0; i<10; i++)
		{
			result[input[i]%input2]++;
		}

		for(int i=0; i<input2; i++)
		{
			if(result[i]!=0)
				count ++;
		}
		System.out.println(count);
	}

}
