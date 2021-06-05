
public class Finance extends VolunteerTeacherOrganisation {
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
		
		Payment totalExpenses = new FinanceGetPayment();
		this.totalExpenses=totalExpenses.getPayment(rentalFee, eventExpenses, bill);
	}
	
	
	public double calBalance() {
		return totalDonation-totalExpenses;
	}
	
	public void setMonth(String month) {
		this.month=month;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void printInfo() {
		System.out.println("Organisation   : "+orgName);
		System.out.println("Total Donation  : RM "+totalDonation);	
		System.out.println("Total Expenses   : RM "+totalExpenses);
		System.out.println("Balance    : RM "+calBalance());
	}
}
