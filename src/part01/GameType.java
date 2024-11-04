package part01;

public enum GameType {
	SPORTS("Sports Video Game"),
	PUZZLE("Puzzle Video Game"),
	ACTION("Action Video Game"),
	SIMULATION("Simulation Video Game");
	
	private String type;
	
	private GameType(String str) {
		type = str;
	}
	
	public String toString() {
		return type;
	}

}
