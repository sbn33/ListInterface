package Listinterfacedemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		//add elements in an empty array
al.add(34);
al.add(10);
al.add(78);

//al.add("Rajani");not allowed

System.out.println(al);

List<Character>a12=new ArrayList<>();
a12.add('p');
a12.add('x');
a12.add('r');
a12.add('t');

System.out.println(a12);


	}

}
