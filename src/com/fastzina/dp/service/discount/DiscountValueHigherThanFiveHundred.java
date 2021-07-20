package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class DiscountValueHigherThanFiveHundred extends Discount {

	public DiscountValueHigherThanFiveHundred(Discount next) {
		super(next);
	}

	@Override
	public BigDecimal applyDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean isDiscountable(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) > 0;
	}

}
