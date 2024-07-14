package bheem;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashmap {

	public static void main(String[] args) {
		  HashMap<String, Integer> hashMap = new HashMap<>();
	        
	      // Add elements to the HashMap
	      hashMap.put("John", 25);
	      hashMap.put("Jane", 30);
	      hashMap.put("Jim", 35);
	        
	      // Access elements in the HashMap
	      System.out.println(hashMap.get("John")); // Output: 25
	        
	      // Remove an element from the HashMap
	      hashMap.remove("Jim");
	        
	      // Check if an element is present in the HashMap
	      System.out.println(hashMap.containsKey("Jim")); // Output: false
	        
	      // Get the size of the HashMap
	      System.out.println(hashMap.size());
	      // Output: 2
	         Iterator. h = hashMap.iterator();
	      
	      
	   }
	

	}


