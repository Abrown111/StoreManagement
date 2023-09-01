
public class TShirt extends Clothing{
	private String size;
	private String design;
	
	/**
	 * Constructor for TShirt object. Takes same input as clothing plus size 
	 * and design. Uses class extension to use variables from Clothing class.
	 * @param price
	 * @param name
	 * @param sku
	 * @param size
	 * @param design
	 */
	public TShirt(double price, String name, String sku, String size, String design) {
		super(price, name, sku);
		this.size = size;
		this.design = design;
	}
	
	/**
	 * Getter method for the size of a TShirt
	 * @return (String) size of a TShirt
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * Setter method for the size of a TShirt
	 * @param size
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * Getter method for the design of a TShirt
	 * @return (String) design
	 */
	public String getDesign() {
		return design;
	}
	
	/**
	 * Setter method for the design of a TShirt
	 * @param design
	 */
	public void setDesign(String design) {
		this.design = design;
	}
	
	/**
	 * To string overrider for a TShirt
	 */
	public String toString() {
		return "[SKU: " + super.getSku() + "]" + "\t" + "Size " + size + " " + design + " " + super.getName() + ": $" + super.getPrice(); 
	}
}

