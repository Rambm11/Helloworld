// Exercise 2.5 product of three integers
package basicsjava;
import java.util.Scanner;

import java.util.Scanner;

public class productOf3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,
			y,
			z,
			product;
		System.out.print("Enter the first input");
		x=input.nextInt();
		System.out.print("Enter the second input");
		y=input.nextInt();
		System.out.print("Enter the second input");
		z=input.nextInt();
		product=x*y*z;
		System.out.printf("product is %d\n",product);

	}

}
