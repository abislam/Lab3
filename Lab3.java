//no arrays or loops allowed 

import java.util.Scanner;


public class Lab3 {
	public static void main(String args[]){
		int countEven = 0;
		int countOdd = 0;
		int oneDigit = 0;
		int twoDigit = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int sumOneDigit = 0;
		int sumTwoDigit = 0;
	//get 4 positive integer inputs from the user.
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter your first number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter your second number: ");
		int num2 = scan.nextInt();
		System.out.print("Enter your third number: ");
		int num3 = scan.nextInt();
		System.out.print("Enter your fourth number: ");
		int num4 = scan.nextInt();
	
		scan.close();
	
	//print largest int 
		if(num1 > num2 && num1 > num3 && num1 > num4){
			System.out.println(num1 + " is the largest");
		}else if (num2 > num1 && num2 > num3 && num2 > num4){
			System.out.println(num2 + " is the largest");
		}else if (num3 > num1 && num3 > num2 && num3 > num4){
			System.out.println(num3 + " is the largest");
		}else{
			System.out.println(num4 + " is the largest");
		}
	//print smallest int
		if(num1 < num2 && num1 < num3 && num1 < num4){
			System.out.println(num1 + " is the smallest");
		}else if (num2 < num1 && num2 < num3 && num2 < num4){
			System.out.println(num2 + " is the smallest");
		}else if (num3 < num1 && num3 < num2 && num3 < num4){
			System.out.println(num3 + " is the smallest");
		}else{
			System.out.println(num4 + " is the smallest");
		}
	//print how many even vs odd numbers %
	//sum of all even numbers
	//sum of all odd numbers
		if(num1%2 == 0){
			countEven++;
			sumEven = sumEven + num1;
		}else{
			countOdd++;
			sumOdd = sumOdd + num1;
		}
		if(num2%2 == 0){
			countEven++;
			sumEven = sumEven + num2;
		}else{
			countOdd++;
			sumOdd = sumOdd + num2;
		}
		if(num3%2 == 0){
			countEven++;
			sumEven = sumEven + num3;
		}else{
			countOdd++;
			sumOdd = sumOdd + num3;
		}
		if(num4%2 == 0){
			countEven++;
			sumEven = sumEven + num4;
		}else{
			countOdd++;
			sumOdd = sumOdd + num4;
		}
	
		System.out.println("The number of even numbers are : " + countEven);
		System.out.println("The sum of all even numbers are: " + sumEven);
	
		System.out.println("The number of odd numbers are : " + countOdd);
		System.out.println("The sum of all odd numbers are: " + sumOdd);
	
	
	//print how many are one digit vs two digit
	//sum of all one digit numbers
	//sum of all two digit numbers
		if(num1 <= 9){
			oneDigit++;
			sumOneDigit = sumOneDigit + num1;
		}else{
			twoDigit++;
			sumTwoDigit = sumTwoDigit + num1;
		}
		if(num2 <= 9){
			oneDigit++;
			sumOneDigit = sumOneDigit + num2;
		}else{
			twoDigit++;
			sumTwoDigit = sumTwoDigit + num2;
		}
		if(num3 <= 9){
			oneDigit++;
			sumOneDigit = sumOneDigit + num3;
		}else{
			twoDigit++;
			sumTwoDigit = sumTwoDigit + num3;
		}
		if(num1 <= 9){
			oneDigit++;
			sumOneDigit = sumOneDigit + num4;
		}else{
			twoDigit++;
			sumTwoDigit = sumTwoDigit + num4;
		}
		System.out.println("The number of one digit numbers are : " + oneDigit);
		System.out.println("The sum of all one digit numbers are: " + sumOneDigit);
	
		System.out.println("The number of two digit numbers are : " + twoDigit);
		System.out.println("The sum of all two digit numbers are: " + sumTwoDigit);
	
	
	
	
	
	}

}
