var prompt = require('prompt-sync')();
new_score = []
new_total = []
new_average = []

let space_score = ""
let space_sub = ""
let sum = 0
let average = 0
var student_input = prompt('How many Student do you have? ')
var subject_input = prompt('How many Subject do the offer? ')

for(index = 1; index <= student_input; index++){
	space_score = ""
	sum = 0
	average = 0
	for(inner = 1; inner <= subject_input; inner++){
console.log('Entering score for student' + index)
let user_input1 = parseInt(prompt('Enter score for subject: '))
	space_score += user_input1 + " "
	sum += user_input1
	
}
	new_score.push(space_score)
	new_total.push(sum)
	average = sum/subject_input
	new_average.push(average)
}

for(index = 1; index <= subject_input; index++){
	space_sub += "SUB"+index + " "}
console.log("STUDENT" + "\t" + space_sub + "\t" + "TOTAL" + "\t" + "AVERAGE" + "\t" + "POSITION")
for(index = 1; index <= student_input; index++){
console.log("Student"+index + "\t" + new_score[index - 1] + "\t" + new_total[index - 1] + "\t" + new_average[index - 1])
}