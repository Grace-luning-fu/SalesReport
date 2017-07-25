package SaleReport;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize variables
		String response = null; String CustomerNumber = null; String name = null; double sale = 0; 
        int TaxCode = 0; double tax = 0; double total = 0;
		// Do at least once, ask for information and calculate tax and total, and print the sales report
        // End loop if the user answer "n" to response 
        do { 
		System.out.println("Customer's number:");
		Scanner scan1 = new Scanner(System.in);
		CustomerNumber= scan1.nextLine();
		
		System.out.println("Customer's name:");
		Scanner scan2 = new Scanner(System.in);
		name = scan2.nextLine();
		
		System.out.println("Sales amount:");
		Scanner scan3 = new Scanner(System.in);
		sale = scan3.nextDouble();
		
		System.out.println("TaxCode:");
		Scanner scan4 = new Scanner(System.in);
		TaxCode= scan4.nextInt();
		
		if(TaxCode==0){
			tax=0;
			total= sale;
		}
		
		if(TaxCode==1){
			tax=0.03*sale;
			total= sale+ tax;
		}
		
		if(TaxCode==2){
			tax=0.05*sale;
			total= sale+ tax;
		}
		
		System.out.println("Sales Report");
		System.out.println("Customer Number:" + CustomerNumber + "\n" + "Customer Name:" + name + "\n" + "Sales amount:" + sale);
		System.out.println("Tax:" + tax + "\n" + "Totoal amount:" + total);
		
		System.out.println("Would you like to continue? y/n");
		Scanner scan5 = new Scanner(System.in);
		response= scan5.nextLine(); 

        // When the response is not y or n, prompt again "Would you like to continue"
		while(!response.equalsIgnoreCase("y")&&!response.equalsIgnoreCase("n")){
			System.out.println("Error Message: input should be y/n");
			System.out.println("Would you like to continue? y/n");
			Scanner scan6 = new Scanner(System.in);
			response= scan6.nextLine();
		} 
      
	
	} while (!response.equalsIgnoreCase("n"));
	}

}

