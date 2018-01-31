import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> itemList = new ArrayList<Item>();

	public ShoppingCart() {

	}

	public void add(Product product, int quantity) {

		itemList.add(new Item(product, quantity));

	}

	public void remove(Product product) {

		ArrayList<Item> removeList = new ArrayList<Item>();

		for (Item itemObject : itemList) {

			if (itemObject.getProduct().equals(product)) {

				removeList.add(itemObject);

			}

		}

		itemList.removeAll(removeList);
	}

	public double getTotalPrice() {

		double totalPrice = 0;

		for (Item itemObject : itemList) {

			totalPrice += itemObject.getProduct().getPrice() * itemObject.getQuantity();
		}
		return totalPrice;

	}

	public String toString() {

		String output = "";

		if (itemList.isEmpty()) {

			output = "There are no items in the shopping cart. \n";

		} else {

			DecimalFormat twoDecimals = new DecimalFormat("0.00");

			output = "=== Shopping cart === \n";

			for (Item itemObject : itemList) {

				output += itemObject.getProduct().getNumber() + ": " + itemObject.getProduct().getName()
						+ ", quantity: " + itemObject.getQuantity() + ", unit price: "
						+ twoDecimals.format(itemObject.getProduct().getPrice()) + ", subtotal: "
						+ twoDecimals.format(itemObject.getSubtotal()) + "\n";

			}

			output += "TOTAL PRICE: " + twoDecimals.format(getTotalPrice()) + " euros \n";

		}
		return output;
	}
}
