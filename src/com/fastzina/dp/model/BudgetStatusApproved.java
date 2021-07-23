package com.fastzina.dp.model;

import java.math.BigDecimal;

public class BudgetStatusApproved extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.02"));
	}

	@Override
	public void approve(Budget budget) throws DomainException {
		budget.setStatus(new BudgetStatusFinalized());
	}
}
