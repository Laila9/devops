package dt13.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dt13.dao.UserDao;
import dt13.model.UserDetails;


@Component
public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addUserDetails(UserDetails userdetails) 
		{
			System.out.println("testing sessionfactory"+sessionFactory);
			Session session=sessionFactory.openSession();
			session.save(userdetails);
			Transaction t=session.beginTransaction();
			t.commit();
		}
			
} 
