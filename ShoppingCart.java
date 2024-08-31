import java.util.Arrays;

public class ShoppingCart <T> {
	    
	ArrayBag<T> testBag = new ArrayBag<>();
	
	public int getCurrentSize() {
		return testBag.getCurrentSize() ;
	     }//end getCurrentSize
	 
	public boolean isEmpty() {
		return testBag.isEmpty();
	     }//end isEmpty
	 
	public boolean add(T newItem) {
	    	 return testBag.add(newItem);
	     }//end add
	 
	public T remove() {
	    	return (T) testBag.remove();
	     }//end general remove
	       
	public boolean remove(T anItem) {
	    return	 testBag.remove(anItem);
	     }//end precise remove
	 
	public void clear() {
	    	 testBag.clear();
	     }//end clear
	  
	public int getFrequencyOf(T anItem) {
	    	return testBag.getFrequencyOf(anItem);
	     }//end getFrequencyOf
	 
	public boolean contains(T anItem) {
	    	return testBag.contains(anItem);
	     }//end contains
	   
	public T[] toArray() {
	    	return (T[]) testBag.toArray();
	     }//end toArray

	@Override
	public String toString() {
		return "ShoppingCart [, getCurrentSize()=" + getCurrentSize() + ", isEmpty()="
				+ isEmpty() + ", remove()=" + remove() + ", toArray()=" + Arrays.toString(toArray()) + "]";
	}
	
}//end class
