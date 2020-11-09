package ProductImpl;

import it.unibo.oop.lab05.ex3.Product;

public class ProductImpl implements Product {

	private String name;
	private double quantity;

	public ProductImpl(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}
	
	@Override
	public String toString() {
		return "ProductImpl [name=" + name + ", quantity=" + quantity + "]";
	}
	
	/*
	 * @Override public boolean equals(Object o) {
	 * 
	 * return false;
	 * 
	 * }
	 */
}
