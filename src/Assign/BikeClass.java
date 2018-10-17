//18) Create a bike class and store the details of pulsar, glamour, cbz through Default constructor
package Assign;

public class BikeClass {

		
		int pulsar;
		int glamour; 
		int cbz; 
		
		BikeClass() {
			System.out.println("----------------------");
			System.out.println("Default Constructor");
			System.out.println("----------------------");
			pulsar = 80500;
			glamour	 = 95000;
			cbz =80000;
			}
		void PutData() {
		System.out.println("Prize of Pulsar : "+pulsar);
		System.out.println("Prize of Glamour : "+glamour);
		System.out.println("Prize of CBZ : "+cbz);
		}
		public static void main(String args[])    {
			BikeClass Bike = new BikeClass();
			Bike.PutData();
        
	}

}
