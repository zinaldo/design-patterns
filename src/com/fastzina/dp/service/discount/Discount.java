package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public abstract class Discount {
	protected Discount next;
	
	public Discount(Discount next) {
		this.next = next;
	}
	
	public BigDecimal calculate(Budget budget) {
		if(isDiscountable(budget)) {
			return applyDiscount(budget);
		}
		
		return next.calculate(budget);
	}
	
	public abstract BigDecimal applyDiscount(Budget budget);
	public abstract boolean isDiscountable(Budget budget);
}
