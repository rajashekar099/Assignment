package Inheritance;

public class NumberOfStumps {
	
	 private String CricketerName;
	 private int CricketerAge;
	 private int NumberofMatches;
	 private int noOFStumps;

	 public static void main(String[] args) {
		 NumberOfStumps Cric2 = new NumberOfStumps();
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

	public int getNoOFStumps() {
		return noOFStumps;
	}

	public void setNoOFStumps(int noOFStumps) {
		this.noOFStumps = noOFStumps;
	}
	 
	 
}
