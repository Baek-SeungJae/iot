package dl.constructor01;

public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	public Player() {}
	public Player(AbstractDice dice) {
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