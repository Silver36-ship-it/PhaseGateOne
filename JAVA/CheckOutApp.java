import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class CheckOutApp{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

ArrayList<String> productName = new ArrayList<>();
ArrayList<Double> productQuantity = new ArrayList<>();
ArrayList<Double> productPrize = new ArrayList<>();
ArrayList<Double> totals = new ArrayList<>();
LocalDateTime dateTime = LocalDateTime.now();
double total = 0;
System.out.println("What is the Customer name? ");
String CustomerName = input.next();
while(true){
	System.out.println("What did the user buy? ");
	String userInput = input.next();
		productName.add(userInput);
	System.out.println("How many pieces? ");
	double userQuantity = input.nextInt();
		productQuantity.add(userQuantity);
	System.out.println("How much per unit? ");
	double userPrize = input.nextDouble();
		productPrize.add(userPrize);
		
		total = userQuantity * userPrize;
		totals.add(total);
	System.out.println("Add more items? ");
	String userItems = input.next();
	if(userItems.equalsIgnoreCase("no")){
		break; }
				
		}
	System.out.println("What is your name? ");
	String userCashier = input.next();
	
	System.out.println("How much discount will he get? ");
	double discountInput = input.nextDouble();
	
	int subTotal = 0;
	for(int index = 0; index < totals.size(); index++){
		subTotal += totals.get(index);
		}
		
	double discount = discountInput/100;
	double discount_check = discount * subTotal;
	double VAT = subTotal * 0.175; 
	double billTotal = (VAT - discount_check) + subTotal;
	System.out.println(billTotal);
	System.out.println(totals);
	System.out.println(subTotal);
	
     System.out.println("SEMICOLON STORES");
     System.out.println("MAIN BRANCH");
     System.out.println("LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
     System.out.println(dateTime);
     System.out.println("TEL: 03293828343");
     System.out.println("Cashier: " + userCashier);
     System.out.println("Customer Name: " + CustomerName);
     System.out.println("==============================================================================");
     System.out.println("            " + "ITEM"+ "\t" + "QTY" + "\t" + "PRICE" + "\t" + "TOTAL(NGN)");
     System.out.println("------------------------------------------------------------------------------");
     for(int index = 0; index < productName.size(); index++){
     	System.out.println("product");
     System.out.println("            " + productName.get(index) + "\t" + productQuantity.get(index) + "\t" + productPrize.get(index) + "\t" + totals.get(index));
     }
     System.out.println("-------------------------------------------------------------------------------");
     System.out.println("Sub Total: " + subTotal);
     System.out.println("Discount: " + discount_check);
     System.out.println("VAT @ 17.50%: " + VAT);
     System.out.println("==========================================================");
     System.out.println("Bill Total: " + billTotal);
     System.out.println("===================================================");
     System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
     System.out.println("===========================================================");
     
     System.out.println("How much did the customer give to you?");
     double customerInput = input.nextDouble();
     
     
     System.out.println("SEMICOLON STORES");
     System.out.println("MAIN BRANCH");
     System.out.println("LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
     System.out.println(dateTime);
     System.out.println("TEL: 03293828343");
     System.out.println("Cashier: " + userCashier);
     System.out.println("Customer Name: " + CustomerName);
     System.out.println("==============================================================================");
     System.out.println("            " + "ITEM"+ "\t" + "QTY" + "\t" + "PRICE" + "\t" + "TOTAL(NGN)");
     System.out.println("------------------------------------------------------------------------------");
     for(int index = 0; index < productName.size(); index++){
     	System.out.println("product");
     System.out.println("            " + productName.get(index) + "\t" + productQuantity.get(index) + "\t" + productPrize.get(index) + "\t" + totals.get(index));
     }
     System.out.println("-------------------------------------------------------------------------------");
     System.out.println("Sub Total: " + subTotal);
     System.out.println("Discount: " + discount_check);
     System.out.println("VAT @ 17.50%: " + VAT);
     System.out.println("==========================================================");
	System.out.println("Bill Total: " + billTotal);
	double calculateInput = customerInput - billTotal;
	System.out.println("Amount paid: " + customerInput);
	System.out.println("Amount paid: " + calculateInput);
	System.out.println("==============================================================");
	System.out.println("THANK YOU FOR YOUR PATRONAGE");
	System.out.println("=================================================================");
     	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	