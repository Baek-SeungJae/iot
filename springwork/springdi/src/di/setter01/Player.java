package di.setter01;

public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	public Player() {}
	public Player(AbstractDice dice) {
		this.d = dice;
	}
	
	public AbstractDice getD() {
		return d;
	}
	public void setD(AbstractDice dice) {
		System.out.println("setD ȣ��");
		this.d = dice;
	}
	
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}