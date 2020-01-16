package workbook.workshop5.Test02Company;

public class Company {
	private double salary;
	private double annualIncome;
	private double afterTaxAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {}
	public Company(double salary)
	{
		this.salary = salary;
	}
	
	public double getIncome()
	{
		this.annualIncome = this.salary*12;
		return this.annualIncome;
	}
	
	public double getAfterTaxIncome()
	{
		this.afterTaxAnnualIncome = this.salary*12.0*(1-0.1);
		return this.afterTaxAnnualIncome;
	}
	public double getBonus()
	{
		this.bonus = this.salary*4*0.2;
		return this.bonus;
	}
	public double getAfterTaxBonus() {
		this.afterTaxBonus = this.salary*4*0.2*(1-0.055);
		return this.afterTaxBonus;
	}
	

}
