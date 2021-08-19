package com.codechallenges.ordersanalyzer;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersAnalyzer {

	static class Order {
		int orderId;
		LocalDateTime creationDate;
		List<OrderLine> orderLines;
	}

	static class OrderLine {
		int productId;
		String name;
		int quantity;
		BigDecimal unitPrice;
	}

	public Map<DayOfWeek, Integer> averageDailySales(List<Order> orders) {

		// TODO: Implement

		return new HashMap<>();
	}

}
