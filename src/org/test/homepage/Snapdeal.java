package org.test.homepage;

public class Snapdeal{
public final void mobiles() {
	System.out.println("Redmi");
}
public static void main(String[] args) {
	//Same package
	Snapdeal s = new Snapdeal();
	s.mobiles();
	Flipkart.shoes();
}
}
