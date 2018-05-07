import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Receipt class creates a sales receipt from the market contains supporting
 * methods to create an informative receipt
 * 
 */

public class Receipt
{
	private Produce[] shopCart;
	private int count;
	private double totalCost;
	private double salesTaxPrice;
	private double discountPrice;

	private ArrayList<Produce> ProduceList = new ArrayList<Produce>();
	
	private final double discount = 0.15;

	private final double salesTax = 0.055;

	public Receipt()
	{
		shopCart = new Produce[50];
	}

	// adds a new produce object to an array virtual shopping cart
	public void addItem(String produceItem, double price, double quantity)
	{
		shopCart[count] = new Produce(produceItem, price, quantity);

		totalCost += price;

		count++;
	}

	// adds sales tax to total amount
	public String addSalesTax()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		salesTaxPrice = (totalCost - discountPrice) * salesTax;

		return fmt.format(salesTaxPrice);

	}

	// substracts discount percentage if user is a member of discount club
	public String addDiscount(char ch)
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		if (ch == 'y' || ch == 'Y')
		{
			discountPrice = totalCost * discount;

			return fmt.format(discountPrice);
		}
		else
		{
			discountPrice = 0.0;
			return fmt.format(discountPrice);
		}

	}

	// accessor method to obtain final cost
	public String getTotalCost()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		totalCost = totalCost - discountPrice + salesTaxPrice;

		return fmt.format(totalCost);
	}

	// toString method to print the sales receipt
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String receipt = "************************************************* \n";
		receipt += "Virtual Farmer's Market Sales Receipt \n \n";

		receipt += "Price\t\t Pounds \t\t Item\n\n";

		for (int item = 0; item < count; item++)
			receipt += shopCart[item].toString() + "\n\n";

		receipt += "Number of items: " + count + "\n\n";
		receipt += "SubTotal: " + fmt.format(totalCost) + "\n";
		receipt += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";

		return receipt;
	}

}
