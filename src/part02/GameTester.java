package part02;

import java.util.ArrayList;

public class GameTester {

	public static void main(String[] args) {
		
		Game g1 = new Game("EAFC", "Electronic Arts", GameType.SPORTS, 59.99);
		Game g2 = new Game("Tetris Meta Quest", "Meta", GameType.PUZZLE, 15.99);
		Game g3 = new Game("Forza Motorsport", "Microsoft", GameType.SIMULATION, 69.00);
		Game g4 = new Game("Doom Eternal", "Bethesda", GameType.ACTION, 14.57);
		
		ArrayList<Game> data = new ArrayList<Game>();
		
		displaySummary(data, true);
		
		displaySummary(data, false);
		
		data.add(g1);
		data.add(g2);
		data.add(g3);
		data.add(g4);
		
		displaySummary(data, true);
		
		displaySummary(data, false);
		
	}
	
	public static void displaySummary(ArrayList<Game> data, boolean fulldetails) {
		
		if (fulldetails == true && data.size() != 0) {
			
			for (int i = 0; i < data.size(); i++) {
				System.out.println(data.get(i) + "\n");
			}
			
		} else if (fulldetails == false && data.size() != 0) {
			
			for (int i = 0; i < data.size(); i++) {
				System.out.println(data.get(i).getTitle() + " (" + data.get(i).getPublisher() + ")");
			}
			
		} else {
			
			System.out.println("No data to display.\n");
			
		}
		
	}

}
