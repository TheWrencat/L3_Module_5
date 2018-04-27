package data_structures;

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
		void hang() {
			System.out.println("Hanging an " + +" ornament");
		}
	}

	class Decorator {
		ArrayList<Ornament> boxOfDecorations;// in Decorator class
	}
	// Add a color to the Ornament class so that your program prints “Hanging a red
	// ornament”, etc.

	public static void main(String[] args) {
		listIterationBeginner beginner = new listIterationBeginner();

		for (int i = 0; i < beginner.theYard.size(); i++) {
			beginner.theYard.get(i).feed();

		}
		for (int i = 0; i < beginner.bubbleWrap.size(); i++) {
			beginner.bubbleWrap.get(i).pop();

		}
		for (int i = 0; i < beginner.boxOfDecorations.size(); i++) {
			beginner.boxOfDecorations.get(i).hang();

		}

	}

}
