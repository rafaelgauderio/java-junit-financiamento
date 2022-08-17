package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import test.factory.FinancingFactory;

public class FinancingTests {
	
	
	@Test
	public void constructorShouldInstiateFinancingWhenValidateFinancing () {		
		double income = 5000.0;
		double totalAmount =200000.0;
		int months = 80;	
		
		Financing f1 = FinancingFactory.createFinancing(income, totalAmount, months);		
		
		Assertions.assertTrue(f1.getIncome()==5000.0);
		Assertions.assertEquals(200000, f1.getTotalAmount());
		Assertions.assertTrue(f1.getMonths()==80);		
		
	}

}
