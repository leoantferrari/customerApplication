package ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.model.memo;

import ch.zli.m223.ksh17a.Leo_Ferrrrarrrri.customer_memos.model.customer.Customer;

public interface Memo {
	
	Long getId();
	
	Customer getCustomer();
	
	String getNote();
	
	long getDate();
}