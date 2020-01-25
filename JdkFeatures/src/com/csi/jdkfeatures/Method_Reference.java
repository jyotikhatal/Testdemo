package com.csi.jdkfeatures;

interface ProductConcept1{
	void get();
	
}
public class Method_Reference {

	static void push()
	{
		System.out.println("Hey");
		
	}
	void net()
	{
		System.out.println("Class method");
	}
	public static void main(String[] args) {
		Method_Reference m = new Method_Reference();
		m.net();
		ProductConcept1 pc = Method_Reference::push;
		pc.get();
		

	}

}

