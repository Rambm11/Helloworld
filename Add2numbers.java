//Exercise 2.7 add 2 numbers tacking inputs from the user

package basicsjava;

import java.util.Scanner;

public class Add2numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,
			num2,
			sum;
		System.out.print("Enter the first input");
		num1=input.nextInt();
		System.out.print("Enter the second input");
		num2=input.nextInt();
		sum=num1+num2;
		System.out.printf("sum is %d\n",sum);
		

	}

}
