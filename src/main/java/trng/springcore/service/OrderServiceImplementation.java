package trng.springcore.service;

import trng.springcore.pojo.Orders;
import trng.springcore.dao.OrderDao;
import trng.springcore.dao.OrderDaoImplementation;

public class OrderServiceImplementation implements OrderService{
	OrderDao odao;
	public OrderServiceImplementation() {
		odao=new OrderDaoImplementation();
	}
	@Override
	public boolean createOrder(Orders order) {
		return odao.createOrder(order);
	}

	@Override
	public boolean deleteOrder(Long orderId) {
		return odao.deleteOrder(orderId);
	}

	@Override
	public boolean updateOrder(Orders order) {
		return odao.updateOrder(order);
	}

	@Override
	public Orders getOrder(Orders order) {
		return odao.getOrder(order);
	}
	
}