package rbca21117;

public class IncomeTax {
	
	double gross_income;
	double net_income;
	double std_deductions;
	double tax;
	double tax_percent;
	
	IncomeTax(float gross_income)
	{
		this.gross_income=gross_income;
		tax_percent=10.0;
		std_deductions=15000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IncomeTax myTax=new IncomeTax(90000);
	}

}
