package HashCodeEx;

public class HashCodeEx1 {

	public static void main(String[] args) {
String str="Rajani";
System.out.println(str.hashCode());

String str2="Rajani";
System.out.println(str2.hashCode());
System.out.println(str.equals(str2));

System.out.println("---------");



String str3="Sabin";
System.out.println(str2.hashCode());

String str4="Sabin";
System.out.println(str4.hashCode());
System.out.println(str3.equals(str4));



	}

}
