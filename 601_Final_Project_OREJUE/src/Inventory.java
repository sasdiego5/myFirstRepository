import java.text.NumberFormat;
import java.util.*;

public class Inventory
{
	
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
	 
	 
	 public double findItem(String purchaseItem, double purchasePounds) {
			
		 double itemPrice = 0.0;
		 
			for (int i = 0; i < StoreProduce.length; i++)
			{
				if (StoreProduce[i].getProduceItem().equalsIgnoreCase(purchaseItem))
					itemPrice = StoreProduce[i].getPrice() * purchasePounds;
			}

		 return itemPrice;
		
	 }
}
