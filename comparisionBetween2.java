//Exercise 2.16 comparing 2 numbers
package basicsjava;
import java.util.Scanner;
public class comparisionBetween2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,
		    num2;
			
		System.out.print("Enter the first Number");
		num1=input.nextInt();
		System.out.print("Enter the second Number");
		num2=input.nextInt();
		
		if (num1 > num2) {

			System.out.println("Number 1 is greater than Number 2");

		} else if (num2 > num1) {

			System.out.println("Number 2 is greater than Number 1");

		} else	/*if (num1 == num)*/ {

			System.out.println("Number 1 and Number 2 are Equal");

		}

	}

}
