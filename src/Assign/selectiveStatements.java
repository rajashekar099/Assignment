package Assign;

public class selectiveStatements {
	static void displayDesignation(int x){
		 if(x<=1){
			 System.out.println("Mon"); 
		 }else if(x<=2){
			 System.out.println("Tue"); 
		 }else if(x<=3){
			 System.out.println("Wed"); 
		 }else if(x<=4){
			 System.out.println("Thu"); 
		 }else if(x<=5){
			 System.out.println("Fri"); 
		 }else if(x<=6){
			 System.out.println("Sat"); 
		 }else if(x<=7){
			 System.out.println("Sun"); 
		 }
		 
	}
	public static void main(String[] args) {
		
		System.out.println("Starting of main method");
		
		 displayDesignation(2);
		 displayDesignation(1);
		 displayDesignation(4);
		 displayDesignation(3);
		System.out.println("Ending of main method"); 
		/*
		 public static void main(String[] args) 
		    { 
		        int day = 2; 
		        String dayString;
		       
		        // switch statement with int data type 
		        switch (day) { 
		        case 1: 
		            dayString = "Monday"; 
		            break; 
		        case 2: 
		            dayString = "Tuesday"; 
		            break; 
		        case 3: 
		            dayString = "Wednesday"; 
		            break; 
		        case 4: 
		            dayString = "Thursday"; 
		            break; 
		        case 5: 
		            dayString = "Friday"; 
		            break; 
		        case 6: 
		            dayString = "Saturday"; 
		 
		           break; 
		        case 7: 
		            dayString = "Sunday"; 
		            break; 
		        default: 
		            dayString = "Invalid day"; 
		            break; 
		        } 
		        System.out.println("Starting of main method");
		        System.out.println(dayString);
		       	System.out.println("Ending of main method");
				}*/

	}
	 	
	} 

