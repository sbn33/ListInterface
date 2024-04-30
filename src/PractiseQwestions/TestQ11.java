package PractiseQwestions;
//Q-11- Java Program to Show Encapsulation in Class.
public class TestQ11 {

	
		//Encapsulating the name and age
		//only approachable and used using
		//methods defined
		
		private String name;
		private int age;

		public String getName() { return name; }

		public void setName(String name) { this.name = name; }

		public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }
	

//main function
	
public static void main(String[] args)
{
	// person object created
	TestQ11 person = new TestQ11();
	person.setName("John");
	person.setAge(30);

	// Using methods to get the values from the
	// variables
	System.out.println("Name: " + person.getName());
	System.out.println("Age: " + person.getAge());
}
}

