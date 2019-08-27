package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 	根据订单Id获取订单
	 */
	Order getOrder(String orderId);
	/**
	 * 	保存订单信息
	 */
	void addOrder(Order order);
}

