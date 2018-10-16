package Assign;

public class arraytest {
	
	static int x;	
	static float f;
	static boolean b;

	//class ArrayTest {
	    static String[] Names = { "Sachin", "Dhoni", "Virat", "Yuvraj", "Rohit", "Shikar" };
	 
	    void printNames() {
	      int i = 0;
	       System.out.println(Names[i]);   
	      i++;
	       System.out.println(Names[i]);   
	       i++;   
	       System.out.println(Names[i]);   
	       i++;   
	       System.out.println(Names[i]); 
	       i++;   
	       System.out.println(Names[i]);   
	       i++;   
	       System.out.println(Names[i]);   
	        
	  
	    }
	   
	    public static void main (String args[]) {
	    	arraytest a = new arraytest();
	       a.printNames();
	       System.out.println("----------");

	  //   4) Display the cricketer name who is in first index position of array (index position is 0)
	  		   System.out.println("------------");	
	  		   System.out.println("First index position of array (index position is 0)");
	  		   System.out.println(Names[0]);
	  		   
	  	    //   5) Display the cricketer name who is in specified index position of array (index position is 5)
	  		   System.out.println("");	
	  		   System.out.println("Specified index position of array (index position of 5 is)");
	  		   System.out.println(Names[5]);
	  	    
	  		   // System.out.println("Enter the index of the required element ::");
	  		      
	  		//   6) Display the no of values you have stored in an array(CAPABILITY OF YOUR ARRAY)
	  		   
	  		   	System.out.println("         ");
	  					System.out.println("Default value of int data type variable is "+x);
	  					System.out.println("Default value of float data type variable is "+f);
	  					System.out.println("Default value of boolean data type variable is "+b);
	  		
	  				// 5) Display the cricketer name who is in specified index position of array (index position is 66)
	  					System.out.println("");	
	  				try{
	  					System.out.println("AS there is no index position you find error:"+  Names[66] );  					
	  				}catch(ArrayIndexOutOfBoundsException ex){
	  					System.out.println("Specified index position of array (index position of 66 is not available)");
	  					ex.printStackTrace();
	  			}	  				
	   }
	}
