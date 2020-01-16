package chap07.poly;

import javax.swing.JFrame;

class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {
	}
}

public class InterfaceTest02 {

	public static void main(String[] args) {
		GUITest obj = new GUITest("인터페이스연습");
		
	}

}