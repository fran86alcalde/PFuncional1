import java.util.List;

public class Product {

	public String name;
	public Double price;
	
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	List<Product>carritoCompra=List.of(
			new Product("pantalon",15.0),
			new Product("chaleco",10.0)
			);
			
	Double total = carritoCompra
			.stream()
			.mapToDouble(n->n.getPrice())
			.sum();
	
	System.out.println(total);	
}
