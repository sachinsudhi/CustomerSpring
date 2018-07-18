package trng.springcore.bean;

import java.io.Serializable;

import lombok.Data;


@Data
public class ReportBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int customerID;
	String firstName;
	int quantity;
	double price;
	double sales;
	public ReportBean(int customerID, String firstName, int quantity, double price) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.sales=quantity*price;
	}
	
	
}
