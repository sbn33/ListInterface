package PractiseQwestions;
//Q-9- Java Program to Show Usage of codePointAt() Method
public class TestQ9 {

	public static void main(String[] args) {
		// create a StringBuffer object 
				StringBuffer str = new StringBuffer(); 

				// add the String to StringBuffer Object 
				str.append("Geeksforgeeks"); 

				// get unicode of char at position 10 
				int unicode = str.codePointAt(10); 

				// print the result 
				System.out.println("Unicode of Character "
								+ "at Position 10 "
								+ "in StringBuffer = "
								+ unicode);

	}

}
