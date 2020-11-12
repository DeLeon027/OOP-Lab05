package it.unibo.oop.lab05.ex4;


import java.util.*;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WharehouseImpl;

public class OrderedWarehouse extends WharehouseImpl {
	
	@Override
	public SortedSet<Product> allProducts() {
		SortedSet<Product> orderedSet = new TreeSet<>();
		
		for(Product p: allProducts) {
			orderedSet.add(p);
		}
		
		return orderedSet;
	}
	
}