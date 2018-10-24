package Inheritance;

public class NoOfWickets {

	  private String CricketerName;
	  private int CricketerAge;
	  private int NumberofMatches;
	  private int noOfWickets;
	
	public static void main(String[] args) {
		
		NoOfWickets Cric3 = new NoOfWickets();

	}

	public String getCricketerName() {
		return CricketerName;
	}

	public void setCricketerName(String cricketerName) {
		CricketerName = cricketerName;
	}

	public int getCricketerAge() {
		return CricketerAge;
	}

	public void setCricketerAge(int cricketerAge) {
		CricketerAge = cricketerAge;
	}

	public int getNumberofMatches() {
		return NumberofMatches;
	}

	public void setNumberofMatches(int numberofMatches) {
		NumberofMatches = numberofMatches;
	}

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	

}
