new_score = []
new_total = []
new_average = []

space_score = ""
space_sub = ""
sum = 0
average = 0
student_input = int(input('How many Student do you have? '))
subject_input = int(input('How many Subject do the offer? '))

for number in range(student_input):
	space_score = ""
	sum = 0
	average = 0
	for score in range(subject_input):
		print('Entering score for student',score)
		user_input1 = int(input('Enter score for subject: '))
		space_score += user_input1 + " "
		sum += user_input1	
	new_score.append(space_score)
	new_total.append(sum)
	average = sum/subject_input
	new_average.append(average)

for index in range (subject_input):
	space_sub += "SUB"+index + " "
	print("STUDENT" + "\t" + space_sub + "\t" + "TOTAL" + "\t" + "AVERAGE" + "\t" + "POSITION")
for index in range(student_input):
	print("Student"+index + "\t" + new_score[index - 1] + "\t" + new_total[index - 1] + "\t" + new_average[index - 1])
