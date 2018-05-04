package memento;

public class Save {
	private final int speed;
	private final int ms;
	public Save(int speed, int ms) {
		this.speed = speed;
		this.ms = ms;
	}
	public int getSpeed() {
		return speed;
	}
	public int getMs() {
		return ms;
	}
	
}
