package com.fastzina.dp.model;

import java.math.BigDecimal;

public class Budget {
	private BigDecimal value;
	private Integer quantityOfItens;
	private BudgetStatus status;
	
	public Budget(BigDecimal value, Integer quantityOfItens) {
		this.value = value;
		this.quantityOfItens = quantityOfItens;
		this.status = new BudgetStatusInAnalysis();
	}
	
	public void applyExtraDiscount() {
		BigDecimal valorDescontoExtra = this.status.calculateExtraDiscount(this);
		this.value = this.value.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.status.approve(this);
	}
	
	public void reprovar() {
		this.status.reprove(this);
	}
	
	public void finalizar() {
		this.status.finalize(this);
	}
	
	public BigDecimal getValue() {
		return value;
	}

	public Integer getQuantityOfItens() {
		return quantityOfItens;
	}

	public BudgetStatus getStatus() {
		return status;
	}

	public void setStatus(BudgetStatus status) {
		this.status = status;
	}
}
