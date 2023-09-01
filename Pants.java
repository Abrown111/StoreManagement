public class Pants extends Clothing{
	private int circumference;
	private int length;
	
	/**
	 * Constructor method for Pants object. Takes in same variables as 
	 * Clothing class, with the addition of circumference and length.
	 * @param price
	 * @param name
	 * @param sku
	 * @param circumference
	 * @param length
	 */
	public Pants(double price, String name, String sku, int circumference, int length) {
		super(price, name, sku);
		this.circumference = circumference;
		this.length = length;
	}
	
	/**
	 * Getter method for circumference of Pants
	 * @return (int) circumference of pants
	 */
	public int getCircumference() {
		return circumference;
	}
	
	/**
	 * Setter method for circumference of Pants
	 * @param circumference
	 */
	public void setCircumference(int circumference) {
		this.circumference = circumference;
	}
	
	/**
	 * Getter method for the length of Pants
	 * @return (int) length of Pants
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * Setter method for length of Pants
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * To string method. Returns readable format of all data concerning Pants
	 * object
	 */
	public String toString() {
		return "[SKU: " + super.getSku() + "]" + "\t" + circumference + "-" + length + " " + super.getName() + ": $" + super.getPrice(); 
	}

	
}
