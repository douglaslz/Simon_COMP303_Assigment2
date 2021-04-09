package Assigment.ca.dao;

import java.util.List;

import Assigment.conexion.ca.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void getCustomers(Customer thecustomer);

}
