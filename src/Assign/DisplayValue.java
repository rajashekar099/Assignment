/*Create a method with name displayExperience based on value we pass
         If i receive value to this method < 2 --- then display Junior Level Software engineer
         If i receive value >=2 and <4         --- then display Software Engineer
         If i receive value > 4 and <6         --- then display Senior Level Software Engineer
         If i receive value > 6 and <8         --- then display Associate Tech Lead
         If i receive value > 8                --- then display Tech Lead          
*/
package Assign;

public class DisplayValue {

static void displayDesignation(int exp){
	
	if(exp < 2){
		System.out.println("Junior Level Software Engineer");
	}else if(exp >= 2 && exp < 4){
		System.out.println("Software Engineer");
	}else if(exp >= 4 && exp < 6){
		System.out.println("Senior Level Software Engineer");
	}else if(exp >= 6 && exp < 8){
		System.out.println("Associate Technical Lead");
	}else if(exp >= 8){
		System.out.println("Technical Lead");
	}
}
	
	public static void main(String[] args) {

		System.out.println("Starting of main method");
		// displayDesignation();
		 displayDesignation(6);
		System.out.println("Ending of main method");
}
}
