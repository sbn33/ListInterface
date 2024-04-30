package PractiseQwestions;
//Q-2- Java Program to Find the Largest Element in an Array
public class Test2 {

	public static void main(String[] args) {

			int[] numbers = {1, 2, 3, 5, 8, 12};
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


