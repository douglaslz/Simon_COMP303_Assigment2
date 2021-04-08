package Assigment.ca.dao;

import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Assigment.conexion.ca.entity.Customer;


@Repository
public class CustomerClassDAO implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		
		
		
		//Get the session
		
		Session mysession=sessionFactory.getCurrentSession();
		
		//Create query and execute and return results
		
		List<Customer> result = mysession.createQuery("from Customer", Customer.class).getResultList();
		
		
		return result;
		
	}

	
}
