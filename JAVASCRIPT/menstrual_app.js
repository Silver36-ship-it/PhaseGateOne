var prompt = require('prompt-sync')();
function displayDates(){
date =`		1  2  3  4  5  6  7 
		8  9  10 11 12 13 14
		15 16 17 18 19 20 21
		22 23 24 25 26 27 28
		29 30 31 `
	return date}
	//console.log(displayDates())
	
function displayWelcomePage(){
	displayPage = `		
		Welcome to the Menstrual app!!!
		Only works for regular cycle(28-day period)
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

function calculateSafePeriod(safe_period_input){
	pre_ovulation_constant = 7
	post_ovulation_constant = 15
	post_ovulation_constant2 = 28
	if(safe_period_input > 0 && safe_period_input <= 7){
		return pre_ovulation_constant -  safe_period_input}
	else if(safe_period_input > 7 && safe_period_input < post_ovulation_constant){
		return post_ovulation_constant - safe_period_input}
	else if(safe_period_input > 14 && safe_period_input <= 28){
		return post_ovulation_constant2 - safe_period_input}
	else 
		return "Not a valid day"}

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
			your period last `
	return displayFlow}
				
			

	console.log(displayWelcomePage())
	var user_input = prompt('Enter 1: ')
	if (user_input == 1){
		console.log(menuPage())}
		var menu_input = prompt('Enter an option: ')
		switch(parseInt(menu_input)){
		case 1: console.log(inAppDisplay());
			var flowDate_input = prompt('Enter the last day you saw your period: ')
				let flow_check = calculateFlowDate(flowDate_input);
				console.log("Your next flow date is " + flow_check + " days time");
				break;
		case 2: console.log(inAppDisplay());
			var safePeriod_input = prompt('Enter the last day you saw your period: ')
				let safe_periodCheck = calculateSafePeriod(safePeriod_input);
				console.log(calculateSafePeriod(safe_periodCheck));
			break;
		case 3: console.log(inAppDisplay());
			var ovulationTime_input = prompt('Enter the last day you saw your period: ')
			let ovulation_check = calculateOvulationTime(ovulationTime_input);
			console.log("Your next ovulation is in " + ovulation_check + " days time");
				break;	
		case 0: console.log("Alright bye!");
				break;
		}			
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				






