package trng.springcore.dao;

import trng.springcore.pojo.Orders;

public interface OrderDao {
	boolean createOrder(Orders order);

	boolean deleteOrder(Long orderId);

	boolean updateOrder(Orders order);

	Orders getOrder(Orders order);
}
