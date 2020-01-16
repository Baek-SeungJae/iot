package chap06.pracitse;

public class SutdaCard {
	private int num;
	private boolean isKwang;
	
	public SutdaCard()
	{
		num=1;
		isKwang = true;
	}
	public SutdaCard(int num, boolean isKwang)
	{
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public void setNum(int num)
	{
		this.num = num;
	}
	public void setIsKwang(boolean isKwang)
	{
		this.isKwang = isKwang;
	}
	public int getNum()
	{
		return this.num;
	}
	public boolean getIsKwang()
	{
		return this.isKwang;
	}
	
	public String info()
	{
		return this.num+(this.isKwang?"K":"");
	}
	
	
}
