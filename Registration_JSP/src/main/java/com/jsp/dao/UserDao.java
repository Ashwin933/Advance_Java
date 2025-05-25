package com.jsp.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.jsp.model.User;

public class UserDao {
	public void saveUser(User user) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
		}
	}
	
	public List<User> getAllUsers(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("from User",User.class).list();		
		}
	}
	
	public User getUserById(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(User.class,id);
		}
	}
	
	public void deleteUser(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			User user = session.get(User.class,id);
			if(user!=null) session.delete(user);
			tx.commit();
		}
	}
}
