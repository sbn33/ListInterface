package PractiseQwestions;

import java.util.ArrayList;
import java.util.List;

//Q-1- Java Program to Search an Element in an Array
public class TestQ1 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(15);

		System.out.println("---Elements in the list-- ");
		for (int x = 0; x < al.size(); x++) {
			System.out.println(al.get(x));
		}

	}
}
