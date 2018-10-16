package Assign;

public class buildswitch {
	
	public static void main(String[] args) {

			System.out.println("Starting of main method");
			displayProfile("Dhoni");
			displayProfile("Ashwin");
			displayProfile("Kohli");
			displayProfile("Jadeja");
						
			System.out.println("Ending of main method");
			
		}
		
		static void displayProfile(String playerName) {
			
			switch(playerName){
				case "Dhoni" : 
					System.out.println("Dhoni's role is Wicket Keeper");
					break;
			
				case "Kohli" : 
					System.out.println("Kohli's role is Batsman");
					break;
				
				case "Ashwin" : 
					System.out.println("Ashwin's role is Spin Bowler");
				break;
				
				case "Nehra" : 
					System.out.println("Nehra's role is Fast Bowler");
				break;
				
				case "Jadeja" : 
					System.out.println("Jadeja's role is All Rounder");
				break;
				
			}		
			
		}
}
