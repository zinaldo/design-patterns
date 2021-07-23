package com.fastzina.dp.model;

import java.math.BigDecimal;

public class BudgetStatusFinalized extends BudgetStatus {

	@Override
	public BigDecimal calculateExtraDiscount(Budget budget) {
		throw new DomainException("Finalized Budget can't have extra discount!");
	}
}
