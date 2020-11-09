package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

	private UseSetWithOrder() {
	}

	/**
	 * @param args ignored
	 */
	public static void main(final String[] args) {
		/*
		 * Write a program which:
		 * 
		 * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define a new
		 * Comparator in a separate class.
		 * 
		 * 2) Inserts in the set a 100 strings containing randomly generated numbers
		 * (use Math.random())
		 * 
		 * 3) Prints the set, which must be ordered
		 */

		final TreeSet<String> set = new TreeSet<>(new ComparatorOfString());

		for (int i = 0; i < 100; i++) {
			set.add(Double.toString(Math.random()*100));
		}
		System.out.println(set);
	}
}
