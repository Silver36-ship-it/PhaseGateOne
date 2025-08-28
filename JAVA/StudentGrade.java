import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrade{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

ArrayList<String> newScore = new ArrayList<>();
ArrayList<Integer> newTotal = new ArrayList<>();
ArrayList<Integer> newAverage = new ArrayList<>();

String spaceScore = "";
String spaceSub = "";
int sum = 0;
int average = 0;
System.out.println("How many Student do you have? ");
int studentInput = input.nextInt();
System.out.println("How many Subject do the offer? ");
int subjectInput = input.nextInt();

for(int index = 1; index <= studentInput; index++){
	spaceScore = "";
	sum = 0;
	average = 0;
	for(int inner = 1; inner <= subjectInput; inner++){
		System.out.println("Entering score for student" + index);
		System.out.println("Enter score for subject: ");
		int userInput1 = input.nextInt();
		spaceScore += userInput1 + " ";
		sum += userInput1;
	}
	newScore.add(spaceScore);
	newTotal.add(sum);
	average = sum/subjectInput;
	newAverage.add(average);
}

for(int index = 1; index <= subjectInput; index++){
	spaceSub += "SUB"+index + " ";}

System.out.println("STUDENT" + "\t" + spaceSub + "\t" + "TOTAL" + "\t" + "AVERAGE" + "\t" + "POSITION");
for(int index = 1; index <= studentInput; index++){
System.out.println("Student"+index + "\t" + newScore.get(index - 1) + "\t" + newTotal.get(index - 1) + "\t" + newAverage.get(index - 1));
}
}
}