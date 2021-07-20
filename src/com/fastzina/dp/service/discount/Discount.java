package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public abstract class Discount {
	protected Discount next;
	
	public Discount(Discount next) {
		this.next = next;
	}
	
	public abstract BigDecimal calculate(Budget budget);
}
