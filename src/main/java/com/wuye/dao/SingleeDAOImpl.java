package com.wuye.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.wuye.po.Single;

public class SingleeDAOImpl implements SingleeDAO {

	private SessionFactory sessionFactory;
	
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void add(Single ss) {
		// TODO Auto-generated method stub
		  Session session=null;
		
		  try {
			session=this.sessionFactory.openSession();
		
			
			session.save(ss);
			
			
			
			
			  
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		  
		  
	}

	@Override
	public void del(Single ss) {
		// TODO Auto-generated method stub
		Session session=null;
    	
    	try {
    		session=this.sessionFactory.openSession();
    	
    		
        Single  s =(Single)session.get(Single.class, ss.getId());
    		
             session.delete(s);
    		
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}

	@Override
	public void update(Single ss) {
		// TODO Auto-generated method stub
		Session session=null;
    Transaction tran=null;
    	try {
    		session=this.sessionFactory.openSession();
    		tran =session.beginTransaction();
    		
    		Single  s =(Single)session.get(Single.class, ss.getId());

    		s.setAddress(ss.getAddress());
    		s.setEmail(ss.getEmail());
    		s.setId(ss.getId());
    		s.setName(ss.getName());
    		session.update(s);
          tran.commit();
		
		} catch (Exception e) {
			// TODO: handle exception
			tran.rollback();
			e.printStackTrace();
		}
    	
	}

	@Override
	public List<Single> query() {
		// TODO Auto-generated method stub
	
	       List<Single> list=null;
	    	try {
	    Session		session=this.sessionFactory.openSession();
	    	
	    	    list=session.createQuery("from Single").list();

				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());	
				e.printStackTrace();
			}
			return list;
	    	
	}



	@Override
	public void del(int a) {
		// TODO Auto-generated method stub
		
	Session session=null;
	Transaction tran=null;
    	try {
    		session=this.sessionFactory.openSession();
   tran=	session.beginTransaction();
    		
    		Single s= (Single)session.get(Single.class, a);
    		
             session.delete(s);
    	tran.commit();	
			
		} catch (Exception e) {
			// TODO: handle exception
		tran.rollback();
			e.printStackTrace();
		}
		
	}

	

}
