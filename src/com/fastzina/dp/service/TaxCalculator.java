package com.fastzina.dp.service;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;
import com.fastzina.dp.model.TaxType;

public class TaxCalculator {
	public BigDecimal calculate(Budget budget, TaxType taxType) {
		switch (taxType) {
		case ICMS:
			return budget.getValue().multiply(new BigDecimal("0.1"));
		case ISS:
			return budget.getValue().multiply(new BigDecimal("0.06"));
		default:
			return BigDecimal.ZERO;
		}
		
	}
}
