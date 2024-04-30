package Listinterfacedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		
		al.add(34);
		al.add(10);
		al.add(10);
		al.add(45);
		al.add(78);
		al.add(76);
		
		System.out.println(al);
		
		//iterate these data using classical for loop
		
		System.out.println("---iterate these date using classical for loop---");
		;
		
		for (int x=0;x<al.size();x++) {
			System.out.println(al.get(x));// returns the elements
			
			}
		//iterate these data using foreach loop
		System.out.println("---iterate these data using forEach loop--");
		for (Integer tempa:al) {
			System.out.println(tempa);
			
		}
		//iterate these data using Iterator
		System.out.println("---iterate these data using iterator---");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			//hasNext()-->Returns true if the iteration has more elements
			System.out.println(itr.next());//next()-->Returns the next element in the iteration. 
			
			//sort data
			System.out.println("---sort the data elements--");
			Collections.sort(al);
			System.out.println(al);
			
			//search data
			
			System.out.println("---search the data elements--");
			System.out.println(al.contains(34));//true
			System.out.println(al.contains(11));//false
		}
		
		
	}


}
