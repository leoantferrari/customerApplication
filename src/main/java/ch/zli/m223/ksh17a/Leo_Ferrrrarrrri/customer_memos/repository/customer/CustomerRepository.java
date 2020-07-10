package ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.repository.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.model.customer.Customer;
import ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.model.customer.CustomerImpl;

public interface CustomerRepository extends JpaRepository<CustomerImpl, Long> {

	public default List<Customer> findAllCustomers() {
		
		return new ArrayList<Customer>(findAll());
	}
	
	public Customer findCustomerByName(String name);
	
	public default Customer createCustomer(String name) {
		
		return save(new CustomerImpl(name));
	}
}