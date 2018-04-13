package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class BandNameGenerator {
	ArrayList <String> adj;
	ArrayList<String> noun;
	private void setup() {
		adj = new ArrayList<String>();
		noun = new ArrayList<String>();
		adj.add("Translucent");
		adj.add("Stunning");
		adj.add("Aquatic");
		noun.add("Bees");
		noun.add("Fruit");
		noun.add("Burritos");
		int r = new Random().nextInt(3);
		String one = adj.get(r);
		int s = new Random().nextInt(3);
		String two = noun.get(s);
		System.out.println("The "+one+" "+two+"!");
	}
	
	public static void main(String[] args) {
		BandNameGenerator band = new BandNameGenerator();
		band.setup();
	}
	
}
