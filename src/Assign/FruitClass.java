package Assign;

public class FruitClass {
		
		int Mango;
		int Apple; 
		int PineApple; 
		int Grapes;
		FruitClass() {
			System.out.println("----------------------");
			System.out.println("Default Constructor");
			System.out.println("----------------------");
			
			Mango = 65;
			Apple = 95;
			PineApple = 250;
			Grapes =50;
		}
	
		void PutData() {
		System.out.println("Cost of Mangos : "+Mango);
		System.out.println("Cost of Apples : "+Apple);
		System.out.println("Cost of Pinapples : "+PineApple);
		System.out.println("Cost of Grapes : "+Grapes);
	
		
			}
		public static void main(String args[])    {
			FruitClass Fruit = new FruitClass();
			Fruit.PutData();
        }
}
