package com.fastzina.dp.test;

import java.math.BigDecimal;

import com.fastzina.dp.model.Budget;
import com.fastzina.dp.service.tax.ICMSTax;
import com.fastzina.dp.service.tax.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("100"), 1);
		TaxCalculator calculator = new TaxCalculator();
		System.out.println(calculator.calculate(budget, new ICMSTax()));
	}
}