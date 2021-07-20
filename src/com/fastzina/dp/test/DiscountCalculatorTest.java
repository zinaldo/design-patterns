package com.fastzina.dp.test;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;
import com.fastzina.dp.service.discount.DiscountCalculator;

public class DiscountCalculatorTest {
	public static void main(String[] args) {
		Budget budget1 = new Budget(new BigDecimal("100"), 6);
		Budget budget2 = new Budget(new BigDecimal("1100"), 1);
		
		DiscountCalculator calculator = new DiscountCalculator();
		
		System.out.println(calculator.calculate(budget1));
		System.out.println(calculator.calculate(budget2));
	}
}