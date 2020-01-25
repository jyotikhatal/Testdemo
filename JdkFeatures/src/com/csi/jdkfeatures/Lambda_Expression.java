package com.csi.jdkfeatures;

interface ProuctDetails {
	void get();

}

public class Lambda_Expression {

	public static void main(String[] args) {
		ProuctDetails pd = () -> {
			System.out.println("HELLO");// lambda expression
		};
		pd.get();

	}

}
