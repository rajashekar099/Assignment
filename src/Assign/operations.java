package Assign;

public class operations {

	public static void main(String[] args) {
		int operator, add1, div1, mult1, mod1;
		int a = 2, b = 1, c = 2, d = 2;
		add1 = a+b;
		System.out.println("addition of two values(a+b) is : " + add1);
		div1 = c/d;
		System.out.println("Division of two values(c/d) is : " + div1);
		mult1 = add1 * div1;
		System.out.println("Multiplication of two values((a+b) * (c/d)) is : " +mult1);
		mod1 = mult1 % 2;
		System.out.println("Result for Modulo (3) % 2 is : " +mod1);
		operator =  ((a+b) * (c/d)  % 2) ;
		System.out.println("-----------------");
		System.out.println("Result of formula  [(a+b) * (c/d) % 2] is: " +operator);
	}
}