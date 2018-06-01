
public class SnakesOnAPlane {
public static void main(String[] args) {
	int totalVenom = 0;
	Plane plane = new Plane();
	for(int i = 0; i < plane.snakes.size(); i++) {
		if( plane.snakes.get(i).getVenomous() ) {
			totalVenom += plane.snakes.get(i).getViciousness();
		}
	}
	int chanceOfDeath = (totalVenom *10)/ plane.numberOfPassengers;
	System.out.println(chanceOfDeath+"%");
}
}
