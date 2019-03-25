package dt13.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dt13.model.Product;
import dt13.dao.CartDao;
import dt13.dao.ProductDao;
import dt13.model.Cart;

@Controller
public class CartController {
	@Autowired
	CartDao daoImpl;
	
	@Autowired
	ProductDao pdao;
	

	@GetMapping("/Cart")
	public ModelAndView cart(@RequestParam("proId") int ProductId, HttpSession session)
	{
		System.out.println("before adding to cart");
		
		
		//Product p=daoImpl.getProduct(ProductId);	
		Product p= pdao.getProduct(ProductId);
		Cart c=new Cart();
		String username=(String) session.getAttribute("uname");
		daoImpl.viewCart(username);
		String loginUser=(String)session.getAttribute("uname");
		c.setCartId((int)(Math.random()*10000));
		c.setProductName(p.getProductName());
		c.setProductPrice(p.getProductPrice());
		c.setTotalPrice(1*p.getProductPrice());
		c.setQuantity(1);
		c.setCartUser(loginUser);
		daoImpl.AddToCart(c);
		ModelAndView mv=new ModelAndView("Cart");
		
       return mv;
		}
	
	@RequestMapping("/cartlist")
	   public ModelAndView getProducts()
	   {
	       List<Cart> cartList=daoImpl.getProducts();
	       ModelAndView mv=new ModelAndView("ViewCart","pro",cartList);             //get data from database and hold it in list
	   	    // mv.addObject(cartList);
	       System.out.println("cartList");
	       return mv;
}
}
