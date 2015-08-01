package com.mohit.ds.Recursion;

public class TailRecursion {

	public static void main(String[] args) {
		int x = 3;
		compute(x);

	}

	private static void compute(int n) {

		if (n > 0) {
			compute(n - 1);
			System.out.println(n);
		}

	}

}
