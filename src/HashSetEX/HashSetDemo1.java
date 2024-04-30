package HashSetEX;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		//create an empty HashSet
Set<Integer> rc=new HashSet<>();
   rc.add(10);
   rc.add(15);
   rc.add(25);
   rc.add(2);
   
   System.out.println(rc);

//empty LinkedHashSet
Set<String> ss=new LinkedHashSet<>();
          ss.add("name");
          ss.add("color");
          ss.add("type");
          ss.add("how");
          
          System.out.println(ss);

//empty TreeSet
Set<Character> ts=new TreeSet<>();
          ts.add('m');
          ts.add('m'); //duplicate is not allowed
          ts.add('d');
          ts.add('f');
          
          System.out.println(ts);

	}

}
