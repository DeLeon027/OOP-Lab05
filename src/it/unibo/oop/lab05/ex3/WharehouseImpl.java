package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.HashSet;

public class WharehouseImpl implements Warehouse {
	
	final Set<String> allNames = new HashSet<>();
	final Set<Product> allProducts = new HashSet<>();
	

	@Override
	public void addProduct(Product p) {
		if(!containsProduct(p)) {
			this.allProducts.add(p);
		}
	}

	@Override
	public Set<String> allNames() {
	for(Product p : allProducts) {
		allNames.add(p.getName());
	}
		return allNames;
	}

	@Override
	public Set<Product> allProducts() {
		return new HashSet<>(allProducts);
	}

	@Override
	public boolean containsProduct(Product p) {
		for(Product daCercare : allProducts) {
			if(daCercare.getName().equals(p.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double getQuantity(String name) {
		for(Product daCercare : allProducts) {
			if(daCercare.getName().equals(name)) {
				return daCercare.getQuantity();
			}
		}
		return 0;
	}

}
