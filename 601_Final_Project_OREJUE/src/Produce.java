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
	private double Price;
	private double Pounds;
	private ArrayList<Produce> ProduceList = new ArrayList<Produce>();

	// Produce object with its corresponding attributes
	public Produce(String produceItem, double price)
	{
		this.produceItem = produceItem;
		this.Price = price;
	}
	
	public Produce(String produceItem, double price, double pounds)
	{
		this.produceItem = produceItem;
		this.Price = price;
		this.Pounds = pounds;
	}

	public double getPounds()
	{
		return Pounds;
	}

	public void setPounds(double pounds)
	{
		Pounds = pounds;
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

		productInfo = fmt.format(Price) + "\t\t" + Pounds + "\t\t" + produceItem;

		return productInfo;

	}

}
