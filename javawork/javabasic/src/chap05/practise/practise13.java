package chap05.practise;

import java.util.Scanner;

public class practise13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length;i++)
		{
			char [] question = words[i].toCharArray();
			
			for(int k=0;k<question.length;k++) {
			int j = (int)(Math.random()*question.length);
			char temp;
			temp = question[i];
			question[i] = question[j];
			question[j]=temp;
			}
			
			
			
			System.out.print("Q"+(i+1)+". "+new String(question)+"의 정답을 입력하세요.>");
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.println("맞았습니다.\n");
			else
				System.out.println("틀렸습니다.\n");
				
			
		}
		

	}

}
