import java.text.NumberFormat;
import java.util.Date;

/**
 *@author Diego F Orejuela.
 *SEIS 601 - 04 Friday
 *December 15, 2017
 *Virtual Farmer's Market 
 *The program consists of a fruits and vegetables market.
 *The user has the option to add as many items as desired
 *and decide how many pounds of that item wants to purchase.
 *The item, price and quantity are stored in a shopping cart.
 *At the end a sales receipt is printed with an optional
 *discount for members only.
 */

/**
 * VirtualMarket class contains the main method. This class is used to call
 * necessary methods from other classes
 */
public class VirtualMarket
{
	public static void main(String args[])
	{

		// creates a new Receipt that stores the items the user wants to buy
		Receipt shopCart = new Receipt();

		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		double subTotal = 0.0;	
		
		Date d1 = new Date();
				
		 Produce[] StoreProduce =
			 {
			 new Produce("Asparagus", 2.87), new Produce("Avocados", 1.90), new
			 Produce("Red Apples", 1.07), new Produce("Green Apples", 1.21),
			 new Produce("Bananas", 1.86), new Produce("Green Beans", 0.88), new
			 Produce("Beets", 1.88), new Produce("Blueberries", 3.26),
			 new Produce("Broccoli", 1.96), new Produce("Blackberries", 4.20), new
			 Produce("Cabbage", 1.16), new Produce("Cantaloupe", 1.33),
			 new Produce("Carrots", 0.83), new Produce("Celery", 1.30), new
			 Produce("Cauliflower", 3.74), new Produce("Clementines", 1.45),
			 new Produce("Coconut", 1.26), new Produce("Cherries", 3.82), new
			 Produce("Cucumber", 0.83), new Produce("Cranberries", 1.52),
			 new Produce("Eggplant", 2.27), new Produce("Garlic", 3.27), new
			 Produce("Grapes", 3.56), new Produce("Grapefruit", 0.88),
			 new Produce("Kiwi", 0.87), new Produce("Lemons", 1.46),
			 new Produce("Romain Lettuce", 1.86),  new Produce("Limes", 0.94),
			 new Produce("Mangos", 0.96), new Produce("Mushroom", 1.29), new
			 Produce("Mint", 1.69), new Produce("Yellow Onions", 1.00),
			 new Produce("Sweet Onions", 1.32), new Produce("Pears", 1.85), new
			 Produce("Green Peppers", 1.65), new Produce("Red Peppers", 1.84),
			 new Produce("Pinneapple", 3.30), new Produce("Peas", 3.40), new
			 Produce("Potatoes", 1.96), new Produce("Strawberries", 2.57),
			 new Produce("Peaches", 2.79), new Produce("Spinach", 1.87), new
			 Produce("Squash", 1.28), new Produce("Sweet Potato", 1.61),
			 new Produce("Tomato Cherry", 3.64), new Produce("Tomato Roma", 1.72), new
			 Produce("Watermelon", 2.99), new Produce("Zucchini", 1.58)
			 };

		System.out.println(d1);

		StdOut.println("Welcome to the Virtual produce store, we sell many fruits and vegetables by the pound!");

		String buyOrPay = "yes";

		// do while loop to add as many items as desired
		do
		{
			StdOut.println("Enter item you desire to buy:");
			String purchaseItem = StdIn.readLine();

			StdOut.println("How many pounds of " + purchaseItem + " do you want?");
			double purchasePounds = StdIn.readDouble();

			StdIn.readLine();

			StdOut.println("Scanning: " + purchasePounds + " pounds of " + purchaseItem);

			double itemPrice = 0.00;

			// iterates over produceItem array to find string input with
			// corresponding
			// double price, which has the same index
			for (int i = 0; i < StoreProduce.length; i++)
			{
				if (StoreProduce[i].getProduceItem().equals(purchaseItem))
					itemPrice = StoreProduce[i].getPrice() * purchasePounds;
			}

			StdOut.println(fmt.format(itemPrice));
			StdOut.println();

			// adds a new item to the sales receipt
			shopCart.addItem(purchaseItem, itemPrice, purchasePounds);

			subTotal += itemPrice;

			StdOut.println("Subtotal: " + fmt.format(subTotal));

			StdOut.println();

			StdOut.println("Add more items?");

			buyOrPay = StdIn.readLine();

		}
		while (buyOrPay.equalsIgnoreCase("yes"));

		StdOut.println("Amount due: " + fmt.format(subTotal));

		StdOut.println();

		StdOut.println("Do you have a discount Farmer's Market membership?");

		char chIn = StdIn.readChar();

		shopCart.addDiscount(chIn);

		StdIn.readLine();

		shopCart.addSalesTax();

		StdOut.println(shopCart);

		StdOut.println("15% Membership Discount " + shopCart.addDiscount(chIn));
		StdOut.println();

		StdOut.println("Sales Tax " + shopCart.addSalesTax());
		StdOut.println();

		StdOut.println("Total " + shopCart.getTotalCost());
		StdOut.println();

		StdOut.println("Thank you for Shopping at the Virtual Farmer's Market");
	}
}
