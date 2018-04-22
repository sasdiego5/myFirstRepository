import java.text.NumberFormat;
import java.util.ArrayList;

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
	private ArrayList<Produce> ProduceList = new ArrayList<Produce>();

	// Produce object with its corresponding attributes
	public Produce(String produceItem, double price, double quantity)
	{
		this.produceItem = produceItem;
		this.Price = price;
		this.Quantity = quantity;
	}
	

	public String getProduceItem()
	{
		return produceItem;
	}

	public void setProduceItem(String produceItem)
	{
		this.produceItem = produceItem;
	}

	public double getPrice()
	{
		return Price;
	}

	public void setPrice(double price)
	{
		Price = price;
	}

	public double getQuantity()
	{
		return Quantity;
	}

	public void setQuantity(double quantity)
	{
		Quantity = quantity;
	}

	public ArrayList<Produce> getProduceList()
	{
		return ProduceList;
	}

	public void setProduceList(ArrayList<Produce> produceList)
	{
		ProduceList = produceList;
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
