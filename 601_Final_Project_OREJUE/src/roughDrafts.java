import java.text.NumberFormat;

public class roughDrafts
{
	// build one array of fruits that references corresponding array of price at
	// same index

	public static void main(String args[])
	{

		String[] produceItem =
		{ "asparagus", "avocados", "red apples", "green apples", "bananas", "green beans", "beets", "blueberries",
				"broccoli", "blackberries", "cabbage", "cantaloupe", "carrots", "celery", "cauliflower", "coconut",
				"cherries", "cucumber", "cranberries", "eggplant", "garlic", "grapes", "grapefruit", "kiwi", "lemons",
				"romain lettuce", "limes", "mangos", "mushrooms", "mint", "yellow onions", "sweet onions", "oranges",
				"pears", "green peppers", "red peppers", "pineapple", "peas", "potatoes", "strawberries", "peaches",
				"spinach", "squash", "sweet potato", "tomato cherry", "tomato roma", "watermelon", "zucchini" };

		double[] producePrice =
		{ 2.87, 1.90, 1.07, 1.21, 1.86, 0.88, 1.88, 3.26, 1.96, 4.20, 1.16, 1.33, 0.83, 1.30, 3.74, 1.45, 1.26, 3.82,
				0.83, 1.52, 2.27, 3.27, 3.56, 0.88, 0.87, 1.46, 1.86, 0.94, 0.96, 1.29, 1.69, 1.00, 1.32, 1.85, 1.65,
				1.84, 3.30, 3.40, 1.96, 2.57, 2.79, 1.87, 1.28, 1.61, 3.64, 1.72, 2.99, 1.58 };

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

			double itemPrice = 0.00;

			// iterates over arrays to find string input with corresponding
			// price
			for (int i = 0; i < produceItem.length; i++)
			{
				if (produceItem[i].equals(purchaseItem))
					itemPrice = producePrice[i] * purchasePounds;
			}

			StdOut.println(fmt.format(itemPrice));

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

	}

}

// JOptionPane
// import javax.swing.*
// javax.swing.JOptionPane
// review java doc on JOptionPane and use examples
// JOptionPane.showMessageDialog(null, "alert", "alert",
// JOptionPane.ERROR_MESSAGE);
// String inputValue = JOptionPane.showInputDialog("Please input a value");

// Produce[] StoreProduce =
// {
// new Produce("Asparagus", 2.87), new Produce("Avocados", 1.90), new
// Produce("Red Apples", 1.07), new Produce("Green Apples", 1.21),
// new Produce("Bananas", 1.86), new Produce("Green Beans", 0.88), new
// Produce("Beets", 1.88), new Produce("Blueberries", 3.26),
// new Produce("Broccoli", 1.96), new Produce("Blackberries", 4.20), new
// Produce("Cabbage", 1.16), new Produce("Cantaloupe", 1.33),
// new Produce("Carrots", 0.83), new Produce("Celery", 1.30), new
// Produce("Cauliflower", 3.74), new Produce("Clementines", 1.45),
// new Produce("Coconut", 1.26), new Produce("Cherries", 3.82), new
// Produce("Cucumber", 0.83), new Produce("Cranberries", 1.52),
// new Produce("Eggplant", 2.27), new Produce("Garlic", 3.27), new
// Produce("Grapes", 3.56), new Produce("Grapefruit", 0.88),
// new Produce("Kiwi", 0.87), new Produce("Lemons", 1.46), new Produce("Romain
// Lettuce", 1.86), new Produce("Limes", 0.94),
// new Produce("Mangos", 0.96), new Produce("Mushroom", 1.29), new
// Produce("Mint", 1.69), new Produce("Yellow Onions", 1.00),
// new Produce("Sweet Onions", 1.32), new Produce("Pears", 1.85), new
// Produce("Green Peppers", 1.65), new Produce("Red Peppers", 1.84),
// new Produce("Pinneapple", 3.30), new Produce("Peas", 3.40), new
// Produce("Potatoes", 1.96), new Produce("Strawberries", 2.57),
// new Produce("Peaches", 2.79), new Produce("Spinach", 1.87), new
// Produce("Squash", 1.28), new Produce("Sweet Potato", 1.61),
// new Produce("Tomato Cherry", 3.64), new Produce("Tomato Roma", 1.72), new
// Produce("Watermelon", 2.99), new Produce("Zucchini", 1.58)
// };

// Produce[] produceItem =
// {
// new Produce("Asparagus"), new Produce("Avocados"), new Produce("Red Apples"),
// new Produce("Green Apples"),
// new Produce("Bananas"), new Produce("Green Beans"), new Produce("Beets"), new
// Produce("Blueberries"),
// new Produce("Broccoli"), new Produce("Blackberries"), new Produce("Cabbage"),
// new Produce("Cantaloupe"),
// new Produce("Carrots"), new Produce("Celery"), new Produce("Cauliflower"),
// new Produce("Clementines"),
// new Produce("Coconut"), new Produce("Cherries"), new Produce("Cucumber"), new
// Produce("Cranberries"),
// new Produce("Eggplant"), new Produce("Garlic"), new Produce("Grapes"), new
// Produce("Grapefruit"),
// new Produce("Kiwi"), new Produce("Lemons"), new Produce("Romain Lettuce"),
// new Produce("Limes"),
// new Produce("Mangos"), new Produce("Mushroom"), new Produce("Mint"), new
// Produce("Yellow Onions"),
// new Produce("Sweet Onions"), new Produce("Pears"), new Produce("Green
// Peppers"), new Produce("Red Peppers"),
// new Produce("Pinneapple"), new Produce("Peas"), new Produce("Potatoes"), new
// Produce("Strawberries"),
// new Produce("Peaches"), new Produce("Spinach"), new Produce("Squash"), new
// Produce("Sweet Potato"),
// new Produce("Tomato Cherry"), new Produce("Tomato Roma"), new
// Produce("Watermelon"), new Produce("Zucchini")
// };
//
// Produce[] producePrice =
// {
// new Produce(2.87), new Produce(1.90), new Produce(1.07), new Produce(1.21),
// new Produce(1.86), new Produce(0.88), new Produce(1.88), new Produce(3.26),
// new Produce(1.96), new Produce(4.20), new Produce(1.16), new Produce(1.33),
// new Produce(0.83), new Produce(1.30), new Produce(3.74), new Produce(1.45),
// new Produce(1.26), new Produce(3.82), new Produce(0.83), new Produce(1.52),
// new Produce(2.27), new Produce(3.27), new Produce(3.56), new Produce(0.88),
// new Produce(0.87), new Produce(1.46), new Produce(1.86), new Produce(0.94),
// new Produce(0.96), new Produce(1.29), new Produce(1.69), new Produce(1.00),
// new Produce(1.32), new Produce(1.85), new Produce(1.65), new Produce(1.84),
// new Produce(3.30), new Produce(3.40), new Produce(1.96), new Produce(2.57),
// new Produce(2.79), new Produce(1.87), new Produce(1.28), new Produce(1.61),
// new Produce(3.64), new Produce(1.72), new Produce(2.99), new Produce(1.58)
// };
//
