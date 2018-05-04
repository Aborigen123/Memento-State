package memento;

import java.io.File;

import state.Bird;
import state.BirdDead;
import state.BirdFlying;
import state.BirdPause;
import state.Station;

public class Main {

	public static void main(String[] args) {
Game game = new Game();
Station bf = new BirdFlying();
Station bp = new BirdPause();
Station bd = new BirdDead();
Bird bird = new Bird();




game.set(800, 5000);
System.out.println(game);

FileSave file = new FileSave();
file.setSave(game.save());

game.set(1600, 10000);
System.out.println(game);

System.out.println("load");
game.load(file.getSave());
System.out.println(game);

bird.setStation(bf);
bird.play();

	}

}
