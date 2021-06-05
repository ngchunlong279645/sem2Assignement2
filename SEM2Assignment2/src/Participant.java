import java.util.Random;
import java.util.Scanner;

public class Participant extends EventDescription  {
	private String name;
	private int age;
	private char gender;
	private double price,donation;
	private double quantity;
	Scanner scan = new Scanner (System.in);		//Pre-Define Class	
	Random random = new Random();		//Pre-Define Class	
	
	public Participant(String orgName,int eventType) {
		super(orgName,eventType);
		System.out.println("Registration for "+super.getEventname());
		System.out.print("Enter Name      : ");
		this.name=scan.nextLine();
		System.out.print("Enter Age       : ");
		this.age=scan.nextInt();
		System.out.print("Enter Gender    : ");
		this.gender=scan.next().charAt(0);
		scan.nextLine();
		this.price=super.getPrice();
		System.out.print("Enter Quantity  : ");
		this.quantity=scan.nextDouble();	
		System.out.println("Register Successfully");
		printInfo();
	}
	
	
	public void donation() {
		System.out.print("Enter Donation  : ");
		this.donation=scan.nextDouble();	
		System.out.println("Thank You For Your Donation");
	}
	
	public void printInfo() {
		System.out.println("===========================");
		System.out.println("Name \t\t: "+name);
		System.out.println("Age \t\t: "+age);
		System.out.println("Gender \t\t: "+gender);
		
	}
	
	public double getQuantity() {
		return quantity;
	}

}
