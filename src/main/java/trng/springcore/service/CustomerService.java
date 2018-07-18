package trng.springcore.service;

import java.util.List;
import java.util.Map;

import trng.springcore.pojo.Customer;
import trng.springcore.bean.ReportBean;

public interface CustomerService {
	boolean addCustomer(Customer customer);

	boolean deleteCustomer(int customerId);

	boolean updateCustomer(Customer customer);

	Customer loadCustomer(int customerId);

	List<Customer> getCustomers(String zipCode); 

	Map<String, Double> getMonthlySales(int year);

	List<ReportBean> getReport(int month);

}
