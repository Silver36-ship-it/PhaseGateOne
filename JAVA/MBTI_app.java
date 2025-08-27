import java.util.Scanner;
import java.util.ArrayList;
public class MBTI_app {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
ArrayList<ArrayList<String>> questions = new ArrayList<>();

ArrayList<Character> first_personalityCombo = new ArrayList<>();
ArrayList<Character> second_personalityCombo = new ArrayList<>();
ArrayList<Character> third_personalityCombo = new ArrayList<>();
ArrayList<Character> fourth_personalityCombo = new ArrayList<>();

ArrayList<String> question1 = new ArrayList<>();
	question1.add("A. expend energy, enjoy groups");
	question1.add("B. conserve energy, enjoy one-on-one");
	questions.add(question1);
	
ArrayList<String> question2 = new ArrayList<>();
	question2.add("A. Interpret literally");
	question2.add("B. look for meaning and possibilities");
	questions.add(question2);
	
ArrayList<String> question3 = new ArrayList<>();
	question3.add("A. logical, thinking, questioning");
	question3.add("B. empathetic, feeling, accommodating");
	questions.add(question3);
 
ArrayList<String> question4 = new ArrayList<>();
	question4.add("A. organized, orderly");
	question4.add("B. flexible,adaptable");
	questions.add(question4);
	
ArrayList<String> question5 = new ArrayList<>();
	question5.add("A. more outgoing, think out loud");
	question5.add("B. more reserved, think to yourself");
	questions.add(question5);
	
ArrayList<String> question6 = new ArrayList<>();
	question6.add("A. practical, realistic, experiential");
	question6.add("B. imaginative, innovative, theoretical"); 
	questions.add(question6);
	
ArrayList<String> question7 = new ArrayList<>();
	question7.add("A. candid, straight forward, frank");
	question7.add("B. tactful, kind, encouraging");
	questions.add(question7);
	
ArrayList<String> question8 = new ArrayList<>();
	question8.add("A. plan, schedule");
	question8.add("B. unplanned, spontaneous");
	questions.add(question8);
	
ArrayList<String> question9 = new ArrayList<>();
	question9.add("A. seek many tasks, public activities, interaction with others");
	question9.add("B. seek private, solitary activities with quiet to concentrate");
	questions.add(question9);
	
ArrayList<String> question10 = new ArrayList<>();
	question10.add("A. standard, usual, conventional");
	question10.add("	B. different,novel,unique");
	questions.add(question10);
	
ArrayList<String> question11 = new ArrayList<>();
	question11.add("A. firm,tend to criticize, hold the line");
	question11.add("B. gentle, tend to appreciate, consiliate");
	questions.add(question11);
	
ArrayList<String> question12 = new ArrayList<>();
	question12.add("A. regulated, structured");
	question12.add("B. easy-going,live and let live");
	questions.add(question12);
	
ArrayList<String> question13 = new ArrayList<>();
	question13.add("A. external, communicative, express yourself");
	question13.add("B. internal,reticent,keep to yourself");
	questions.add(question13);
	
ArrayList<String> question14 = new ArrayList<>();
	question14.add("A. focus on here-and-now");
	question14.add("B. look to the future, global perspective,big picture");
 	questions.add(question14);
 	
ArrayList<String> question15 = new ArrayList<>();
	question15.add("A. tough-minded, just");
	question15.add("B. tender-hearted, merciful"); 
	questions.add(question15); 
	
ArrayList<String> question16 = new ArrayList<>();
	question16.add("A. preparation, plan ahead");
	question16.add("B. go with the flow, adapt as you go");
	questions.add(question16);
	
ArrayList<String> question17 = new ArrayList<>();
	question17.add("A. active, initiate");
	question17.add("B. reflective, deliberate");
 	questions.add(question17);
 	
ArrayList<String> question18 = new ArrayList<>();
	question18.add("A. facts, things, what is");
	question18.add("B. ideas, dreams, what could be, philosophical"); 
	questions.add(question18);
	
ArrayList<String> question19 = new ArrayList<>();
	question19.add("A. matter of fact, issue-oriented");
	question19.add("B. sensitive, people-oriented, compassionate"); 
	questions.add(question19);
	
ArrayList<String> question20 = new ArrayList<>();
	question20.add("A. control, govern");
	question20.add("B. latitude, freedom"); 
	questions.add(question20); 


int count_firstAnswerA = 0;
int count_firstAnswerB  = 0;

int count_secondAnswerA = 0;
int count_secondAnswerB = 0; 

int count_thirdAnswerA = 0;
int count_thirdAnswerB = 0;

int count_fourthAnswerA = 0;
int count_fourthAnswerB = 0;

ArrayList<String> displayOptions = new ArrayList<>();
ArrayList<String> displayOptions2 = new ArrayList<>();

for(int index = 0; index < questions.size(); index++){
System.out.println("Q :" + questions.get(index));
System.out.println("Choose A or B");
char userChar = input.nextLine().charAt(0);

if(index == 0 || index == 4 || index == 8 || index == 12  || index == 16){
	if(Character.toUpperCase(userChar) == 'A'){
		displayOptions.add(questions.get(index).get(0) + "\n");
		count_firstAnswerA++;}		
	else if(Character.toUpperCase(userChar)  == 'B'){
		displayOptions.add(questions.get(index).get(1) + "\n");
		count_firstAnswerB++;}
	first_personalityCombo.add(userChar);}
else if(index == 1 || index == 5 || index == 9 || index == 13 || index == 17){
	if(Character.toUpperCase(userChar) == 'A'){
		displayOptions2.add(questions.get(index).get(0) + "\n");
		count_secondAnswerA++;}
	else if(Character.toUpperCase(userChar) == 'B'){
		displayOptions2.add(questions.get(index).get(1) + "\n");
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
		System.out.println("ESTJ");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ENTJ");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("ENTP");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ENFJ");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("ENFP");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ESFJ");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("ESTP");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ESFP");}
		
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("INTJ");}
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("INTP");}
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("INFJ");}
	else if(count_firstAnswerA < count_firstAnswerB && count_secondAnswerA < count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("INFP");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ISTJ");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ISFJ");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA > count_thirdAnswerB && count_fourthAnswerA < count_fourthAnswerB){
		System.out.println("ISTP");}
	else if(count_firstAnswerA > count_firstAnswerB && count_secondAnswerA > count_secondAnswerB && count_thirdAnswerA < count_thirdAnswerB && count_fourthAnswerA > count_fourthAnswerB){
		System.out.println("ISFP");}

System.out.println(displayOptions);
System.out.println("Number of A selected: " + count_firstAnswerA);
System.out.println("Number of B selected: " + count_firstAnswerB);
System.out.println();
System.out.println(displayOptions2);
System.out.println(count_firstAnswerA);
System.out.println(count_firstAnswerB);
System.out.println(first_personalityCombo);
System.out.println(second_personalityCombo);
System.out.println(third_personalityCombo);
System.out.println(fourth_personalityCombo);
}
}

