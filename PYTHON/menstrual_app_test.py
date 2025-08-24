import unittest
import function_menstrual_app

class TestWelcomePageFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		function_menstrual_app.display_welcome_page()
	def test_that_the_function_returns_only_string(self):
		result = function_menstrual_app.display_welcome_page()
		self.assertIsInstance(result,str, "The function did not return a string")
		
class TestMenuPageFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		function_menstrual_app.menuPage()
	def test_that_the_function_returns_only_string(self):
		result =  function_menstrual_app.menuPage()
		self.assertIsInstance(result,str)
		
class TestFlowDateFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		function_menstrual_app.calculate_flow_date(2)
	def test_that_the_function_returns_only_integer(self):
		self.assertRaises(ValueError,function_menstrual_app.calculate_flow_date,"string")
	def test_that_the_function_does_not_return_negative_value(self):
		self.assertRaises(ValueError,function_menstrual_app.calculate_flow_date,-3)
		
class TestOvulationTimeFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		function_menstrual_app.calculate_ovulation_time(3)
	def test_that_the_function_returns_only_integer(self):
		self.assertRaises(ValueError,function_menstrual_app.calculate_ovulation_time,"string")
	def test_that_the_function_does_not_return_negative_value(self):
		self.assertRaises(ValueError,function_menstrual_app.calculate_ovulation_time,-3)
		
class TestInAppDisplayFunction(unittest.TestCase):
	def test_that_the_function_exist(self):
		function_menstrual_app.in_app_display()
	def test_that_the_function_returns_only_string(self):
		result = function_menstrual_app.in_app_display()
		self.assertIsInstance(result,str)		
		