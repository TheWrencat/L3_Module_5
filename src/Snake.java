import java.util.Random;

public class Snake {

	private Boolean venomous;
	private int viciousness;
	private int number;
	public Snake(Boolean venomous, int viciousness, int number) {
		this.venomous = venomous;
		this.viciousness = viciousness;
		this.number = number;
	}
	 public Boolean getVenomous(){
			return venomous;
		}
	 public int getViciousness(){
				return viciousness;
	}
	public void setVenomous (Boolean b) {
		venomous = b;
	}
	public void setViciousness (int c) {
		viciousness = c;
	}
	 

}
