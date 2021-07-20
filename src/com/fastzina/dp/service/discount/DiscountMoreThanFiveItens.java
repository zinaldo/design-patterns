package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class DiscountMoreThanFiveItens extends Discount {

	public DiscountMoreThanFiveItens(Discount next) {
		super(next);
	}

	@Override
	public BigDecimal calculate(Budget budget) {
		if(budget.getQuantityOfItens() > 5) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}
		return next.calculate(budget);
	}

}
