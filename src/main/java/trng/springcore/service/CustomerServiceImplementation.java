package trng.springcore.service;

import java.util.List;
import java.util.Map;

import trng.springcore.pojo.Customer;
import trng.springcore.bean.ReportBean;
import trng.springcore.dao.CustomerDao;
import trng.springcore.dao.CustomerDaoImplementation;

public class CustomerServiceImplementation implements CustomerService {
	CustomerDao cdao;
	public CustomerServiceImplementation() {
		cdao= new CustomerDaoImplementation();
	}

	@Override
	public boolean addCustomer(Customer customer) {
		return cdao.addCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return cdao.deleteCustomer(customerId);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		return cdao.updateCustomer(customer);
	}

	@Override
	public Customer loadCustomer(int customerId) {
		return cdao.loadCustomer(customerId);
	}

	@Override
	public List<Customer> getCustomers(String zipCode) {
		return cdao.getCustomers(zipCode);
	}

	@Override
	public Map<String, Double> getMonthlySales(int year) {
		return cdao.getMonthlySales(year);
	}

	@Override
	public List<ReportBean> getReport(int month) {
		return cdao.getReport(month);
	}

}