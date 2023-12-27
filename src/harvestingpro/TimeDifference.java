package harvestingpro;
import java.util.*;
import java.text.*; 




public class TimeDifference extends ordered  {
	String time1,time2;
	Date date1,date2;
	double Time,min;
	Scanner sc=new Scanner(System.in); 

	      public void test1() {
           System.out.println("Enter the strating time:");
             
	         time1 =sc.next();
	         System.out.println("Enter the ending time:");

	         time2 = sc.next(); }
	      public void test2() {
	         SimpleDateFormat ob = new SimpleDateFormat("HH:MM:ss");
	           try {
				date1= ob.parse(time1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         try {
				date2 = ob.parse(time2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	        long differenceInMilliSeconds= Math.abs(date2.getTime() - date1.getTime()); 

	   long total  = (differenceInMilliSeconds / ( 60* 60 * 1000))%24;
	        
	        long differenceInMinutes  = (differenceInMilliSeconds / (60*1000)) %60; 
            long differenceInSeconds= (differenceInMilliSeconds / 1000) %60;
            System.out.println("Total Time machine running:"+total+":" +differenceInMinutes+":"+differenceInSeconds   );
	        
	           
	    min=(differenceInMinutes%60);
	   Time=(total+min)*2000;
	     System.out.println("Total="+Time);      
}}

	


	
	   


