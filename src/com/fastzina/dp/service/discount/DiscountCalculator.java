package com.fastzina.dp.service.discount;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;

public class DiscountCalculator {
	public BigDecimal calculate(Budget budget) {
		Discount discount = 
				new DiscountMoreThanFiveItens(
						new DiscountValueHigherThanFiveHundred(
								new DiscountZero()));
		
		return discount.calculate(budget);
	}
}
