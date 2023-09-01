import java.util.*;

public class Clothing {
	private double price;
	private String name = "";
	private String sku = "";
	private static int totalInventory;
	private static double totalSales;
	private static ArrayList<Clothing> catalog = new ArrayList<Clothing>();
	
	/**
	 * Static block for Clothing class. Loops ten times, creating a new sku
	 * for each time. It also randomizes a class to use using String arrays.
	 * Then, it decides which class to use and randomizes all of the data
	 * that the class would need using arrays as well. It then inputs this 
	 * into the constructor, creating a new object. Since the objects all
	 * extend from the Clothing class which adds the object to the catalog upon
	 * construction, each item here is automatically added to the list.
	 * 
	 */
	static {
		for(int i = 0; i < 10; i ++) {
			String sku = "1234-" + (i+1);
			String[] randClass = {"Shoes", "Pants", "TShirt"};
			String classes = randClass[random(randClass.length)];
			if(classes.equals("Shoes")) {
				int[] sizes = {7, 8, 9, 10, 11, 12, 13};
				String[] material = {"Leather", "Rubber", "Synthetic", "Foam"};
				String[] names = {"Lightning-Mcqueen Crocs", "Dress Shoes", "Tennis Shoes", "Running Shoes"};
				double price = 0;
				while(price < 50) {
				   price = randomDouble(150);
				   price *= 100;
				   price = Math.round(price);
				   price /= 100;
				}
				Shoes s = new Shoes(price, names[random(names.length)], sku, sizes[random(sizes.length)], material[random(material.length)]);
			}else if(classes.equals("Pants")) {
				int[] cir = {27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
				int[] length = {27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
				String[] names = {"Jeans", "Sweatpants", "Khakis", "Suit Pants"};
				double price = 0;
				while(price < 50) {
					price = randomDouble(500);
					price *= 100;
					price = Math.round(price);
					price /= 100;
				}
				Pants p = new Pants(price, names[random(names.length)], sku, cir[random(cir.length)], length[random(length.length)]);
			}else if(classes.equals("TShirt")){
				String[] size = {"XS", "S", "M", "L", "XL", "XXL"};
				String[] design = {"Hawaiian", "Polo", "Button-down", "Crewneck", "V-Neck", "Polka-Dot"};
				String[] names = {"T-Shirt", "Sweater", "Dress-shirt", "Long-sleeve shirt"};
				double price = 0;
				while(price < 16) {
					price = randomDouble(80);
					price *= 100;
					price = Math.round(price);
					price /= 100;
				}
				TShirt t = new TShirt(price, names[random(names.length)], sku, size[random(size.length)], design[random(design.length)]);
			}
		}
	}
	
	/**
	 * Constructor for Clothing class. Takes price, name, and SKU and sets
	 * each one of the instance variables to these values. At the end,
	 * it adds the current item to the catalog (a static instance variable
	 * that cannot change based off the object made).
	 * @param price
	 * @param name
	 * @param sku
	 */
	
	public Clothing(double price, String name, String sku) {
		this.price = price;
		this.name = name;
		this.sku = sku;
		totalInventory ++;
		catalog.add(this);
	}
	
	/**
	 * Static method to return a random integer between 0 and n, the input
	 * variable.
	 * @param n
	 * @return (int) random value between 0 and n
	 */
	public static int random(int n) {
		return (int)(Math.random() * n);
	}
	
	/**
	 * Static method to return a random double between 0 and n, the input
	 * variable.
	 * @param n
	 * @return (double) random value between 0 and n
	 */
	public static double randomDouble(int n) {
		return (double)(Math.random() * n);
	}
	
	/**
	 * Static getter method to return the catalog
	 * @return (ArrayList) catalog
	 */
	public static ArrayList<Clothing> getCatalog(){
		return catalog;
	}
	
	/**
	 * Static getter method for a readable version of the catalog
	 * @return (String) catalog in readable format
	 */
	public static String getCatalogString() {
		String catString = "";
		for(Clothing c: catalog) {
			catString += c + "\n";
		}
		return  catString;
	}

	/**
	 * Getter method for price of a Clothing object
	 * @return (double) price of Clothing object
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter method for the price of a Clothing object
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Getter method for the name of a Clothing object
	 * @return (String) name of a Clothing object
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for the name of a Clothing object
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for the SKU of a Clothing object
	 * @return (String) SKU of a Clothing object
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * Setter method for the SKU of a Clothing object
	 * @param sku
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	/**
	 * Static method to "sell" an item from the catalog. Loops through each item 
	 * in the catalog and checks to see if that item's SKU matches the input
	 * SKU (item that the user desires to sell). If it does, the total sales
	 * raises by the price of the object sold, the total inventory is lessened
	 * by one, and the item is removed from the catalog. A confirmation string 
	 * is returned which shows the total sales and total inventory. If item 
	 * not found, the method will return a message that tells the user this.
	 * @param sku
	 * @return (String) Confirmation of sale of item
	 */
	public static String sell(String sku) {
		for(Clothing v: catalog) {
			if(v.getSku().equals(sku)) {
				totalSales += v.getPrice();
				totalInventory --;
				catalog.remove(v);
				return "\nItem sold! Total sales to date: $" + totalSales + "\nCurrent number of item is inventory: " + totalInventory; 
			}
		}
		return "\nItem not found!";
		
	}


	/**
	 * To string method for clothing objects that have not been overriden.
	 */
	public String toString() {
		return "Clothing [price=" + price + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
