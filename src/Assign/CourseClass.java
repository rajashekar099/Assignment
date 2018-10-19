package Assign;
//20)Assignment
public class CourseClass {

	String coursename, coursetutorname;
	int courseduration, coursefee;

	CourseClass(){
		
	}
		public static void main(String[] args) {

			CourseClass Course = new CourseClass();
			
			Course.setCoursename("Java");
			Course.setCoursetutorname("Babu");
			Course.setCourseduration(45);
			Course.setCoursefee(100);
			
			// getting the data from the object
			System.out.println("Course Duration is : " + Course.getCoursename() 
			 + ", " + "CourseTutorName is : " + Course.getCoursetutorname()	
			 + ", " + "CourseDuration is : " + Course.getCourseduration()
			+", "+ "CourseFee is : " + Course.getCoursefee());
			
CourseClass Course1 = new CourseClass();
			
			Course1.setCoursename("AdvJava");
			Course1.setCoursetutorname("Babu");
			Course1.setCourseduration(45);
			Course1.setCoursefee(100);
			
			// getting the data from the object
			System.out.println("Course Duration is : " + Course.getCoursename() 
			 + ", " + "CourseTutorName is : " + Course.getCoursetutorname()	
			 + ", " + "CourseDuration is : " + Course.getCourseduration()
			+", "+ "CourseFee is : " + Course.getCoursefee());
			
			CourseClass Course2 = new CourseClass();
			
			Course2.setCoursename("UI");
			Course2.setCoursetutorname("Babu");
			Course2.setCourseduration(60);
			Course2.setCoursefee(100);
			
			// getting the data from the object
			System.out.println("Course Duration is : " + Course.getCoursename() 
			 + ", " + "CourseTutorName is : " + Course.getCoursetutorname()	
			 + ", " + "CourseDuration is : " + Course.getCourseduration()
			+", "+ "CourseFee is : " + Course.getCoursefee());
			
		}

		public String getCoursename() {
			return coursename;
		}


		public void setCoursename(String coursename) {
			this.coursename = coursename;
		}


		public String getCoursetutorname() {
			return coursetutorname;
		}


		public void setCoursetutorname(String coursetutorname) {
			this.coursetutorname = coursetutorname;
		}


		public int getCourseduration() {
			return courseduration;
		}


		public void setCourseduration(int courseduration) {
			this.courseduration = courseduration;
		}


		public int getCoursefee() {
			return coursefee;
		}


		public void setCoursefee(int coursefee) {
			this.coursefee = coursefee;
		}


				
	}
