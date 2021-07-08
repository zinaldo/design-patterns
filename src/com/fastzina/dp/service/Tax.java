package com.fastzina.dp.service;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public interface Tax {
	public BigDecimal calculate(Budget budget);
}
