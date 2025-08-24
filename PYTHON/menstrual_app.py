import function_menstrual_app
						
print(function_menstrual_app.display_welcome_page())
user_input = int(input('Enter 1: '))
if user_input == 1:
	print(function_menstrual_app.menuPage())
	menu_input = int(input('Enter an option: '))
	match menu_input:
		case 1: 
			print(function_menstrual_app.in_app_display())
			flowDate_input = int(input('Enter the last day you saw your period: '))
			flow_check = function_menstrual_app.calculate_flow_date(flowDate_input)
			print("Your next flow date is ",flow_check, " days time")
		case 2:
			print(function_menstrual_app.in_app_display())
			safePeriod_input = int(input('Enter the last day you saw your period: '))
			pre_ovulation_constant = 7
			post_ovulation_constant = 15
			post_ovulation_constant2 = 28
			if safePeriod_input > 0 and safePeriod_input <= pre_ovulation_constant:
				calculate_pre_ovulation = pre_ovulation_constant -  safePeriod_input
				print("You are on your safe period")
				print("You have ", calculate_pre_ovulation,"days left till the end of your safe period")
			elif safePeriod_input > 7 and safePeriod_input < post_ovulation_constant:
				calculate_post_ovulation = post_ovulation_constant -safePeriod_input
				print("You have ",calculate_post_ovulation, " days left to enter your safe period")
			elif safePeriod_input > 14 and safePeriod_input <= 28:
				calculate_post_ovulation2 = post_ovulation_constant2 - safePeriod_input
				print("You are currently on your safe period")
				print("You have ", calculate_post_ovulation2, " days left till the end of your period")
			else: 
				print("The day you entered is not within my expertise")
				print("I recommend you go see a doctor")
		case 3: 
			print(function_menstrual_app.in_app_display())
			ovulationTime_input = int(input('Enter the last day you saw your period: '))
			ovulation_check = calculate_ovulation_time(ovulationTime_input)
			print("Your next ovulation is in ", ovulation_check, " days time")
		case 0: print("Alright bye!")
		case _: print("Invalid input")
		
			
			
	