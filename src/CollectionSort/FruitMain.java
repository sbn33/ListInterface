package CollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitMain {

//1st commit
	//2nd commit
	public static void main(String[] args) {
		List<Mobile> listOfFruits=new ArrayList<>();
		
		Mobile fr=new Mobile(120, "Apple","White");
		Mobile fr2=new Mobile(100, "Nokia","Black");
		Mobile fr3=new Mobile(60, "Moto","Blue");
		Mobile fr4=new Mobile(80, "Samsung","White");
		
		listOfFruits.add(fr);
		listOfFruits.add(fr2);
		listOfFruits.add(fr3);
		listOfFruits.add(fr4);
		
		
		System.out.println(listOfFruits);
		System.out.println("---sort the data----");
		
		Collections.sort(listOfFruits);
		System.out.println(listOfFruits);
		System.out.println("----sort the data on name basis----");
		
		Collections.sort(listOfFruits,new SortingDataOnNameBasis());
		System.out.println(listOfFruits);
		
		

	}

}
