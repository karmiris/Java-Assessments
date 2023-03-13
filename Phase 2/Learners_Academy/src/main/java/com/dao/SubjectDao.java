package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Product;
import com.resource.DbResource;

  public class SubjectDao {
    SessionFactory sf;
	  public SubjectDao() {			
		  sf = DbResource.getSessionFactory();
	  }
  }

  public String storeSubject(Subject subject) {
		try {
		  Session session = sf.openSession();
		  Transaction tran = session.getTransaction();
		  tran.begin();
			  session.save(subject);
		  tran.commit();
		  return 'OK';
		} 
    catch(Exception e) {
			return e;
		}
	}
    
	public String deleteSubject(int id) {
		try {
      Session session = sf.openSession();
		  Transaction tran = session.getTransaction();
		  Subject s = session.get(Subject.class, id);
		  if (s == null) {
			  return 'No data found to delete';
		  }
      else {
			  tran.begin();
				  session.delete(s);
			  tran.commit();
			  return 'OK';
      }
		}
    catch(Exception e) {
		  return e;
		}
	}
  
	public Subject findSubjectById(int id) {
		Session session = sf.openSession();
		Subject s = session.get(Subject.class, id);
		return s;	
	}

	public Subject findSubjectByName(String name) {
		Session session = sf.openSession();
		Subject s = session.get(Subject.class, name);
		return s;	
	}
	
	public List<Product> findProductAllProduct() {
		Session session = sf.openSession();
		TypedQuery<Product> tq = session.createQuery("from Product");
		List<Product> listOfProduct = tq.getResultList();
		return listOfProduct;
	}

}
