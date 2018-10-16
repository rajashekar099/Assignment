//7.1)  Write a method and pass month value (atleast 6) and 
//display its month name using SWITCH CASE

package Assign;

public class switchcasedispalybymonth {

	public static void main(String[] args) {

		System.out.println("Starting of main method");
		displayProfile("Jan");
		displayProfile("Mar");
		displayProfile("May");
		displayProfile("Jul");
		displayProfile("Sep");
		displayProfile("Nov");
					
		System.out.println("Ending of main method");
		
	}
	
	static void displayProfile(String displymonth) {
		
		switch(displymonth){
			case "Jan" : 
				System.out.println("This month is: January");
				break;
		
			case "Feb" : 
				System.out.println("This month is: Febuary");
				break;
		
			case "Mar" : 
				System.out.println("This month is: March");
				break;
		
			case "Apr" : 
				System.out.println("This month is: April");
				break;
		
			case "May" : 
				System.out.println("This month is: May");
				break;
		
			case "Jun" : 
				System.out.println("This month is: June");
				break;
		
			case "July" : 
				System.out.println("This month is: July");
				break;
		
			case "Aug" : 
				System.out.println("This month is: August");
				break;
		
			case "Sep" : 
				System.out.println("This month is: September");
				break;
		
			case "Oct" : 
				System.out.println("This month is: October");
				break;
		
			case "Nov" : 
				System.out.println("This month is: November");
				break;
		
			case "Dec" : 
				System.out.println("This month is: December");
				break;
		
				
		}		
		

		
	}

}
