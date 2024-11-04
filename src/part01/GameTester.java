package part01;

public class GameTester {

	public static void main(String[] args) {
		
		Game g1 = new Game("EAFC", "Electronic Arts", GameType.SPORTS, 59.99);
		Game g2 = new Game("Tetris Meta Quest", "Meta", GameType.PUZZLE, 15.99);
		Game g3 = new Game("Forza Motorsport", "Microsoft", GameType.SIMULATION, 69.00);
		Game g4 = new Game("Doom Eternal", "Bethesda", GameType.ACTION, 14.57);
		
		System.out.println(g1 + "\n");
		System.out.println(g2 + "\n");
		System.out.println(g3 + "\n");
		System.out.println(g4 + "\n");
	}

}
