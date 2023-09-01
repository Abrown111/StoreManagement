import java.util.*;
public class main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sku = "";
		
		while(!sku.equals("q")) {
			System.out.println("Current catalog:");
			System.out.println(Clothing.getCatalogString());
			System.out.println();
			System.out.print("(q to quit) Enter SKU to sell: ");
			sku = input.nextLine();
			if(sku.equals("q")){
				break;
			}
			System.out.println(Clothing.sell(sku));
		}
		
	}

}
 