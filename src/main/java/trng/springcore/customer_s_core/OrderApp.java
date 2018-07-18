package trng.springcore.customer_s_core;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import trng.springcore.pojo.Customer;
import trng.springcore.pojo.Orders;
import trng.springcore.service.CustomerService;
import trng.springcore.service.OrderService;
import trng.springcore.utils.HibernateUtils;

public class OrderApp {
	
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(trng.springcore.config.AppConfig.class);
	OrderService oserv = applicationContext.getBean(OrderService.class);
	CustomerService cserv = applicationContext.getBean(CustomerService.class);
	static Scanner scanner;

	public OrderApp() {
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		OrderApp capp = new OrderApp();
		while (true) {
			HibernateUtils.displayOrderMenu();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				capp.insertOrder();
				break;

			case 2:
				capp.removeOrder();
				break;
			case 3:
				capp.changeOrder();
				break;
			case 4:
				capp.loadOrder();
				break;

			default:
				scanner.close();
				System.exit(0);
				break;

			}
		}
	}

	public void insertOrder() {
		System.out.println("\nEnter Customer order details:\n");
		System.out.println("\nEnter order message:\n");
		String message = scanner.next();
		Date d = Calendar.getInstance().getTime();
		Customer c=new Customer();
		cserv.addCustomer(c);
		Orders ord = new Orders(c.getCustomerID(),d, d, d, message);
		boolean result=oserv.createOrder(ord);	
		if(result)
			   System.out.println("Success");
		   else
			   System.out.println("Failure");
	}

	public void removeOrder() {
		System.out.println("\nEnter order Id of the order to be deleted:\n");
		Long oid = (long) scanner.nextInt();
		boolean result=oserv.deleteOrder(oid);
		if(result)
			   System.out.println("Success");
		   else
			   System.out.println("Failure");
	}

	public void changeOrder() {
		System.out.println("\nEnter Customer order details:\n");
		System.out.println("\nEnter customer ID:\n");
		int cid = scanner.nextInt();
		System.out.println("\nEnter order ID:\n");
		int oid = scanner.nextInt();
		System.out.println("\nEnter order message:\n");
		String message = scanner.next();
		Date d = Calendar.getInstance().getTime();
		Orders ord = new Orders(cid, d, d, d, message);
		ord.setOrderID(oid);
		boolean result=oserv.updateOrder(ord);
	   if(result)
		   System.out.println("Success");
	   else
		   System.out.println("Failure");
	}

	public void loadOrder() {
		System.out.println("\nEnter order Id of the order to be loaded:\n");
		int oid = scanner.nextInt();
		Orders ord=new Orders(oid);
		Orders o=oserv.getOrder(ord);
		System.out.println("Order message: "+o.getCustomMessage());
	}
}