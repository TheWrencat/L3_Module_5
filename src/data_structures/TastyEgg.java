package data_structures;
import java.util.Random;

public class TastyEgg {
	private Egg egg;

	public TastyEgg(Egg egg) {
		this.egg = egg;
	}

	Egg getKinderSurpriseContents() { 
		// ADD CODE HERE
		
	}
}

class Egg {
	private Toy toy;

	public Egg(Toy toy) {
		this.toy = toy;
	}

	Toy getEggContents() {
		// ADD CODE HERE
		
	}
}

class Toy {
	String getToyName() {
		int randomToySelector = new Random().nextInt(2);
		if (randomToySelector == 0)
			return "play doh";
		else 
			return "train";
	}
}
