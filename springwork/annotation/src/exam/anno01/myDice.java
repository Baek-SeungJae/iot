package exam.anno01;

import java.util.Random;

import org.springframework.stereotype.Service;
@Service("mydice")
public class myDice extends Random implements AbstractDice{
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
