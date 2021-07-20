package com.fastzina.dp.service.tax;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public interface Tax {
	public BigDecimal calculate(Budget budget);
}
