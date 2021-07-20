package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class DiscountMoreThanFiveItens extends Discount {

	public DiscountMoreThanFiveItens(Discount next) {
		super(next);
	}

	@Override
	public BigDecimal applyDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean isDiscountable(Budget budget) {
		return budget.getQuantityOfItens() > 5;
	}

}
