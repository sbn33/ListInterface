package PractiseQwestions;

//Q-6- Java Program to Show Use of Static and Non-static Methods.
public class TestQ6 {

		//static method
	public static int sum(int a, int b) {
		return a + b;    // returning the sum
		
	}

	
public static void main(String[]args) {
	int n = 3, m = 6;
	
	//calling the static method of above class // storing sum in integer variable
	
	int s = TestQ6.sum(n, m);
	
	//print and display the sum
	
	System.out.println("sum is ="+ s);
}
}

