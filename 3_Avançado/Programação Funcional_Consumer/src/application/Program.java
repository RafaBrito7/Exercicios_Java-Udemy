package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Teclado", 90.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 45.00));
		list.add(new Product("Mouse", 450.00));

		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);

	}

}
