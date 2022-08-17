package entities;

public class Financing {
	
	private Double income;
	private Double totalAmount;
	private Integer months;
	
	
	public Financing(Double income, Double totalAmount, Integer months) {
		validadeFinancing(income, totalAmount, months);
		this.income = income;
		this.totalAmount = totalAmount;
		this.months = months;
	}


	public Double getIncome() {
		return income;
	}


	public void setIncome(Double income) {
		validadeFinancing(income, totalAmount, months);
		this.income = income;
	}


	public Double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(Double totalAmount) {
		validadeFinancing(income, totalAmount, months);
		this.totalAmount = totalAmount;
	}


	public Integer getMonths() {
		return months;
	}


	public void setMonths(Integer months) {
		validadeFinancing(income, totalAmount, months);
		this.months = months;
	}
	
	//entry is 20 percent of the total Amount
	public Double entry() {
		return this.totalAmount * 0.2;
	}
	
	public Double quota() {
		return (this.totalAmount - entry()) / this.months;
	}
	
	
	//the amount of the installment can not be greater than half of the monthly income
	protected void validadeFinancing(Double income, Double totalAmount, Integer months) {
		double installment= (totalAmount * 0.8)/(months) ;
		if(installment > income/2.0) {
			throw new IllegalArgumentException("\nErro. A parcela mensal não pode ser maior que metadade da renda.\n");
		}	
		
	}

	@Override
	public String toString() {
		return "\nFinancing Data [income=" + String.format("%.2f", income) + ", totalAmount=" + String.format("%.2f",totalAmount) + ", months=" + months + "]";
	}
	
	
	
	

}
