package it.unibo.oop.lab05.ex1;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */
    	final Set<String> set = new TreeSet<>();
    	/*
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         **/
    	for(int i=1;i<=20;i++) {
    		//popolo il set
    		set.add(Integer.toString(i));
    	}
    	/*
         * 3) Prints its content
         * 
         * **/
    	System.out.println(set);
    	/*
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * **/
    	Iterator<String> iteratore = set.iterator();
    	while(iteratore.hasNext()) {
    		if( Integer.parseInt(iteratore.next())%3==0) {
     			iteratore.remove();
     		}
    	}
    	/*
         5) Prints the content of the Set using a for-each costruct */
         for(final String str: set) {
    		System.out.print(str+"-");
    	}
         /*
         * 6) Verifies if all the numbers left in the set are even
         */
         int numeroDispariTrovato = 0;
         for(final String str: set) {
     		if( Integer.parseInt(str)%2!=0) {
     			numeroDispariTrovato++;
     		}
     	 }
         if(numeroDispariTrovato>0) System.out.println("Non sono tutti pari"); else System.out.println("Sono tutti pari");
         
    }
}
