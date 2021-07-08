package com.fastzina.dp.service;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class ISSTax implements Tax {
	public BigDecimal calculate(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.06"));
	}
}
