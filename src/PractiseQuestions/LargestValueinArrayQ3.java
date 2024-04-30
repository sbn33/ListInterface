package PractiseQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//Question:03 - How To Find The Largest Value From The Given Array?
public class LargestValueinArrayQ3 {

	public static void main(String[] args) {
		int[] numbers = {5, 10, 15, 25, 58, 62};
		int largest = findLargest(numbers);
        System.out.println("The largest value in the numbers is: " + largest);
    }
    
    public static int findLargest(int[] numbers ) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
        
    }
}
        

