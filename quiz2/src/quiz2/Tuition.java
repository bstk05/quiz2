package quiz2;

import java.util.Scanner;


public class Tuition {
	public static void main(String[] args){

		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the tuition:");
		double t = input.nextDouble();
		
		System.out.print("Enter the inflation rate:");
		double rate = input.nextDouble();
		double r = rate / 100;

		double Totaltuition = 0;
		
		int n = 4;
			Totaltuition = t * ((Math.pow(1 + r, n) - 1) / r);

		System.out.print("Your total tuition fee is $" + Totaltuition );
		}
			
}
	


