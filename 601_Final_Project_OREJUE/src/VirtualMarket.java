import java.text.NumberFormat;
import java.util.Date;

public class VirtualMarket
{

	private Inventory inventory = new Inventory();
	private Receipt shopCart = new Receipt();
	
	public void Shop()
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
