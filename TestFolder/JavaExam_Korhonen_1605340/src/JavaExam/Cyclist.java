
public class Cyclist {

	
	private String name;
	private double weight;
	private double climbingPower;
	
	public Cyclist(String name, double weight, double climbingPower) {
		super();
		this.name = name;
		this.weight = weight;
		this.climbingPower = climbingPower;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getClimbingPower() {
		return climbingPower;
	}
	
	public double getWattsPerKilo(double weight, double climbingPower) {
	
	 double wattsPerKilo = climbingPower / weight;
	 
	 return wattsPerKilo;
	}
}
