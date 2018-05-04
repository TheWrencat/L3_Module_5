package data_structures;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class listIterationFluent {
	//#1 - Make an ArrayList of Eggs.
	//#2 - Crack all the eggs in the carton.
	//Provided: 
	class Egg {
		
	void crack(){}
	} 
	//2. In Eclipse ,   create the  Classroom  and  Student  objects containing the following member variables.
	//a. Instantiate the human Students in your class today.
	//b. Store the Students in an ArrayList and find their average IQ.
	class Student {
		int IQ;
		int getIQ() {
			return IQ;
		}
		void setIQ(int IQ) {
			this.IQ = IQ;
		}
	}
	class Classroom {
		ArrayList<Student> attendance = new ArrayList<Student>();
		public Classroom() {
			Student Abel = new Student();
			attendance.add(Abel);
			Abel.setIQ(150);
			Student Betty = new Student();
			attendance.add(Betty);
			Betty.setIQ(90);
			Student Candace = new Student();
			attendance.add(Candace);
			Candace.setIQ(130);
			Student David = new Student();
			attendance.add(David);
			David.setIQ(160);
			Student Evan = new Student();
			attendance.add(Evan);
			Evan.setIQ(100);
		}
	}
	public static void main(String[] args) {
		listIterationFluent fluent = new listIterationFluent();
		Classroom classe = fluent.new Classroom();
		ArrayList<Egg> breakfast = new ArrayList<Egg>();
		for(int i = 0; i<breakfast.size(); i++) {
			breakfast.get(i).crack();
		}
		int totalIQ = 0;
		for(int i = 0; i<classe.attendance.size(); i++) {
			int currentIQ = classe.attendance.get(i).IQ;
			totalIQ += currentIQ;
		}
		int averageIQ = totalIQ/classe.attendance.size();
		System.out.println("The class' average IQ is: "+averageIQ);
		
	}
}
