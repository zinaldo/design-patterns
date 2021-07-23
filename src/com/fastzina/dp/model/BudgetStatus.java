package com.fastzina.dp.model;

import java.math.BigDecimal;

public abstract class BudgetStatus {
	
	public abstract BigDecimal calculateExtraDiscount(Budget budget);
	
	public void approve(Budget budget) throws DomainException {
		throw new DomainException("Budget can't be approved!");
	}
	
	public void reprove(Budget budget) throws DomainException {
		throw new DomainException("Budget can't be approved!");
	}
	
	public void finalize(Budget budget) throws DomainException {
		throw new DomainException("Budget can't be finalized!");
	}
}
