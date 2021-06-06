
public class EventDescription extends VolunteerTeacherOrganisation {	//2.1 Inheritance
	private String eventName;
	private String orgName;
	private String date;	
	private int time, eventType;
	private double price;
	
	
	public EventDescription (String orgName,int eventType) {
		super(orgName);
		this.eventType = eventType;	
		this.orgName=orgName;
				if(this.eventType == 1) {
					this.eventName="World Book and Copyright Day";
					this.price=3;
					this.date="27-6-2021";
					this.time=3;
				}
				else if(this.eventType == 2) {
					this.eventName="International Day of Families";
					this.price=5;
					this.date="2-9-2021";
					this.time=7;
				}
				else {
					this.eventName="International Day of Happiness";
					this.price=4;
					this.date="7-8-2021";
					this.time=5;
				}
	}

	public void printInfo() {	//2.2 Polymorphism
		System.out.println("Organisation\t: "+orgName);
		System.out.println("Event \t\t: "+eventName);
		System.out.println("Date \t\t: "+date);
		System.out.println("Time \t\t: "+time+"PM");
		System.out.println("Entrance Fee \t: "+price+"\n");
	}

	public String getEventname() {
		return eventName;
	}
	
	public String getDate() {
		return date;
		}
	
	public String getOrgName() {
		return orgName;
	}
	
	public double getPrice() {
		return price;
	}
	
	

}
