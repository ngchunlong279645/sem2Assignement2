
public class Finance extends VolunteerTeacherOrganisation { //2.1 Inheritance
	private double totalDonation,totalExpenses;
	private String orgName,month;
	private double bill,eventExpenses,rentalFee;
	

	public Finance (String orgName,double totalDonation,double bill, double eventExpenses, double rentalFee) {	//constructor with 4 argument	
		super(orgName);
		this.orgName=orgName;
		this.totalDonation=totalDonation;
		this.bill=bill;
		this.eventExpenses=eventExpenses;
		this.rentalFee=rentalFee;	
		
		Payment totalExpenses = new FinanceGetPayment();	//2.5 Interface
		this.totalExpenses=totalExpenses.getPayment(rentalFee, eventExpenses, bill);
	}
	
	
	public double calBalance() {
		return totalDonation-totalExpenses;
	}
	
	public void setMonth(String month) {	//2.3 Encapsulation
		this.month=month;
	}
	
	public String getMonth() {	//2.3 Encapsulation
		return month;
	}
	
	public void printInfo() {	//2.2 Polymorphism
		System.out.println("Organisation     : "+orgName);
		System.out.println("Total Donation   : RM "+totalDonation);	
		System.out.println("Total Expenses   : RM "+totalExpenses);
		System.out.println("Balance          : RM "+calBalance());
	}
}
