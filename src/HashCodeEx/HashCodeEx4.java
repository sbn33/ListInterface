package HashCodeEx;

import java.util.Objects;

public class HashCodeEx4 {

	public static void main(String[] args) {
		Mobile mb=new Mobile(1500,"Nokia","White");
		Mobile mb2=new Mobile(1500,"Apple","Blue");
		Mobile mb3=new Mobile(1500,"Nokia","White");
		
		System.out.println(mb.hashCode()); //after overriding hashCode()--->
		System.out.println(mb3.hashCode()); //after overriding hashCode()--->
		System.out.println(mb.equals(mb3)); //False-->after overriding equals method -->result will be true
		
//overridden hasCode()+equals()
           
	}

}
class Mobile{
	int price;
	String name;
	String color;
	
	@Override
	public int hashCode() {                       //for making true (mb.equals(mb3))
		return Objects.hash(color, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && price == other.price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	
	
}