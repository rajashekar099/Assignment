/*  5) Assgnmts on ARRAYS
      --------------------
       1) Create a string array 
       2) and store atleast 6 indian cricketers names
       	       
       3) Display all cricketer names you have in your array variable  --- for  ****
       4) Display the cricketer name who is in first index position of array (index position is 0)
       5) Display the cricketer name who is in specified index position of array (index position is 5)
       5) Display the cricketer name who is in specified index position of array (index position is 66)
       6) Display the no of values you have stored in an array(CAPABILITY OF YOUR ARRAY)
      ------------------------- 
         
       1) create int array, float array, boolean array with size as 4 individually
       display all the values in the array 
       Clue : default values 
   -------------------------
 */
package Assign;

public class Arrays {
	static int x;	
	static float f;
	static boolean b;
	
	public static void main(String[] args) {

		String[] Cricketer = new String[6];

			
// we are creating Cricket variable which is capable to hold group of 6 string values
// with a valid index positions of 0,1,2,3,4,5
				
		
		//Displaying all cricketer name in array variable
		Cricketer[0] = "Dhoni";
		Cricketer[1] = "Sachin";
		Cricketer[2] = "Virat";
		Cricketer[3] = "Rothi";
		Cricketer[5] = "Yuraj";
		Cricketer[4] = "Shikar";
		
		//Display all cricketer names you have in your array variable  --- for  ****
		   System.out.println(Cricketer[1]);
		   System.out.println(Cricketer[0]);
		   System.out.println(Cricketer[2]);
		   System.out.println(Cricketer[3]);
		   System.out.println(Cricketer[4]);
		   System.out.println(Cricketer[5]);
	
		//   4) Display the cricketer name who is in first index position of array (index position is 0)
		   System.out.println("------------");	
		   System.out.println("First index position of array (index position is 0)");
		   System.out.println(Cricketer[0]);
		   
	    //   5) Display the cricketer name who is in specified index position of array (index position is 5)
		   System.out.println("");	
		   System.out.println("Specified index position of array (index position of 5 is)");
		   System.out.println(Cricketer[5]);
	    
		   // System.out.println("Enter the index of the required element ::");
		      
		//   6) Display the no of values you have stored in an array(CAPABILITY OF YOUR ARRAY)
		   
		   	System.out.println("         ");
					System.out.println("Default value of int data type variable is "+x);
					System.out.println("Default value of float data type variable is "+f);
					System.out.println("Default value of boolean data type variable is "+b);
					
		   //   5) Display the cricketer name who is in specified index position of array (index position is 66)
		   System.out.println("");	
		   System.out.println("Specified index position of array (index position of 66 is)");
		
		   
		   //System.out.println("AS there is no index position you find error:" + Cricketer[66]);
		    
	    
	}

}
