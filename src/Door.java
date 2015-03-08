
public class Door {

	private boolean rewarded;
	private boolean open;
	
	public Door () {
		setRewarded(false);
		setOpen(false);
	}
	
	public Door (boolean hasCar) {
		setRewarded(hasCar);
		setOpen(false);
	}

	public boolean hasCar () {
		return isRewarded();
	}
	
	public boolean hasGoat () {
		return ! isRewarded();
	}
	
	public boolean isRewarded() {
		return rewarded;
	}

	public void setRewarded(boolean rewarded) {
		this.rewarded = rewarded;
	}
	
	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isClosed() {
		return !isOpen();
	}
}
