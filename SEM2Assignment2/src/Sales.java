
public class Sales extends Participant {
	private double price;
	private double quantity;
	
	public Sales(String orgName,int eventType) {	//constructor with 2 argument
		super(orgName,eventType);
		this.price=super.getPrice();
		this.quantity=super.getQuantity();
		
		if(quantity<=2) {
			Payment sales = new SalesGetPayment();
			printInfo(price,quantity);
			System.out.println("Total Price\t: RM "+sales.getPayment(price, quantity,0));
			System.out.println("");
		}
		else if(quantity>2&&quantity<=4) {
			double newPrice=2;
			Payment sales = new SalesGetPayment();
			printInfo(newPrice,quantity);
			System.out.println("Total Price\t: RM "+sales.getPayment(newPrice,quantity,0));
			System.out.println("");
		}
		else {
			double newPrice=1.50;
			double discount=0.10;
			Payment sales = new SalesGetPayment();
			printInfo(newPrice,quantity);
			System.out.println("Discount\t: "+discount*100+"%");
			System.out.println("Total Price\t: RM "+sales.getPayment(newPrice, quantity, discount));
			System.out.println("");
		}	
	}
	
	public void printInfo(double newPrice,double quantity) {
		System.out.println("Quantity\t: "+quantity);
		System.out.println("Unit Price\t: RM "+newPrice);
	}


}
