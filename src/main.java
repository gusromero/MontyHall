import java.util.Random;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUM_DOORS = 100;
		final int NUM_ITERATIONS = 100000;
		
		Random rand = new Random();
		
		int positiveResults = 0;
		
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			
			Game game = new Game (NUM_DOORS);
			
			int chosen  = rand.nextInt(NUM_DOORS);
			
			game.setChosenDoor(chosen);
			
			game.openDoors();
		
			if (game.winner()) {
				positiveResults ++;
			}

		}
		
		System.out.println("Without Change:");
		System.out.println("Num Iterations: " +NUM_ITERATIONS );
		System.out.println("Winnings: " +positiveResults );
		System.out.println("Percentage: " + (float) 100* positiveResults/NUM_ITERATIONS );
		
		
		System.out.println("--------------------------------");
		
		
		positiveResults = 0;
		
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			
			Game game = new Game (NUM_DOORS);
			
			int chosen  = rand.nextInt(NUM_DOORS);
			
			game.setChosenDoor(chosen);
			
			game.openDoors();
			
			game.change();
			
			if (game.winner()) {
				positiveResults ++;
			}
		}
		
		System.out.println("Changing:");
		System.out.println("Num Iterations: " +NUM_ITERATIONS );
		System.out.println("Winnings: " +positiveResults );
		System.out.println("Percentage: " + (float) 100* positiveResults/NUM_ITERATIONS );
	}

	
	
}
