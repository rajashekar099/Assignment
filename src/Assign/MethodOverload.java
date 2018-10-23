package Assign;

 public class MethodOverload {

	// Overloaded MethodOverload(). This MethodOverload takes two int parameters 
	    public int MethodOverload(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	  
	    // Overloaded MethodOverload(). This MethodOverload takes three int parameters 
	    public int MethodOverload(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	  
	    // Overloaded MethodOverload(). This sum MethodOverload two double parameters 
	    public double MethodOverload(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	    	MethodOverload s = new MethodOverload(); 
	        System.out.println(s.MethodOverload(10, 20)); 
	        System.out.println(s.MethodOverload(10, 20, 30)); 
	        System.out.println(s.MethodOverload(10.5, 20.5)); 
	    } 
	} 