package dt13.dao;

import java.util.List;


import dt13.model.Product;

public interface ProductDao {
	
	
	 List<Product> getProducts();
	
	Product getProduct(int productId);

	void addProduct(Product product);
	 
}
