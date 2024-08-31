import java.util.Arrays;

public class BagTest {

	public static void main(String[] args) {
		// 
		ShoppingCart<String> testCart = new ShoppingCart<>();
		System.out.println("...Testing an empty bag with " +
				"capacity of 25...");
		System.out.println("Getting current size: " +testCart.getCurrentSize());
		
		System.out.println("Making sure it is empty: " +testCart.isEmpty());
		
		System.out.println("Adding one item: " +testCart.add("A"));
		System.out.println("Checking the current size now: " +testCart.getCurrentSize());
		System.out.println("Adding the same item again: " +testCart.add("A"));
		System.out.println("Making sure the cart contains this item:"+testCart.contains("A"));
		System.out.println("Testing how many times this item is in the cart:"+testCart.getFrequencyOf("A"));
		System.out.println("Adding a few new items: " +testCart.add("B")+testCart.add("C")+testCart.add("D")
				+ testCart.add("D")+testCart.add("C")+testCart.add("D")+testCart.add("E"));
		System.out.println("Checking the current size now: " +testCart.getCurrentSize());
		System.out.println("Printing the current contents:"+Arrays.toString(testCart.toArray()));
		System.out.println("Removing an item: "+testCart.remove());
		System.out.println("Printing the current contents:"+Arrays.toString(testCart.toArray()));
		System.out.println("Removing specifically duplicate items: "+testCart.remove("A")
				+ testCart.remove("D")+testCart.remove("C")+testCart.remove("D"));
		System.out.println("Printing the current contents:"+Arrays.toString(testCart.toArray()));
		System.out.println("Clearing out the cart: ... ");
		testCart.clear();
		System.out.println("Checking the current size now: " +testCart.getCurrentSize());
	
	}//end main

}//end class
