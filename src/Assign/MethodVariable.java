/*3) methods and variables ****
 
 Clue : 3 method input parameters -- name, course, duration
 Clue : how to use + operator
 Clue : No Output back from the method
 
    Write only 1 method and call that method 3 times
    first time -- babu corejava 45
    second time -- satya ui   65 
    third time  -- gopal spring 45
 
 displayDetails(String name, String course, int duration){
    
 }*/

package Assign;

public class MethodVariable {

	public static void main(String[] args) {

		//System.out.println("");	
		 displayDetails("Babu", "Corejava", 45);
		 System.out.println("");
		 displayDetails("Satya", "UI", 65);
		 System.out.println("Empty line");
		 displayDetails("Gopal", "Spring", 45);
	    System.out.println("");
	}
	
		   
	static void displayDetails(String name, String course, int duration){
		
		System.out.println("My Name is " +name);
		System.out.println("I am learning "+course);
		System.out.println("Course duration is "+duration);
	}

}
