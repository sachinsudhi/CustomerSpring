package trng.springcore.dao;

import trng.springcore.pojo.Customer;
import trng.springcore.bean.ReportBean;

import java.util.List;
import java.util.Map;

public interface CustomerDao {
	boolean addCustomer(Customer customer);

	boolean deleteCustomer(int customerId);

	boolean updateCustomer(Customer customer);

	Customer loadCustomer(int customerId);

	List<Customer> getCustomers(String zipCode);

	Map<String, Double> getMonthlySales(int year);

	List<ReportBean> getReport(int month);

}
