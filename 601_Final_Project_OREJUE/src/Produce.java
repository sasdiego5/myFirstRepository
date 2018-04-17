import java.text.NumberFormat;

/**
 * Produce class represents an item object each item has a name, price and
 * quantity. This class allows to create an array that contains all the produce
 * items that the user wants to buy.
 * 
 */

public class Produce
{

	private String produceItem;
	private double Price, Quantity;

	// Produce object with its corresponding attributes
	public Produce(String produceItem, double price, double quantity)
	{
		this.produceItem = produceItem;
		this.Price = price;
		this.Quantity = quantity;
	}

	// toString method that prints each produce object with
	// corresponding attributes: quantity, name and price
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String productInfo;

		productInfo = fmt.format(Price) + "\t\t" + Quantity + "\t\t" + produceItem;

		return productInfo;

	}

}
