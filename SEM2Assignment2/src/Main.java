import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);		//Pre-Define Class	
		int choose;
		int eventType=0;
		
		System.out.println("Welcome to SOLS 24/7 Organization");
		System.out.println("Our organization provides free education and"
							+ " social empowerment programmes to underserved communities"
							+ " all around Malaysia.\n");
		System.out.println("Our organization vision : SOLS 24/7 envisions that people from all communities\n\t\t\t"
							+ "  – regardless of race, religion or gender – will have access to education\n\t\t\t"
							+ "  and social empowerment services, resulting in developed societies with equal\n\t\t\t"
							+ "  opportunities for all.\n");
		System.out.println("Our organization mission : Our mission is to serve, educate & empower the bottom 40% of the population\n\t\t\t"
							+ "   with FREE education, personal development & employment support.\n");
	
		System.out.println("Organisation Name\t: SOLS 24/7");
		System.out.println("Address\t\t\t: NO,17 TAMAN BAHAGIA BUKIT AMAN");
		System.out.println("Contact Number\t\t: 0332917865");
		System.out.println("Facebook Link\t\t: https://www.facebook.com/SOLS247/");
		System.out.println("");

		System.out.println("Select Option : 1-Participant\n\t\t"
											+ "2-Admin \n\t\t");
		
		do {
			System.out.print("Enter option    : ");
			int option = scan.nextInt();		
			if(option==1) {
				System.out.println("\nWhich event are you interested in ?");
				System.out.println("1. World Book and Copyright Day");
				System.out.println("2. International Day of Families");
				System.out.println("3. International Day of Happiness");
				System.out.print("Enter your option: ");
				eventType = scan.nextInt();

		Advertisement latestNews = new Advertisement("SOLS 24/7",eventType,10);	// constructor with 3 arguments
		EventDescription event = new EventDescription("SOLS 24/7",eventType);	// constructor with 2 arguments
		event.printInfo();
		
		Sales newEvent  = new Sales("SOLS 24/7",eventType);	// constructor with 2 arguments
		System.out.println("Do you want to donate ?? 1-yes 2-no");
		int selection=scan.nextInt();
		if(selection==1) {
			newEvent.donation();
		}
		else {
			System.out.println("Thank you");
		}
			}
			else {
				System.out.println("");
				System.out.println("Welcome Back Admin ");	
				Finance report = new Finance("SOLS 24/7",45686.80,312,562,200);	// constructor with 5 arguments
				report.setMonth("June");	//2.3 Encapsulation
				System.out.println(">>>>>>>>Financial Report In "+report.getMonth()+"<<<<<<<<<<<<<<<<\n");	//2.3 Encapsulation
				report.printInfo();
			}
			System.out.println("");
			System.out.println("DO YOU WANT TO CONTINUE ? 1-YES 2-NO");
			choose=scan.nextInt();
			}while(choose==1);
	}
		

}

	
