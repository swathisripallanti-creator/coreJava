package com.blcelc;

public class product {
    int productId;
    String productName;
    double price;
    int quantity;
    
    public int getId(){
    	return productId;
    }
    public String getName(){
    	return productName;
    }
    public double getPrice(){
    	return price;
    }
    public int getQuantity() {
    	return quantity;
    }
    public void setId(int id) {
    	productId=id;
    }
    public void setName(String name) {
    	productName=name;
    }
    public void setPrice(double pri) {
    	price=pri;
    }
    public void setQuantity(int qua) {
    	quantity=qua;
    }
    
    
	public static void main(String[] args) {

	}
	 
	

}
