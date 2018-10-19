package Assign;

public class Employee {

	private String EmpOrganization;
	private String EmpDesignation;
	private int Salary;
	
//Default Constructor
Employee(){
		
	}

Employee(String EmpOrganization, String EmpDesignation, int Salary){
	this.EmpOrganization = EmpOrganization;
	this.EmpDesignation = EmpDesignation;
	this.Salary = Salary;
}


	public static void main(String[] args) {
//1 Default Constructor
		Employee obj = new Employee();
		System.out.println(obj);

		//		obj.setOrganization("TCS");
//obj.setDesignation("Associate Java Developer"); 
	//	obj.setSalary(70000);
	//	
//			System.out.println("--------------------------------------------");
	//		System.out.println("Company Details : " +obj.getOrganization());
		//	System.out.println("Employee Designation : " +obj.getDesignation());
			//System.out.println("Employee Salary : " +obj.getSalary());
			//System.out.println("---------------------------------------------");
	
		//2 Parameterised constructor
		Employee obj2 = new Employee("CTS", "Sr. Java Developer", 95000);
		System.out.println("--------------------------------------------");
		System.out.println(obj2);
		System.out.println("--------------------------------------------");
		Employee obj3 = new Employee("Accenture", "TL Java Developer", 120000);
		System.out.println(obj3);
		System.out.println("---------------------------------------------");
	
	}

	public String getOrganization() {
		return EmpOrganization;
	}

	public void setOrganization(String organization) {
		EmpOrganization = organization;
	}

	public String getDesignation() {
		return EmpDesignation;
	}

	public void setDesignation(String designation) {
		EmpDesignation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
@Override
 public String toString() {
	 return "Employee[EmpOrganization = " + EmpOrganization + ", EmpDesignation = "
	 		+ EmpDesignation +", Salary = " + Salary+"]";
	
 }
}