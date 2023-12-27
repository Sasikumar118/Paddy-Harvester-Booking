package harvestingpro;
import java.util.*;

public class Machine {
	
	int n,a,b;
	int choice,machine=1 ;
	String again;
	 long differenceInMilliSeconds,differenceInHours,differenceInMinutes ,differenceInSeconds ;
	double acre, total=0,Pay ,total1=0;
	Scanner sc=new Scanner(System.in);
	
	
	public void demo() {
			
	    
	     
		System.out.println("\tclass Machine||rate in 1 hour=2000||");
		
		System.out.println("\tKartar Machine||rate in 1 hour=2500||");
	
		System.out.println("\tTier machine||rate in 1 hour=2700||");
	}
	public void menu() {
		System.out.println("1 to class Machine");
		System.out.println("2 to kartar Machine");
		System.out.println("3 to tier Machine");
		System.out.println("4 to exit");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		System.out.println("How many acre ?;");
		acre=sc.nextDouble();
		
		
	}
	public void harvest() {
		if(choice==1)
		 {
			System.out.println("you choice class Machine");
			System.out.println("how many machine you to want");
			machine=sc.nextInt();
			total=total+(machine*2000*acre)-( acre*200);
			System.out.println("you want to anthor machine");
			System.out.println("Press Y for[Yes]and N for[No]:");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
				harvest();
			else {
				System.out.println("Enter payment");
				Pay=sc.nextDouble();
				if(Pay<total)
					System.out.println("No,need more");
				else {
					System.out.println("Machine Owner total="+total);
					total1=(acre*200);
					System.out.println("broker commission="+total1);
					
					total=Pay-total-total1;
					System.out.println("Customer blance amount"+total);
					
				}
			
			}
		}
		else if(choice==2)
		 {
			System.out.println("you choice kartar Machine");
			System.out.println("how many machine you to want");
			machine=sc.nextInt();
			total=total+(machine*2500*acre)-(acre*200);
			System.out.println("you want to anthor machine");
			System.out.println("Press Y for[Yes]and N for[No]:");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
				harvest();
			else {
				System.out.println("Enter payment");
				Pay=sc.nextDouble();
				if(Pay<total)
					System.out.println("No,need more");
				else {
					System.out.println("Machine Owner total="+total);
					total1=(acre*200);
					System.out.println("broker commission="+total1);
					total=Pay-total-total1;
					System.out.println("Customer balance amount="+total);
					
					
				}
			
			}
		}
		else if(choice==3)
		 {
			System.out.println("you choice tier Machine");
			System.out.println("how many machine you to want");
			machine=sc.nextInt();
			total=total+(machine*2700*acre)-(acre*200);
			System.out.println("you want to anthor machine");
			System.out.println("Press Y for[Yes]and N for[No]:");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
				harvest();
			else {
				System.out.println("Enter payment");
				Pay=sc.nextDouble();
				if(Pay<total)
					System.out.println("No,need more");
				else {
					System.out.println("Machine Owner total="+total);
					total1=(acre*200);
					System.out.println("broker commission="+total1);
					total=Pay-total-total1;
					System.out.println("Custemer balance amount="+total);
					
					
				}
			
			}
		}
		else if(choice==4) {
			System.exit(0);
			}
		else {
			System.out.println("Choose machine in this list:");
			harvest();
		}
		
		
		
		
		
		
	
	}
	
}
	



