def display_welcome_page():
	display_page = """		
		Welcome to the Menstrual app!!!
		
Note: This app only works for regular cycle(28-day period)
		
		press 1 to enter if eligible """
	return display_page

def menuPage():
	display_menu ="""
				1. Flow date
				2. Safe period
				3. Ovulation time
				0. To exit the app
					"""
	return display_menu
	
def calculate_flow_date(date_input):
	if type(date_input) == str:
		raise ValueError
	if date_input <= 0:
		raise ValueError
	return 28 - date_input

def calculate_ovulation_time(ovulation_input):
	if type(ovulation_input) == str:
		raise ValueError
	if ovulation_input <= 0:
		raise ValueError
	ovulation_constant = 14
	cycle_constant = 28
	if ovulation_input > 0 and ovulation_input <= 14:
		return ovulation_constant - ovulation_input
	elif ovulation_input > 14 and ovulation_input <= 28:
		return 28 - ovulation_input + ovulation_constant

def in_app_display():
	display_flow = """
			Welcome!!!
			Enter the day you saw
			your period last
			 """
	return display_flow
