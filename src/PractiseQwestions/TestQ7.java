package PractiseQwestions;

import java.util.Hashtable;
import java.util.Map;

//Java Program to Show Usage of forEach() Method.
public class TestQ7 {

	public static void main(String[] args) {
      Map<String, Integer> table = new Hashtable<>();
      
      table.put("Pen", 10);
      table.put("Book", 500);
      table.put("Mobile", 1000);
      table.put("rent", 2000);
      
      //add 100in each value using forEach()
      
     table.forEach((k, v)-> {
    	  v = v + 100;
    	  table.replace(k, v);
     });
     
     //print new mapping using foeEach()
     table.forEach(
    		 (k, v)-> System.out.println("Key: "+ k + ", Value :"+v));
      

	}

}



