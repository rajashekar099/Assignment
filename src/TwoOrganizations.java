package Inheritance;

public class TwoOrganizations {

	public static void main(String[] args) {

		Employee empObj = new Employee();
		empObj.setEmpName("ROY");
		empObj.setSex('M');
		empObj.setJobTitle("Sr.Software Dev");
		empObj.setBirthday("11/11/1982");
		empObj.setOrganizationName("GoogleX");
		empObj.setNoOfEmp(150);
		
		System.out.println("Employee name is : " + empObj.getEmpName());
		System.out.println("Employee Gender is : " + empObj.getSex());
		System.out.println("Employee Job Title is : " + empObj.getJobTitle());
		System.out.println("Employee Birthday is : " + empObj.getBirthday());
		System.out.println("Employee Organization is : " + empObj.getOrganizationName());
		System.out.println("Total No of employee is : " + empObj.getNoOfEmp());
		System.out.println("--------------------------");
		
		GoogleOrg GoogleObj = new GoogleOrg();
		GoogleObj.setEmpName("Raja");
		GoogleObj.setSex('M');
		GoogleObj.setJobTitle("Sr.Software Dev");
		GoogleObj.setBirthday("01-21-90");
		GoogleObj.setOrganizationName("GoogleX");
		GoogleObj.setNoOfEmp(150);
		GoogleObj.setNoOfIssuesFixed(20);
		
		

		System.out.println("Employee name is google is : " + GoogleObj.getEmpName());
		System.out.println("Google emp gender is : " + GoogleObj.getSex());
		System.out.println("Job Title is : " + GoogleObj.getJobTitle());
		System.out.println("Date of birth is : " + GoogleObj.getBirthday());
		System.out.println("Organization name is : " + GoogleObj.getOrganizationName());
		System.out.println(" Total no of employee : " + GoogleObj.getNoOfEmp());
		System.out.println("--------------------------");
		
		MicrosoftOrg MicrosoftObj = new MicrosoftOrg();
		MicrosoftObj.setEmpName("Max");
		MicrosoftObj.setSex('M');
		MicrosoftObj.setJobTitle("Jr.Software Dev");
		MicrosoftObj.setBirthday("01-21-92");
		MicrosoftObj.setOrganizationName("MicrosoftX");
		MicrosoftObj.setNoOfEmp(200);
		MicrosoftObj.setNoOfIssuesRaised(20);
		

		System.out.println(MicrosoftObj.getEmpName());
		System.out.println(MicrosoftObj.getSex());
		System.out.println(MicrosoftObj.getJobTitle());
		System.out.println(MicrosoftObj.getBirthday());
		System.out.println(MicrosoftObj.getOrganizationName());
		System.out.println(MicrosoftObj.getNoOfEmp());
		
	}

}
