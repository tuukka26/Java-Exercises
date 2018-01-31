
public class ObjectsPizzaProgram {


	public static void main(String[] args) {
		
		Pizza firstPizza = new Pizza("Diavolo", 8.75);
		Pizza secondPizza = new Pizza("Frutti al Mare", 9.00);
		Pizza thirdPizza = new Pizza("Alla Pollo", 7.50);
		 
		System.out.println(firstPizza.toString());
		System.out.println(secondPizza.toString());
		System.out.println(thirdPizza.toString());
	}
	
}

