package Inheritance;

public class Centuries extends CricketersDetails {

	private String CricketerName;
	private int CricketerAge;
	private int NumberOfCenturies;
	private int NumberofMatches;
	    
	public static void main(String[] args) {
		Centuries Cric1 = new Centuries();
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

	public int getNumberOfCenturies() {
		return NumberOfCenturies;
	}

	public void setNumberOfCenturies(int numberOfCenturies) {
		NumberOfCenturies = numberOfCenturies;
	}

	public int getNumberofMatches() {
		return NumberofMatches;
	}

	public void setNumberofMatches(int numberofMatches) {
		NumberofMatches = numberofMatches;
	}

	
}
