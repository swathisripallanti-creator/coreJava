package com.blcelc;

public class shoppingCart {

	public static void main(String[] args) {
      product obj1=new product();
      product obj2=new product();
      obj1.setId(12);
      obj1.setName("swathi");
      obj1.setPrice(12.4);
      obj1.setQuantity(45);
      obj2.setId(43);
      obj2.setName("subbu");
      obj2.setPrice(43.2);
      obj2.setQuantity(56);
      
      System.out.println(obj1.getId());
      System.out.println(obj1.getName());
      System.out.println(obj1.getPrice());
      System.out.println(obj1.getQuantity());
      System.out.println("-----------");
      System.out.println(obj2.getId());
      System.out.println(obj2.getName());
      System.out.println(obj2.getPrice());
      System.out.println(obj2.getQuantity());
      
      
      
      
      
      
	}

}
