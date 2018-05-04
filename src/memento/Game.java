package memento;

public class Game {
private int speed;
private int ms;

public void set(int speed,int ms) {this.speed=speed; this.ms=ms;}

public void load(Save save) {
	speed = save.getSpeed();
	ms = save.getMs();
}

public Save save() {
	return new Save(speed,ms);
}
@Override
public String toString() {
	return "Game [speed=" + speed + ", ms=" + ms + "]";
}

}
