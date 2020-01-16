package chap07.poly;
public class Video extends Content {
	private String genre;
	public Video() {}
	public Video(String title, String genre)
	{
		super(title);
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void totalPrice() {
		switch(genre){
			case "new" : super.setPrice(2000);
				break;
			case "comic" : super.setPrice(1500);
				break;
			case "child" : super.setPrice(1000);
				break;
			default : super.setPrice(500);
		}
	}
}