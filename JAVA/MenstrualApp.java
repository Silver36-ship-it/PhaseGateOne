import java.util.Scanner;
public class MenstrualApp{
static Scanner input = new Scanner(System.in);	
public static String displayWelcomePage(){
	String displayPage = """		
		Welcome to the Menstrual app!!!
		
Note: This app only works for regular cycle(28-day period)
		
		press 1 to enter if eligible """;
		
	return displayPage;}

public static String menuPage(){
	String displayMenu = """
				1. Flow date
				2. Safe period
				3. Ovulation time
				0. To exit the app
					""";
	return displayMenu;}
	
public static int calculateFlowDate(int dateInput){
	return 28 - dateInput;}

public static int calculateOvulationTime(int ovulationInput){
	int ovulationConstant = 14;
	int cycleConstant = 28;
	if(ovulationInput > 0 && ovulationInput <= ovulationConstant){
		return ovulationConstant - ovulationInput;}
	else if(ovulationInput > ovulationConstant && ovulationInput <=  cycleConstant){
		return cycleConstant - ovulationInput + ovulationConstant;
		}
	else
		return -1;
		}

public static String inAppDisplay(){
	String displayFlow = """
			Welcome!!!
			Enter the day you saw
			your period last
			 """;
	return displayFlow;
	}
				
public static void main(String[] args){	
	System.out.println(displayWelcomePage());
	System.out.println("Enter 1: ");
	 int user_input = input.nextInt();
	if(user_input == 1){
		System.out.println(menuPage());
		System.out.println("Enter an option: ");
		int menu_input = input.nextInt();
		switch(menu_input){
		case 1: System.out.println(inAppDisplay());
				System.out.println("Enter the last day you saw your period: ");
				int flowDateInput = input.nextInt();
				int flowCheck = calculateFlowDate(flowDateInput);
				System.out.println("Your next flow date is " + flowCheck + " days time");
				break;
		case 2: System.out.println(inAppDisplay());
				System.out.println("Enter the last day you saw your period: ");
				int safePeriodInput = input.nextInt();
				int preOvulationConstant = 7;
				int postOvulationConstant = 15;
				int postOvulationConstant2 = 28;
				if(safePeriodInput > 0 && safePeriodInput <= preOvulationConstant){
					int calculatePreOvulation = preOvulationConstant -  safePeriodInput;
					System.out.println("You are on your safe period");
					System.out.println("You have " + calculatePreOvulation + "days left till the end of your safe period");}
				else if(safePeriodInput > 7 && safePeriodInput < postOvulationConstant){
						int calculatePostOvulation = postOvulationConstant -safePeriodInput;
						System.out.println("You have " + calculatePostOvulation + " days left to enter your safe period");}
				else if(safePeriodInput > 14 && safePeriodInput <= 28){
					int calculatePostOvulation2 = postOvulationConstant2 - safePeriodInput;
						System.out.println("You are currently on your safe period");
						System.out.println("You have " + calculatePostOvulation2 + " days left till the end of your period");}
				else 
					System.out.printf("%s\n%s","The day you entered is not within my expertise", "I recommend you go see a doctor");
					break;
		case 3: System.out.println(inAppDisplay());
				System.out.println("Enter the last day you saw your period: ");
				int ovulationTimeInput =  input.nextInt();
				if(calculateOvulationTime(ovulationTimeInput) == -1){
					System.out.println("Invalid day");break;}
				int ovulationCheck = calculateOvulationTime(ovulationTimeInput);
					System.out.println("Your next ovulation is in " + ovulationCheck + " days time");
				break;	
		case 0: System.out.println("Alright bye!");
				break;
		default: System.out.println("Invalid input"); 
		}			
				}
			}
			}
			