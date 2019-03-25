package dt13.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import dt13.dao.ProductDao;
import dt13.model.Product;
@Component
public  class ProductDaoImpl implements ProductDao {
@Autowired
SessionFactory sessionFactory;

@Override
public void addProduct(Product product)
{
	System.out.println("testing sessionfactory"+sessionFactory);
	Session session=sessionFactory.openSession();
	
	System.out.println("this is product"+product);
	session.save(product);
	Transaction t=session.beginTransaction();
	t.commit();
	session.close();
	
}
@Override
public List<Product> getProducts() 
{

Session session=sessionFactory.openSession();
Query query = session.createQuery("from Product");
List<Product> proList = query.list(); 
session.close();
return proList;
}	

@Override
public Product getProduct(int ProductId) 
{      Session session=sessionFactory.openSession();

	Product p=session.get(Product.class,ProductId);
	session.close();
			return p;
}
}