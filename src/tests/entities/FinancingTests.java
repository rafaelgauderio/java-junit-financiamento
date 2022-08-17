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
	
	@Test
	public void constructorShouldThrowExceptionWheNotValidateFinancing () {		
		double income = 7999.0;
		double totalAmount = 450000.0;
		int months = 90;	
				
		Assertions.assertThrows(IllegalArgumentException.class, () -> {				
			Financing f1 = FinancingFactory.createFinancing(income, totalAmount, months);
		});		
	}
	
	@Test
	public void setTotalAmountShouldChangeTotalAmountWhenValidadeFinancingWithNewTotalAmount() {
		double income = 5000.0;
		double totalAmount =200000.0;
		int months = 80;		
		Financing f1 = FinancingFactory.createFinancing(income, totalAmount, months);	
		
		double newTotalAmount = 250000.0;
		f1.setTotalAmount(newTotalAmount);
		
		Assertions.assertEquals(newTotalAmount,f1.getTotalAmount());		
		
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenNotValidadeFinancingWithNewTotalAmount() {
		double income = 5000.0;
		double totalAmount =200000.0;
		int months = 80;		
		Financing f1 = FinancingFactory.createFinancing(income, totalAmount, months);
		
		double newTotalAmount = 250001.0;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			f1.setTotalAmount(newTotalAmount);
			Assertions.assertEquals(newTotalAmount,f1.getTotalAmount());			
		});
	}
	
	@Test
	public void setIncomeShouldChangeIncomeWhenValidadeFinancingWithNewIncome () {
		
		double income = 5001.0;
		double totalAmount =250000.0;
		int months = 80;		
		Financing f1 = FinancingFactory.createFinancing(income, totalAmount, months);	
		
		double newIncome = 5000.0;
		f1.setIncome(newIncome);
		
		Assertions.assertEquals(newIncome,f1.getIncome());
		
		
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenValidadeNotFinancingWithNewIncome () {
		
		double income = 5001.0;
		double totalAmount =250000.0;
		int months = 80;		
		Financing f1 = FinancingFactory.createFinancing(income, totalAmount, months);	
		
		double newIncome = 4999.0;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {			
			f1.setIncome(newIncome);
			Assertions.assertEquals(newIncome,f1.getIncome());			
		});
	}
	
	

}
