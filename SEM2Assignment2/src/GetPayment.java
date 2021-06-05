
class SalesGetPayment implements Payment{
	
	public double getPayment(double price,double quantity,double discount) {
		return (price*quantity)*(1-discount);
	}
}

class FinanceGetPayment implements Payment{

	public double getPayment(double expenses1, double expenses2, double expenses3) {
		return expenses1+expenses2+expenses3;
	}
	
	
}
