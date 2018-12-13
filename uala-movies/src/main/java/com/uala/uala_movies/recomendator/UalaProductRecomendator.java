package com.uala.uala_movies.recomendator;

import java.util.ArrayList;
import java.util.List;

import com.uala.uala_movies.model.products.Product;

public class UalaProductRecomendator {

	private static UalaProductRecomendator INSTANCE = null;
	private List<Product> products;
	
	private UalaProductRecomendator() {
		products = new ArrayList<Product>();
		// obtener los productos y agregarlos a la lista
	}
	
	public static UalaProductRecomendator getInstance() {
		 if (INSTANCE == null) {
	            synchronized(UalaProductRecomendator.class) {
	                if (INSTANCE == null) { 
	                    INSTANCE = new UalaProductRecomendator();
	                }
	            }
		 }
		 return INSTANCE;	
    }
	
	public Product recommendProduct() {
	
		// Seteo la 1era de la lista en caso de que no encuentre ningun producto interesante.
		Product recommendation = products.get(0);
		
		for (Product product : products) {
			if(product.isItInteresting()) {
				return product;
			}
		}
		
		return recommendation;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
}
