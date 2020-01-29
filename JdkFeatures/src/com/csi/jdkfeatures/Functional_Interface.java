package com.csi.jdkfeatures;
interface ProductDetails1
{
	void set();//abstract method
	static void put()
	{
		System.out.println("*****STATIC_METHOD******");
	}
	default void net()
	{
		System.out.println("******DEFAULT_METHOD*****");
		System.out.println("JYOTI");
	}
}
class ProductConcept implements ProductDetails1
{
	public void set()
	{
		System.out.println("HELLO");
	}
}

public class Functional_Interface {

	public static void main(String[] args) {
		ProductConcept pc = new ProductConcept();
		pc.set();
		ProductDetails1.put();
		//this is static method thats why interface name .method name
		pc.net();

	}

}
