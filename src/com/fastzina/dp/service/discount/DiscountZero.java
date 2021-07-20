package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class DiscountZero extends Discount {

	public DiscountZero() {
		super(null);
	}

	@Override
	public BigDecimal calculate(Budget budget) {
		return BigDecimal.ZERO;
	}

}
