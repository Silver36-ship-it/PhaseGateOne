import java.util.Scanner;
import java.util.ArrayList;
public class MBTI_app {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
ArrayList<String> question = new ArrayList<>();
ArrayList<Character> answers = new ArrayList<>();
ArrayList<Character> first_personalityCombo = new ArrayList<>();
ArrayList<Character> second_personalityCombo = new ArrayList<>();
ArrayList<Character> third_personalityCombo = new ArrayList<>();
ArrayList<Character> fourth_personalityCombo = new ArrayList<>();
question.add("A. expend energy, enjoy groups, B. conserve energy, enjoy one-on-one");
question.add("A. Interpret literally, B. look for meaning and possibilities");
question.add("A. logical, thinking, questioning, B. empathetic, feeling, accommodating");
question.add("A. organized, orderly, B. flexible,adaptable");
question.add("A. more outgoing, think out loud, B. more reserved, think to yourself");
question.add("A. practical, realistic, experiential, B. imaginative, innovative, theoretical");
question.add("A. candid, straight forward, frank, B. tactful, kind, encouraging");
question.add("A. plan, schedule, B. unplanned, spontaneous");
question.add("A. seek many tasks, public activities, interaction with others, B. seek private, solitary activities with quiet to concentrate");
question.add("A. standard, usual, conventional, B. different,novel,unique");
question.add("A. firm,tend to criticize, hold the line, B. gentle, tend to appreciate, consiliate");
question.add("A. regulated, structured, B. easy-going,live and let live");
question.add("A. external, communicative, express yourself, B. internal,reticent,keep to yourself");
question.add("A. focus on here-and-now, B. look to the future, global perspective,big picture");
question.add("A. tough-minded, just, B. tender-hearted, merciful");
question.add("A. preparation, plan ahead, B. go with the flow, adapt as you go");
question.add("A. active, initiate, B. reflective, deliberate");
question.add("A. facts, things, what is, B. ideas, dreams, what could be, philosophical");
question.add("A. matter of fact, issue-oriented, B. sensitive, people-oriented, compassionate");
question.add("A. control, govern, B. latitude, freedom");

int count_firstAnswerA = 0;
int count_firstAnswerB  = 0;

int count_secondAnswerA = 0;
int count_secondAnswerB = 0; 

int count_thirdAnswerA = 0;
int count_thirdAnswerB = 0;

int count_fourthAnswerA = 0;
int count_fourthAnswerB = 0;

for(int index = 0; index < question.size(); index++){
System.out.println("Q :" + question.get(index));
System.out.println("Choose A or B");
char userChar = input.nextLine().charAt(0);

if(index == 0 || index == 4 || index == 8 || index == 12  || index == 16){
	if(Character.toUpperCase(userChar) == 'A'){
		count_firstAnswerA++;}		
	else if(Character.toUpperCase(userChar)  == 'B'){
		count_firstAnswerB++;}
	first_personalityCombo.add(userChar);}
else if(index == 1 || index == 5 || index == 9 || index == 13 || index == 17){
	if(Character.toUpperCase(userChar) == 'A'){
		count_secondAnswerA++;}
	else if(Character.toUpperCase(userChar) == 'B'){
		count_secondAnswerB++;}
		second_personalityCombo.add(userChar);}
else if(index == 2 || index == 6 || index == 10 || index == 14 || index == 18){
	if(Character.toUpperCase(userChar) == 'A'){
		count_thirdAnswerA++;}
	else if(Character.toUpperCase(userChar) == 'B'){
		count_thirdAnswerB++;}
	third_personalityCombo.add(userChar);}
else if(index == 3 || index == 7 || index == 11 || index == 15 || index == 19){
	if(Character.toUpperCase(userChar) == 'A'){
		count_fourthAnswerA++;}
	else if(Character.toUpperCase(userChar) == 'B'){
		count_fourthAnswerB++;}
		fourth_personalityCombo.add(userChar);}
	}
	
	if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("E S T J");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("E N T J");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("E N T P");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("E N F J");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("E N F P");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("E S F J");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("E S T P");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("E S F P");}
		
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("I N T J");}
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("I N T P");}
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("I N F J");}
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("I N F P");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("I S T J");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("I S F J");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("I S T P");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("I S F P");}

System.out.println(count_firstAnswerA);
System.out.println(count_firstAnswerB);
System.out.println(first_personalityCombo);
System.out.println(second_personalityCombo);
System.out.println(third_personalityCombo);
System.out.println(fourth_personalityCombo);
}
}

