
public class Advertisement extends EventDescription {	// inheritance
	private double discount;
	
	public Advertisement(String orgName,int eventType,double discount) {	//constructor with 3 argument
		super(orgName,eventType);
		System.out.println(">>>>>>>>>>>>>>>>>>>>Come and join us<<<<<<<<<<<<<<<<<<<<<<<\n");
		this.discount=discount;
		 printInfo();
	}
	
	public void printInfo() {	// polymorphism
		System.out.println("+============================================================+");
		System.out.println("| We will celebrate "+super.getEventname()+" at"+super.getDate()+" |");
		System.out.println("| This event is organise by "+super.getOrgName()+"\t\t\t     |");
		System.out.println("| Each tickets price will be RM "+super.getPrice()+" per Unit\t\t     |");
		System.out.println("| Above 2 tickets price will be RM 2 per Unit\t\t     |");
		System.out.println("| Above 5 tickets will be RM 1.50 +"+discount+"% discount\t     |");
		donationLink();
		eventLink();
		System.out.println("");
	}
	
	public void donationLink() {
		System.out.println("| Donation Link : https://www.sols247.org/donate/ 	     |");
	}
	
	public void eventLink() {
		System.out.println("| Event Link : https://www.sols247.org/                      |");
		System.out.println("+============================================================+");
	}
	

}
