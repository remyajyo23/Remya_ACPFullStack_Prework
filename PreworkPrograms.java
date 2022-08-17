package Assignment;

import java.util.Scanner;

public class PreworkPrograms {
	
	Scanner sc = new Scanner(System.in);
	
	public void checkPalindrome() {
		System.out.println("Enter the input:");		
		int value = sc.nextInt();
		int tempValue = value;
		int pRome = 0,mod;
		while(value != 0) {
			mod = value%10;
			pRome = (pRome*10)+mod;
			value = value/10;
		}
		if(pRome == tempValue) {
			System.out.println(tempValue + " is a Palindrome Number");
		}
	}
	
	 public void printPattern() {
		 
		 System.out.println("Enter the input:");		
		 int value = sc.nextInt();
		 for(int outerLoop = value;outerLoop>0;outerLoop--) {
			 for(int innerLoop = 0;innerLoop<outerLoop;innerLoop++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

     }
	 
	 public void checkPrimeNumber() {

		 System.out.println("Enter the input:");		
			int value = sc.nextInt();
		 int prime = 1;
		 for(int i = 2;i<value;i++) {
			 if(value%i == 0) {
				 prime = 0;
				 break;
			 }else {
				 continue;
			 }
		 }
		 if(prime == 0){
		 System.out.println("Not Prime number");
		 }else {
			 System.out.println("Prime number");
		 }
     }
	 
	 public void printFibonacciSeries() {

		 int first = 0, second = 1;
		 System.out.println("Enter the input:");		
			int value = sc.nextInt();
		 int count = 2;
		 int sum = first+second;
		 System.out.print(first+","+second);
		 while(count != value) {			 
			 sum = first+second;
			 System.out.print(","+ sum);
			 first = second;
			 second = sum;
			 count++;
			 
		 }

	 }

	public static void main(String[] args) {
		PreworkPrograms obj = new PreworkPrograms();
         int choice;
         Scanner sc = new Scanner(System.in);
         do {

        	 System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        	 System.out.println();
        	 choice = sc.nextInt();
        	 switch (choice) {
        	 case 0:
        		 choice = 0;
        		 break;
        	 case 1: {
        		 obj.checkPalindrome();
        	 }
        	 break;
        	 case 2: {
        		 obj.printPattern();
        	 }
        	 break;
        	 case 3: {
        		 obj.checkPrimeNumber();
        	 }
        	 break;
        	 case 4: {
        		 obj.printFibonacciSeries();
        	 }

        	 break;
        	 default:

        		 System.out.println("Invalid choice. Enter a valid no.\n");
        	 }
        	 } while (choice != 0);

         System.out.println("Exited Successfully!!!");

         sc.close();

	}

	}


