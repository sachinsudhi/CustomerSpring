package trng.springcore.service;

import trng.springcore.pojo.Orders;

public interface OrderService {
	boolean createOrder(Orders order);

	boolean deleteOrder(Long orderId);

	boolean updateOrder(Orders order);

	Orders getOrder(Orders order);
}
