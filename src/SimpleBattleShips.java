
public class SimpleBattleShips {
	private int[] locationCells;
	private int numberOfHits = 0;
	
	public String checkStatus(String guess) {
		int intGuess = Integer.parseInt(guess);
		String result = "miss";
		for(int cell : locationCells) {
			if(intGuess==cell) {
				result = "hit";
				numberOfHits ++;
				break;
			}
		}
		if(numberOfHits == locationCells.length) { result = "kill"; }
		return result;
	}
	public int[] getLocationCells() {
		return locationCells;
	}
	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}
	public int getNumberOfHits() {
		return numberOfHits;
	}
	public void setNumberOfHits(int numberOfHits) {
		this.numberOfHits = numberOfHits;
	}
}
