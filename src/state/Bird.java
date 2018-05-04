package state;



public class Bird {
Station station;

 public void setStation(Station st) {station = st;}
 public void nextStation() {
	if(station instanceof BirdFlying ) {
		setStation(new BirdFlying());
	}else if(station instanceof BirdPause){
		setStation(new BirdPause());
	}else if(station instanceof BirdDead){
		setStation(new BirdDead());
	}
}
public void play() {
	station.play();
}
}
