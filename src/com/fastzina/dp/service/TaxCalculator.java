package com.fastzina.dp.service;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class TaxCalculator {
	public BigDecimal calculate(Budget budget, Tax tax) {
		return tax.calculate(budget);
	}
}
