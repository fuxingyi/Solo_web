package com.solo.test;

public class TestDouble {
	 public static void main(String[] args) {
		Double dd = new Double(0.000000000000000000000000001);
		double ddd = 19999999999999999998.0;
		Float ff = new Float(16777217.0);
		float fff = 199999999998.0f;
		System.out.println(String.valueOf(dd));
		System.out.println(String.valueOf(ddd));
		System.out.println(String.valueOf(ff));
		System.out.println(String.valueOf(fff));
		System.out.println(new Double(0.01));
	}
}
   