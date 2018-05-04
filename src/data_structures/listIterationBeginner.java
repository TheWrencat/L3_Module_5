package data_structures;

import java.awt.Color;
import java.util.ArrayList;

public class listIterationBeginner {

	// 1. Feed all the pigs in the yard.
	class Pig {
		void feed() {
			System.out.println("feeding pigs");
		}
	}

	ArrayList<Pig> theYard = new ArrayList<Pig>();

	// 2. Pop all the bubbles in the bubble wrap.
	class Bubble {
		void pop() {
		}
	}

	ArrayList<Bubble> bubbleWrap = new ArrayList<Bubble>();

	// 3. Play all the songs in the playlist.
	class Song {
		void play() {
		}
	}

	ArrayList<Song> playlist = new ArrayList<Song>();

	// 4. Code the Ornament and Decorator classes. Add some Ornaments to the
	// boxOfDecorations in the Decorator class. Hang all the ornaments in the box.
	class Ornament {
		Color hue;
		Color getHue() {
			return hue;
		}
		void setHue(Color hue) {
			this.hue = hue;
		}
		void hang() {
			System.out.println("Hanging an"+getHue()+" ornament");
		}
	}

	class Decorator {
		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
		public Decorator(){
			Ornament red = new Ornament();
			red.setHue(Color.red);
			boxOfDecorations.add(red);
			Ornament orange = new Ornament();
			orange.setHue(Color.orange);
			boxOfDecorations.add(orange);
			Ornament yellow = new Ornament();
			yellow.setHue(Color.yellow);
			boxOfDecorations.add(yellow);
			Ornament green = new Ornament();
			green.setHue(Color.green);
			boxOfDecorations.add(green);
			Ornament blue = new Ornament();
			blue.setHue(Color.blue);
			boxOfDecorations.add(blue);
			Ornament purple = new Ornament();
			purple.setHue(Color.MAGENTA);
			boxOfDecorations.add(purple);
			
		}
	}
	// Add a color to the Ornament class so that your program prints “Hanging a red
	// ornament”, etc.

	public static void main(String[] args) {
		listIterationBeginner beginner = new listIterationBeginner();
		Decorator decorator = beginner.new Decorator();
		for (int i = 0; i < beginner.theYard.size(); i++) {
			beginner.theYard.get(i).feed();

		}
		for (int i = 0; i < beginner.bubbleWrap.size(); i++) {
			beginner.bubbleWrap.get(i).pop();

		}
		for (int i = 0; i < decorator.boxOfDecorations.size(); i++) {
			decorator.boxOfDecorations.get(i).hang();

		}

	}

}
