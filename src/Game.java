import java.util.Random;

public class Game {

	private int numDoors = 0;
	private Door[] doors;

	private int awardedDoor;
	private int chosenDoor;
	
	private Random rand = new Random();
	
	public Game(int number) {

		numDoors = number;
		doors = new Door[numDoors];

		for (int i = 0; i < numDoors; i++) {
			doors[i] = new Door();
		}

		awardedDoor = rand.nextInt(numDoors);
		//System.out.println("awarded: " + awardedDoor);
		
		doors[awardedDoor].setRewarded(true);
	}

	public void setChosenDoor(int chosen) {

		chosenDoor = chosen;
		//System.out.println("chosen: "+chosen);
	}

	public void openDoors() {

		if(winner()) {
			int decoyDoor = -1;
			while (decoyDoor == -1) {
				int candidate = rand.nextInt(numDoors);
				
				if (candidate != chosenDoor ){
					decoyDoor = candidate;
				}
			}

			for (int i = 0; i < numDoors; i++) {
				if (i != chosenDoor && i != decoyDoor) {
					doors[i].setOpen(true);
					//System.out.println("Open door: " + i);
				}

			}	
		} else {
			for (int i = 0; i < numDoors; i++) {
				if (i != chosenDoor && i != awardedDoor) {
					doors[i].setOpen(true);
					//System.out.println("Open door: " + i);
				}

			}
			
		}
		
	}

	public void change() {
		//System.out.print("Changed from: "+chosenDoor);
		for (int i = 0; i < numDoors; i++) {
			if (doors[i].isClosed()  && i != chosenDoor ) {
				chosenDoor = i;
				//System.out.println(" to: "+chosenDoor);
				break;
			}

		}
	}
	
	public boolean winner () {
		return chosenDoor == awardedDoor;
	}
}
