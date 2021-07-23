package com.fastzina.dp.model;

import java.math.BigDecimal;

public class BudgetStatusReproved extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		throw new DomainException("Reproved Budget can't have extra discount!");
	}

	@Override
	public void approve(Budget budget) throws DomainException {
		budget.setStatus(new BudgetStatusFinalized());
	}
}
