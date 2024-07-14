package bheem;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		 
		  TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Add elements to the TreeMap
	        treeMap.put("Apple" ,2);
	        treeMap.put("Banana",90);
	        treeMap.put("Orange",78);
	        treeMap.put("Grapes",56);
	        treeMap.put("Mango",45);

	        // Get the iterator for the TreeMap
	        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();

	        // Use hasNext() and next() methods to iterate through the TreeMap
	        while (iterator.hasNext()) {
	            Map.Entry<String, Integer> entry = iterator.next();
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println(key + " -> " + value);

	}

}}
