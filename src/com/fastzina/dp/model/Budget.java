package com.fastzina.dp.model;

import java.math.BigDecimal;

public class Budget {
	private BigDecimal value;
	private Integer quantityOfItens;
	
	public Budget(BigDecimal value, Integer quantityOfItens) {
		this.value = value;
		this.quantityOfItens = quantityOfItens;
	}
	
	public BigDecimal getValue() {
		return value;
	}

	public Integer getQuantityOfItens() {
		return quantityOfItens;
	}
}
