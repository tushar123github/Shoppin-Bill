package com.velocity.com;

public class Product {
	// Properties
	private String id;
	private String pName;
	private int qty;
	private double price;
	private double totalPrice;

 
Product(String id,String pname,int qty,double price,double totalPrice)
{
	this.id =id;
	this.pName = pname;
	this.qty = qty;
	this.price = price;
	this.totalPrice = totalPrice;
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getpName() {
	return pName;
}


public void setpName(String pName) {
	this.pName = pName;
}


public int getQty() {
	return qty;
}


public void setQty(int qty) {
	this.qty = qty;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public double getTotalPrice() {
	return totalPrice;
}

// display format
public static void displayFormat() {
	System.out.println("-----------------------------------------------------------------------------------------------------------");
    System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n"); 
    System.out.format("-----------------------------------------------------------------------------\n");
}

// display
public void display() {
    System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pName, qty, price, totalPrice);  

}
    
}

