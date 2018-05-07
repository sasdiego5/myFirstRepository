
public class MarketDriver
{
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

	public static void main(String[] args)
	{
//		VirtualMarket FarmersMarket = new VirtualMarket();
//		
//		FarmersMarket.Shop();

		Inventory inventory = new Inventory();
		
		StdOut.println(inventory.toString());
		
		roughDrafts FarmersMarkets = new roughDrafts();
		
		FarmersMarkets.shop();
	}
	

}
