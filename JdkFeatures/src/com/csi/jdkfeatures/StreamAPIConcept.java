package com.csi.jdkfeatures;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Product {
	int prodId;
	String prodName;
	double prodPrice;

	public Product(int prodId, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
}

public class StreamAPIConcept {

	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(11, "MI", 25000.10));
		productList.add(new Product(22, "LENOVO", 14000.25));
		productList.add(new Product(33, "APPLE", 44000.58));
		productList.stream().filter(Product -> Product.prodPrice == 14000.25).forEach(System.out::println);
		//stream API using for each method
		long productCount = productList.stream().collect(Collectors.counting());
		
		{
			System.out.println("Product Count : " +productCount);
		}

	}

}
