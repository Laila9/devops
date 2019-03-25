package dt13.dao;

import java.util.List;

import dt13.model.Cart;


public interface CartDao {

	void AddToCart(Cart c);
	List<Cart> getProducts();
	Cart getProducts(int ProductId);
	List viewCart(String username);

	
	
	
}
