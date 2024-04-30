package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String> hm= new LinkedHashMap<>();
		 hm.put(1,  "Sagin"); 
         hm.put(2, "Rajani");
         hm.put(3, "Javed");
         hm.put(4, "Javed"); 
         hm.put(2, "Spriha"); 
         hm.put(null, "Suresh");
         hm.put(5, "Ramesh");
         hm.put(5, null);

System.out.println(hm);                   


}


	}


