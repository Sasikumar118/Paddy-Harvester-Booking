package harvestingpro;
import java.util.*;

public class harvest extends  TimeDifference {
	
	int n ;
	
	
	Scanner sc=new Scanner(System.in);
			
	public void broker() {
		 System.out.println("\t\tPaddy HARVESTOR");
		 System.out.println("-_- -_- -_- -_- -_- -_- -_- -_- -_-");
	System.out.println("There  are some broker name list.if you choice any broker to order the machine");
	System.out.println("k.moorthi from suraikkayur||10 year experiance||");
	System.out.println("s.Ganesan from suraikkayur||8 year experiance||");
	System.out.println("n.Arasu from suraikkayur|6 year experiance||");
	System.out.println("k.sankhar from manthai||7 year experiance||");
	System.out.println("-_- -_- -_- -_- -_- -_- -_-");
	System.out.println("1 to k.moorthi||2 to s.Ganesan||3 to n.Arasu||4 to sankhar||5 to exit");
	System.out.println("enter your broker choice:");
	n=sc.nextInt();
	}
	public void test() {
		if(n==1) {
			System.out.println("you choose k.moorthi ");
			System.out.println("Phone=9876543210");
			}
		else if(n==2) {
			System.out.println("you choose s.Ganesan ");
			System.out.println("Phone=9567873210");
			
			}
			
		else if(n==3) {
			System.out.println("you choose n.Arasu");
			System.out.println("Phone=9876512345");
			}
		else if(n==4) {
			System.out.println("you choose k.sankhar ");
			System.out.println("Phone=9876436798");
			}
		else if(choice==5) {
			System.exit(0);
			}
		else {
			System.out.println("Choose broker above list:");
			test();
		}
		}
	
		
		
	
	
	
	public static void main(String args[]) {
		
		harvest ab=new harvest();
		
		
		
		ab.broker();
		ab.demo();
		
	ab.test();
		ab.menu();
		
		
		ab.display();
		//ab.test1();
		ab.harvest();
		//ab.test2();
		
		System.out.println("your  ordered is confirmed ");
		System.out.println("Thank you");
		
		
		
		
		
		
	}

}
