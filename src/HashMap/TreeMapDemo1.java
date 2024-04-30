package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String> hm= new TreeMap<>();
		 hm.put(1,  "Sagin"); 
        hm.put(2, "Rajani");
        hm.put(3, "Javed");
        hm.put(4, "Javed"); 
        hm.put(2, "Spriha"); 
        hm.put(5, "Ramesh");
        hm.put(5, null);      //null--> we can pass only in value field

              //hm.put(null, "Suresh"); duplicacy is not allowed in TreeMap
        
        
System.out.println(hm);

	}

}
