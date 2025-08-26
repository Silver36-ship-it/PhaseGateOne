import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class AtmCardProgram {

public static String atm_check(String card_check){
ArrayList<Integer> list = new ArrayList<>();
int sum = 0;
int oddSum = 0;
for(int index = 0; index < card_check.length(); index++){
	int numericValue  = Character.getNumericValue(card_check.charAt(index));

	 list.add(numericValue );
	}
for(int index = 0; index < list.size(); index+= 2){
		if((list.get(index) * 2) >= 10){
			int lastDigit = (list.get(index) * 2) % 10;
			 int firstDigit = (list.get(index) * 2) / 10;
			 sum += lastDigit + firstDigit;}
			 else {
			 
			sum += list.get(index) * 2;
		}
		}
for(int index = 1; index < list.size(); index+= 2){
	oddSum += list.get(index);}
	int addUp = oddSum + sum;
	if(addUp % 10 == 0){
return "Valid";}
else
	return "Invalid";
 }
 
 public static String check_cardType(String card_number){
 ArrayList<Integer> list = new ArrayList<>();
 for(int index = 0; index < card_number.length(); index++){
 	int numericValue = Character.getNumericValue(card_number.charAt(index));
 		list.add(numericValue );
 		}

 	if(list.get(0) == 4){
 	return "Visa card";}
 	else if(list.get(0) == 5){
 	return "Mastercard";}
 	else if(list.get(0) == 6){
 		return  "Discover card";}
 	else if(list.get(0) == 3 && list.get(1) == 7){
 		return "American express card";}
 	else
 		return "Invalid card";}
 		
 public static int check_cardLength(String card_number){
 	if(card_number.length() >= 13 && card_number.length() <= 16){
 	return card_number.length();}
 	else
 		return -1;
 }
 
 
 
 public static void main(String[] args){
 
 String cardNumber = "4388576018402626";
   System.out.println("Credit card number " + cardNumber);
 String card = atm_check(cardNumber);
   String cardType = check_cardType(cardNumber);
   int cardLength = check_cardLength(cardNumber);
    if(cardLength == -1){
   	System.out.println("Invalid card length");}
   else
   System.out.println("Credit card digit length: " + cardLength);
 System.out.println("Credit card validity status: " + card);
  System.out.println("Credit card type: " + cardType);

 }
 }
 
 
