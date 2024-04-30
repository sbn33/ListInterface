package CollectionSort;

import java.util.Comparator;

public class SortingDataOnNameBasis implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		//int s=(o1.name).compareTo(o2.name);//ascending order
		int s=(o2.name).compareTo(o1.name); //ascending order
		return s;
	
		

	}

}
