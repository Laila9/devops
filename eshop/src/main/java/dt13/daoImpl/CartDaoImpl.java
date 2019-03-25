package dt13.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dt13.dao.CartDao;
import dt13.model.Cart;
import dt13.model.Product;


@Component
public class CartDaoImpl implements CartDao
{

	@Override   
	public void AddToCart(Cart c)
	{
	        System.out.println("testing sessionfactory"+sessionFactory);
	        Session session=sessionFactory.openSession();
	        session.save(c);
	        Transaction t=session.beginTransaction();
	        t.commit();
	        session.close();
	      
	    }
@Autowired
SessionFactory sessionFactory;


@Override
public List<Cart> getProducts() {
    Session session=sessionFactory.openSession();
    Query query = session.createQuery("from Cart");
    List<Cart> cartList= query.list();
    session.close();
    return cartList; 
        
} 

@Override
public List viewCart(String username)
{
Session session=sessionFactory.openSession();
Query query=session.createQuery("from Cart where cartUser = ? ");
query.setString(0, username);
List<Cart> cartList=query.list();
return cartList;
}


@Override
public Cart getProducts(int ProductId) {
    Session session=sessionFactory. openSession();
    System.out.println("data");
    Cart c=new Cart();
    c=session.get(Cart.class,ProductId);
    //session.save(p);
     Transaction transaction=session.beginTransaction();
        
        transaction.commit();
        session.close();
         return c;
}
    }
    




	

	
	

       

	

    