import java.util.ArrayList;
import java.util.Random;

public class Plane {
	int numberOfPassengers = 100;
	ArrayList<Snake> snakes= new ArrayList<Snake>();
	public Plane() {
		for(int i = 0; i < 100; i++) {
			Snake snake = new Snake(new Random().nextBoolean(), new Random().nextInt(10)+1, i);
			snakes.add(snake);
		}	
	
	}
	
	
}