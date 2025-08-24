var prompt = require('prompt-sync')();
	
function displayWelcomePage(){
	displayPage = `		
		Welcome to the Menstrual app!!!
		
Note: This app only works for regular cycle(28-day period)
		
		press 1 to enter if eligible`
	return displayPage}

function menuPage(){
	displayMenu =`
				1. Flow date
				2. Safe period
				3. Ovulation time
				0. To exit the app
					`
	return displayMenu}
	
function calculateFlowDate(date_input){
return 28 - date_input}

function calculateOvulationTime(ovulation_input){
	ovulation_constant = 14
	cycle_constant = 28
	if(ovulation_input > 0 && ovulation_input <= 14){
		return ovulation_constant - ovulation_input}
	else if(ovulation_input > 14 && ovulation_input <= 28){
		return 28 - ovulation_input + ovulation_constant
		}
		}

function inAppDisplay(){
displayFlow = `
			Welcome!!!
			Enter the day you saw
			your period last
			 `
	return displayFlow
	}
				
	var user_input;		
	console.log(displayWelcomePage())
	 user_input = prompt('Enter 1: ')
	if(user_input == 1){
		console.log(menuPage())
		var menu_input = prompt('Enter an option: ')
		switch(parseInt(menu_input)){
		case 1: console.log(inAppDisplay());
			var flowDate_input = prompt('Enter the last day you saw your period: ')
				let flow_check = calculateFlowDate(flowDate_input);
				console.log("Your next flow date is " + flow_check + " days time");
				break;
		case 2: console.log(inAppDisplay());
			var safePeriod_input = prompt('Enter the last day you saw your period: ')
				pre_ovulation_constant = 7
				post_ovulation_constant = 15
				post_ovulation_constant2 = 28
				if(safePeriod_input > 0 && safePeriod_input <= pre_ovulation_constant){
					calculate_pre_ovulation = pre_ovulation_constant -  safePeriod_input
					console.log("You are on your safe period");
					console.log("You have " + calculate_pre_ovulation + "days left till the end of your safe period")}
				else if(safePeriod_input > 7 && safePeriod_input < post_ovulation_constant){
					calculate_post_ovulation = post_ovulation_constant -safePeriod_input
					console.log("You have " + calculate_post_ovulation + " days left to enter your safe period")}
				else if(safePeriod_input > 14 && safePeriod_input <= 28){
					calculate_post_ovulation2 = post_ovulation_constant2 - safePeriod_input
					console.log("You are currently on your safe period")
					console.log("You have " + calculate_post_ovulation2 + " days left till the end of your period")}
				else 
					console.log(`${"The day you entered is not within my expertise"}\nI recommend you go see a doctor`);
					break;
		case 3: console.log(inAppDisplay());
			var ovulationTime_input = prompt('Enter the last day you saw your period: ')
			let ovulation_check = calculateOvulationTime(ovulationTime_input);
			console.log("Your next ovulation is in " + ovulation_check + " days time");
				break;	
		case 0: console.log("Alright bye!");
				break; 
		}			
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				






