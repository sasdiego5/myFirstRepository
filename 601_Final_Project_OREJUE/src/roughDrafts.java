import java.text.NumberFormat;
import java.util.*;

public class roughDrafts
{
	private	Inventory inventory = new Inventory();
	private Receipt shopCart = new Receipt();
	
	public void shop()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

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
			
			double purchasePrice;
			purchasePrice = inventory.findItem(purchaseItem, purchasePounds);
			
			StdOut.println("Added to sale: " + purchasePounds + " pounds of " + purchaseItem + " at " + fmt.format(purchasePrice));

			StdOut.println();

			// adds a new item to the sales receipt
			shopCart.addItem(purchaseItem, purchasePrice, purchasePounds);

			subTotal += purchasePrice;

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
		StdIn.readLine();
		StdOut.println();
		
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
