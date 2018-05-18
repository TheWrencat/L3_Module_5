package data_structures;

import java.util.ArrayList;

public class ListIterationMaster {
	ListIterationMaster() {
		ArrayList<Song> CD = new ArrayList<>();
		for (int i = 0; i < CD.size(); i++) {
			CD.get(i).getDuration();
		}
		ArrayList<Student> classmates = new ArrayList<Student>();
		Student a = new Student();
		classmates.add(a);
		a.eyeColor = "Brown";
		Student b = new Student();
		classmates.add(b);
		b.eyeColor = "Brown";
		Student c = new Student();
		classmates.add(c);
		c.eyeColor = "Brown";
		Student d = new Student();
		classmates.add(d);
		d.eyeColor = "Blue";
		int tallyBr = 0;
		int tallyBl = 0;
		for (int i = 0; i < classmates.size(); i++) {
			String currentEyes = classmates.get(i).eyeColor;
			if (currentEyes.equals("Brown")) {
				tallyBr++;
			}
			if (currentEyes.equals("Blue")) {
				tallyBl++;
			}
		}
		if (tallyBr == tallyBl) {
			System.out.println("There is no most popular eye color");
		} else if (tallyBr < tallyBl) {
			System.out.println("the most popular eye color is blue");
		} else if (tallyBr > tallyBl) {
			System.out.println("the most popular eye color is brown");
		}

	}

	// #1 - Make an ArrayList “CD” of Songs. The ArrayList will represent all the
	// songs on a CD.
	// #2 - Calculate the running time of the CD given:
	class Song {
		double getDuration() {
			int x = 0;
			return x;
		}
	}

	// 2. In ​Eclipse​, make an ArrayList of Students and add each of your
	// classmates. Then use this ArrayList to work out the most popular eye color.
	class Student {
		private String eyeColor;
		private String name;

		double getEyeColor() {
			return 0;

		}
	}

	// 3. On ​paper​, calculate how many pencils need to be sharpened
	class Pencil {
		boolean isBlunt() {
			return false;

		}

		ArrayList<Pencil> pencilCase;
	}

	public static void main(String[] args) {
		new ListIterationMaster();

	}

}
