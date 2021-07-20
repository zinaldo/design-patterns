package com.fastzina.dp.service.tax;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class ICMSTax implements Tax {
	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}
}
