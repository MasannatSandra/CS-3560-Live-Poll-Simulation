package simulationdrive;
import java.util.Random;
import java.util.ArrayList;

public class Student extends SimulationDrive {
    private char option; //multiple choice, 1 option
    private String tfoption; //1. right 2. wrong
    private String name;
    private String IDnumber;
    ArrayList Choices=new ArrayList(); //for q with multiple choices


    public void createID(){ //generate a random ID of 6 digits
        Random num=new Random();
        int n=num.nextInt(900000)+100000;
        String storeID=Integer.toString(n);
        IDnumber=storeID; 
    }
    public String getID(){ //return the ID made
            return IDnumber;
    }
    public void createNames(int numberStudents){ //numberStudents determine by rand in driver
        //method will give the name depending on the student number
        if(numberStudents==1)
            name="Barack Obama";
        else if(numberStudents==2)
            name="Bob Ross";
        else if(numberStudents==3)
            name="John Cena";
        else if(numberStudents==4)
            name="Walt Disney";
        else if(numberStudents==5)
            name="Chuck Norris";        
        else if(numberStudents==6)
            name="Greta Thunberg";
        else if(numberStudents==7)
            name="Kanga";
        else if(numberStudents==8)
            name="Roo";
        else if(numberStudents==9)
            name="Eeyore";
        else if(numberStudents==10)
            name="Christopher Robin";  
    }
    public String getNames(){
        return name; //return the student names, size depends on StudentSize in driver
    }
    public void setOption(){
        //set options for the SC questions
        Random rand=new Random();
        int n=rand.nextInt(5)+1;
        if(n==1) //don't need if else statement since it one choice
            option='A';
        if(n==2)
            option='B';
        if(n==3)
            option='C';
        if(n==4)
            option='D';
        if(n==5)
            option='E'; 
    }
    public char getAnswer(){
        return option; //return the option that student selected
    }
    public void setMCsAns(){
        //for q with MC, select all that apply
        Choices.clear(); //so the arraylist wont store what the previous student selected
        Random rand=new Random();
        int MCOptions=rand.nextInt(5)+1; //how many options there are
            for(int x=0; x<MCOptions; x++){
                int ANS=rand.nextInt(5)+1; //what they selected
                if(ANS==1){
                    if(Choices.contains("A")) //associate int to choice letter
                        x++;
                    else
                        Choices.add("A");
                }
                if(ANS==2){
                    if(Choices.contains("B"))
                        x++;
                    else
                        Choices.add("B");
                }
                if(ANS==3){
                    if(Choices.contains("C"))
                        x++;
                    else
                        Choices.add("C");
                }
                if(ANS==4){
                    if(Choices.contains("D"))
                        x++;
                    else
                        Choices.add("D");
                }
                if(ANS==5){
                    if(Choices.contains("E"))
                        x++;
                    else
                        Choices.add("E");
                }
            }
    }
    public ArrayList getMCS(){ //return multiple choices that been selected
        return Choices;
    }
    public void right_or_wrong(){ //generate random right/wrong for student to select
        Random rand=new Random();
        int TF=rand.nextInt(2)+1;
        if(TF==1)
            tfoption="1. Right";
        else if(TF==2)
            tfoption="2. Wrong";
    }
    public String get_right_or_wrong(){
        return tfoption; //return choice they selected
    }  
}