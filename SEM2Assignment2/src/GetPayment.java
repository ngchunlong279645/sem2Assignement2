
class SalesGetPayment implements Payment{
	
	public double getPayment(double quantity) {
		double price=2;
		return price*quantity;
	}
	
	public double getPayment(double price,double quantity) {
		return price*quantity;
	}
	
	public double getPayment(double price,double quantity,double discount) {
		return (price*quantity)*(1-discount);
	}

	

}


