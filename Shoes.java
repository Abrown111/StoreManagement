
public class Shoes extends Clothing{
	private int size;
	private String material;
	
	/**
	 * Constructor for Shoes object. Takes in same variables as parent class 
	 * with the addition of material and size.
	 * @param price
	 * @param name
	 * @param sku
	 * @param size
	 * @param material
	 */
	public Shoes(double price, String name, String sku, int size, String material) {
		super(price, name, sku);
		this.size = size;
		this.material = material;
	}
	
	/**
	 * Getter method for the size of a Shoe
	 * @return (int) size
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Setter method for the size of a shoe
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * Getter method for the material of a Shoe
	 * @return (String) material
	 */
	public String getMaterial() {
		return material;
	}
	
	/**
	 * Setter method for the material of a shoe
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	/**
	 * To string method that returns a readable line with all the data of that
	 * shoe
	 */
	public String toString() {
		return "[SKU: " + super.getSku() + "]" + "\t" + "Size " + size + " " + material + " " + super.getName() + ": $" + super.getPrice(); 
	}
}
