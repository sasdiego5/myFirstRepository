import java.text.NumberFormat;
import java.util.*;
public class roughDrafts
{
	// build one array of fruits that references corresponding array of price at
	// same index

	public static void main(String args[])
	{

		Date d1 = new Date();
		System.out.println(d1);
		
		Inventory inventory = new Inventory();
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		// StdOut.println("Welcome to the Virtual produce store, we sell many
		// fruits and
		// vegetables by the pound!");

		String buyOrPay = "yes";

		// StdOut.println("Add more items?");
		// String buyOrPay = StdIn.readLine();

		// loop to add as many items as desired

		// do
		while (buyOrPay.equals("yes"))
		{

			StdOut.println("Enter item you desire to buy:");
			String purchaseItem = StdIn.readLine();

			StdOut.println("How many pounds of " + purchaseItem + " do you want?");
			double purchasePounds = StdIn.readDouble();

			StdIn.readLine(); // !!!!! read and toss remaining newline \n !!!!!

			StdOut.println("Scanning: " + purchasePounds + " pounds of " + purchaseItem);

			System.out.println(inventory.findItem(purchaseItem, purchasePounds));

			StdOut.println("Add more items?");
			buyOrPay = StdIn.readLine();

		}
		// while(buyOrPay.equals("yes"));

		StdOut.println("Processing Total Payment...");

		double discount = 0.15;

		double discountPrice = 0.0;

		final double tax = 0.055;

		double finalCost = 0.00;

		double salesTax = 0.00;

		double subTotal = 0;

		StdOut.println("Do you have a membership to the Farmer's Market discount club?");

		String discountInput = StdIn.readLine();

		char discountClub = discountInput.charAt(0);

		if (discountClub == 'y' || discountClub == 'Y')
		{
			discountPrice = subTotal * discount;
		}

		salesTax = (subTotal - discountPrice) * tax;

		finalCost = subTotal - discountPrice + salesTax;

		StdOut.println("Farmer's Market Club membership discount " + fmt.format(discountPrice));

		StdOut.println("Sales Tax " + fmt.format(salesTax));

		StdOut.println("Final price " + fmt.format(finalCost));

//		// the index of both producePrice and produceItem are interrelated
//
//		// String Array that stores all fruits and vegetables sold in the market
//		String[] produceItem =
//		{ "asparagus", "avocados", "red apples", "green apples", "bananas", "green beans", "beets", "blueberries",
//				"broccoli", "blackberries", "cabbage", "cantaloupe", "carrots", "celery", "cauliflower", "coconut",
//				"cherries", "cucumbers", "cranberries", "eggplant", "garlic", "grapes", "grapefruit", "kiwis", "lemons",
//				"romain lettuce", "limes", "mangos", "mushrooms", "mint", "yellow onions", "sweet onions", "oranges",
//				"pears", "green peppers", "red peppers", "pineapple", "peas", "potatoes", "strawberries", "peaches",
//				"spinach", "squash", "sweet potato", "tomato cherry", "tomato roma", "watermelon", "zucchini" };
//
//		// double Array that stores the prices of all fruits and vegetables in
//		// the market
//		double[] producePrice =
//		{ 2.87, 1.90, 1.07, 1.21, 1.86, 0.88, 1.88, 3.26, 1.96, 4.20, 1.16, 1.33, 0.83, 1.30, 3.74, 1.45, 1.26, 3.82,
//				0.83, 1.52, 2.27, 3.27, 3.56, 0.88, 0.87, 1.46, 1.86, 0.94, 0.96, 1.29, 1.69, 1.00, 1.32, 1.85, 1.65,
//				1.84, 3.30, 3.40, 1.96, 2.57, 2.79, 1.87, 1.28, 1.61, 3.64, 1.72, 2.99, 1.58 };
//
//		// creates a new Receipt that stores the items the user wants to buy
//		Receipt shopCart = new Receipt();
//
//		NumberFormat fmt = NumberFormat.getCurrencyInstance();
//
//		double subTotal = 0.0;
//
//		StdOut.println("Welcome to the Virtual produce store, we sell many fruits and vegetables by the pound!");
//
//		String buyOrPay = "yes";
//
//		// do while loop to add as many items as desired
//		do
//		{
//			StdOut.println("Enter item you desire to buy:");
//			String purchaseItem = StdIn.readLine();
//
//			StdOut.println("How many pounds of " + purchaseItem + " do you want?");
//			double purchasePounds = StdIn.readDouble();
//
//			StdIn.readLine();
//
//			StdOut.println("Scanning: " + purchasePounds + " pounds of " + purchaseItem);
//
//			double itemPrice = 0.00;
//
//			// iterates over produceItem array to find string input with
//			// corresponding
//			// double price, which has the same index
//			for (int i = 0; i < produceItem.length; i++)
//			{
//				if (produceItem[i].equalsIgnoreCase(purchaseItem))
//					itemPrice = producePrice[i] * purchasePounds;
//			}
//
//			StdOut.println(fmt.format(itemPrice));
//			StdOut.println();
//
//			// adds a new item to the sales receipt
//			shopCart.addItem(purchaseItem, itemPrice, purchasePounds);
//
//			subTotal += itemPrice;
//
//			StdOut.println("Subtotal: " + fmt.format(subTotal));
//
//			StdOut.println();
//
//			StdOut.println("Add more items?");
//
//			buyOrPay = StdIn.readLine();
//
//		}
//		while (buyOrPay.equalsIgnoreCase("yes"));
//
//		StdOut.println("Amount due: " + fmt.format(subTotal));
//
//		StdOut.println();
//
//		StdOut.println("Do you have a discount Farmer's Market membership?");
//
//		char chIn = StdIn.readChar();
//
//		shopCart.addDiscount(chIn);
//
//		StdIn.readLine();
//
//		shopCart.addSalesTax();
//
//		StdOut.println(shopCart);
//
//		StdOut.println("15% Membership Discount " + shopCart.addDiscount(chIn));
//		StdOut.println();
//
//		StdOut.println("Sales Tax " + shopCart.addSalesTax());
//		StdOut.println();
//
//		StdOut.println("Total " + shopCart.getTotalCost());
//		StdOut.println();
//
//		StdOut.println("Thank you for Shopping at the Virtual Farmer's Market");
	}
}
