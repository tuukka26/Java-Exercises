import java.util.ArrayList;

public class ObjectsPizzaArrayList {

	public static void main(String[] args) {

		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
		
		pizzaList.add(new Pizza("Diavolo", 8.75));
		pizzaList.add(new Pizza("Frutti al Mare", 9.00));
		pizzaList.add(new Pizza("Alla Pollo", 7.50));
		
		for (Pizza pizzaListObject : pizzaList) {
			
			System.out.println(pizzaListObject.toString());
		}
	}

}
