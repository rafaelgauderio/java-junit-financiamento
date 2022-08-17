package test.factory;


import entities.Financing;

public class FinancingFactory {
	
	public static Financing createFinancing (Double income, Double totalAmount, Integer months) {		
		return new Financing(income,totalAmount,months);		
	}
}