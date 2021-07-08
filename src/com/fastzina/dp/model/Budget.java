package com.fastzina.dp.model;

import java.math.BigDecimal;

public class Budget {
	private BigDecimal value;
	
	public Budget(BigDecimal value) {
		this.value = value;
	}
	
	public BigDecimal getValue() {
		return value;
	}
}
