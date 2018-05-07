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

		Inventory inventory = new Inventory();

		Receipt shopCart = new Receipt();

		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		Date d1 = new Date();

		System.out.println(d1);

		StdOut.println("Welcome to the Virtual produce store, we sell many fruits and vegetables by the pound!");

		String buyOrPay = "yes";
		
		double subTotal = 0.0;	

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
			
			itemPrice = inventory.findItem(purchaseItem, purchasePounds);
			
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
