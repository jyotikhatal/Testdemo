package com.csi.jdkfeatures;

import java.util.StringJoiner;

public class String_joiner {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("#");//to pass the special character like ; * # , :
		sj.add("TCS");
		sj.add("INFOSYS");
		sj.add("WIPRO");
		System.out.println(sj);

	}

}
