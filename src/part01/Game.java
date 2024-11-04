package part01;

public class Game {
	
	// fields
	private int id;
	private String title;
	private String publisher;
	private GameType genre;
	private double price;
	
	// unique id
	private static int nextId = 1;
	
	// accessor methods
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public GameType getGenre() {
		return genre;
	}

	public double getPrice() {
		return price;
	}
	
	// constructor 
	public Game(String title, String publisher, GameType genre, double price) {
		
		this.id = nextId;
		this.title = title;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
		
		nextId++;
		
	}
	
	// toString
	public String toString()
	{
		return getTitle() + " from " + getPublisher() + "\nID: " + getId() + "\nType: " + getGenre() + "\nPrice: " + String.format("£%.2f", getPrice());
	}

}
