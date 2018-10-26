//11) Create a loop for values from 4 to 13 and break the loop only at 3rd even no 
   
package Assign;

import java.util.List;
import java.util.Arrays;
public class CreateLoop4to13 {

	public static void main(String[] args) {

		 List<String> loop  = Arrays.asList("4","5","6","7","8","9","10", "11","12","13");  
		 	System.out.println("loop only at 3rd even no is : " + loop.get(4));
		 	System.out.println("loop only at 2nd Odd no is : " + loop.get(3));
	}

}
