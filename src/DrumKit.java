
public class DrumKit {
	private boolean topHat = true;
	private boolean snare = true;
	public void startDrum() {
		if(isSnare()) {
			playSnare();
		}
	}
	public boolean isTopHat() {
		return topHat;
	}
	public void setTopHat(boolean topHat) {
		this.topHat = topHat;
	}
	public boolean isSnare() {
		return snare;
	}
	public void setSnare(boolean snare) {
		this.snare = snare;
	}
	public void playSnare() {
		System.out.println("bang bang ba-bang");	
	}
	public void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}
