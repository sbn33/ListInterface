package PractiseQuestions;

import java.util.ArrayList;
import java.util.List;

//Question:04 - Create a generic ArrayList with few element , access it and print size of the list.
public class ArraylistQ4 {

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
