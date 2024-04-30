package CollectionSort;

public class Mobile implements Comparable<Mobile> {
	int price;
	String name;
	String color;
	

	public Mobile() {
		super();
	
	}


	public Mobile(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	public int getPrice() {
		return price; 
	}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return"Mobile[price="+ price + ",name=" +name+", color=" + color +"]";
}
	@Override
	public int compareTo(Mobile o) {
      //int p=this.price-o.price; //ascending order
	int p=o.price-this.price; //descending order
		return p;
	}
}

	


