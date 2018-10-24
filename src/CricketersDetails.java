package Inheritance;

public abstract class CricketersDetails {

	  public static void main(String[] args) {
	  // Cricketer with Centuries
	  Centuries Cric1 = new Centuries();
	  Cric1.setCricketerName("Virat Kohli");
	  Cric1.setNumberOfCenturies(20);
	  Cric1.setCricketerAge(26);
	  Cric1.setNumberofMatches(100);
	  
	  System.out.println("Name :" + Cric1.getCricketerName());
	  System.out.println("noOfCenturies : " + Cric1.getNumberOfCenturies());
	  System.out.println("Age : " + Cric1.getCricketerAge());
	  System.out.println("noOfMatches : " + Cric1.getNumberofMatches());
	  System.out.println("-----------------------------------------------");
	  
	  	// Cricketer with Number of Stumps
	  	NumberOfStumps Cric2 = new NumberOfStumps();
		  Cric2.setCricketerName("Dhoni");
		  Cric2.setNoOFStumps(20);
		  Cric2.setCricketerAge(32);
		  Cric2.setNumberofMatches(350);
		  
		  System.out.println("Name :" + Cric2.getCricketerName());
		  System.out.println("noOfStumps : " + Cric2.getNoOFStumps());
		  System.out.println("Age : " + Cric2.getCricketerAge());
		  System.out.println("noOfMatches : " + Cric2.getNumberofMatches());
		  System.out.println("-----------------------------------------------");
		  
		// Cricketer with NoOfWickets
		  NoOfWickets Cric3 = new NoOfWickets();

		  Cric3.setCricketerName("Nehra");
		  Cric3.setNoOfWickets(100);
		  Cric3.setCricketerAge(35);
		  Cric3.setNumberofMatches(400);

		  Cric3.setCricketerName("Ashwin");
		  Cric3.setNoOfWickets(40);
		  Cric3.setCricketerAge(28);
		  Cric3.setNumberofMatches(200);

		  System.out.println("Name :" + Cric3.getCricketerName());
		  System.out.println("noOfWickets : " + Cric3.getNoOfWickets());
		  System.out.println("Age : " + Cric3.getCricketerAge());
		  System.out.println("noOfMatches : " + Cric3.getNumberofMatches());
		  System.out.println("-----------------------------------------------");
		  
	  }
}

	  