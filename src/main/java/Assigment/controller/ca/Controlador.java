package Assigment.controller.ca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Assigment.ca.dao.CustomerDAO;
import Assigment.conexion.ca.entity.Customer;



@Controller
@RequestMapping("/customer")
public class Controlador {
	
	
	@RequestMapping("/list")
	public String Customer(Model model) {
		
		
		//Get data of customer from dao
		List<Customer> TheCustomers = customerdao.getCustomers();
		
		//Addcustomer to Model
		
		model.addAttribute("customer",TheCustomers);
		
		return "list-customers";
		
		
	}
	
	@RequestMapping("/showFormAddCustomer")
	public String showFormAddCustomer(Model model) {

		//Bind data with customer
		
		Customer customer =  new Customer();
		
		model.addAttribute("customer",customer);
		

		return "AddCustomer";
		
		
	}
	
	@GetMapping("/InsertCustomer")
	public String InsertCustomer(@ModelAttribute("customer")Customer thecustomer) {

		//Insert client to the database
		customerdao.getCustomers(thecustomer);
		
		
		
		return "redirect:/customer/list";
		
		
	}

	
	@Autowired
	public CustomerDAO customerdao;
	

}
