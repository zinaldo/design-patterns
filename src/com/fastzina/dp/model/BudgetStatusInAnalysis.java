package com.fastzina.dp.model;

import java.math.BigDecimal;

public class BudgetStatusInAnalysis extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void approve(Budget budget) throws DomainException {
		budget.setStatus(new BudgetStatusApproved());
	}
	
	@Override
	public void reprove(Budget budget) throws DomainException {
		budget.setStatus(new BudgetStatusReproved());
	}
}
