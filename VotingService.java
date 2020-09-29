package simulationdrive;
import java.util.ArrayList;
import java.util.Random;
//output overall statistic of each question here
public class VotingService extends Student {
    //keep track of each questions statistics
    //for SC, MC with choice
    private int optionA=0;
    private int optionB=0;
    private int optionC=0;
    private int optionD=0;
    private int optionE=0;
    //for right or wrong
    private int isRight=0; //1. Right
    private int isWrong=0; //2. Wrong
    //for MCs with "select all that apply"
    private int correct=0; //overall
    private int incorrect=0; //overall
    
    public void changeAnswer(String student, int qnum){ //if student wish to update their ans
        Random rand=new Random();
        boolean changeAnswer=rand.nextBoolean();
        if(changeAnswer==true){//comparing
            //state if and which student have changed their answer
            System.out.println(student + " has changed their answer!");
            //call it for each type of questions
            if(qnum ==1){ //right or wrong 
                right_or_wrong();
            }
            else if(qnum==2){ //SC
                setOption();
            }
            else if(qnum==3 || qnum==4){ //MCs
                setMCsAns();
            }
        }
    }
    public void right_wrong_ans(String tfoption){
        //Check correctness of each student's input/answer
        if(tfoption=="Right"){
            System.out.println("The student was correct!");
            isRight++; //for stat
        }
        else{
            System.out.println("Sorry you are incorrect!");
            isWrong++; //for stat
        }
    }
    public void phoneStat(){ //display stat for that q
        System.out.println("The correct answer is: Right.");
        System.out.println(isRight +" students have selected 1. Right.");
        System.out.println(isWrong +" students have selected 2. Wrong.\n");
    }
    public void amongUsAns(char option){ //Define answers and check correctness
        if(option=='A'){ //conditions
            System.out.println("Sorry you are incorrect!");
            optionA++; //keep track of how many students selected this option
        }
        else if(option=='B'){ //conditions
            System.out.println("Sorry you are incorrect!");
            optionB++;
        }
        else if(option=='D'){ //conditions
            System.out.println("Sorry you are incorrect!");
            optionD++;
        }
        else if(option=='E'){ //conditions
            System.out.println("Sorry you are incorrect!");
            optionE++;
        }
        else if(option=='C'){
            System.out.println("Nice! You are correct!");
            optionC++;
        }
    }
    public void amongUsStat(){ //overall stat for q2
        System.out.println("The correct answer is: C. 2018");
        System.out.println(optionA + " students have selected A. 2016");
        System.out.println(optionB + " students have selected B. 2017");
        System.out.println(optionC + " students have selected C. 2018");
        System.out.println(optionD + " students have selected D. 2019");
        System.out.println(optionE +" students have selected  E. 2020");
        //set option's variable back to 0 since I want to use them again
        optionA=0;
        optionB=0;
        optionC=0;
        optionD=0;
        optionE=0;
    }       
    public void fastFashionAns(ArrayList Choices){
        //contains check what ans the arraylist hold
        if(Choices.contains("A")){ //conditions
            optionA++;
        }
        if(Choices.contains("B")){ //conditions
            optionB++;
        }
        if(Choices.contains("C")){ //conditions
            optionC++;
        }
        if(Choices.contains("D")){ //conditions
            optionD++;
        }
        if(Choices.contains("E")){ //conditions
            optionE++;
        }
        if(Choices.contains("A") || Choices.contains("B") || Choices.contains("C")
                || Choices.contains("D") || Choices.contains("E")){
            System.out.println("Sorry you are incorrect!");
            incorrect++; //keep track of how many was wrong
        }
        //only correct condition possible
        else if(Choices.contains("B") && Choices.contains("D")){
            System.out.println("Nice! You are correct!");
            optionB++;
            optionD++;
            correct++; //only time you can be completely correct
        }
    }
    public void FastFashionStat(){ //overall stat for this q
        System.out.println("The correct answer is: B. Reformation D. Levi's");
        System.out.println(correct + " students have selected B & D which is correct");
        System.out.println(incorrect + " students have answered incorrectly.");
        System.out.println(optionA + " students have selected A. Zara");
        System.out.println(optionB + " students have selected B. Reformation");
        System.out.println(optionC + " students have selected C. Forever 21");
        System.out.println(optionD + " students have selected D. Levi's");
        System.out.println(optionE + " students have selected E. Uniqlo");
        //reset variables to 0 so it doesn't save for future methods
        optionA=0;
        optionB=0;
        optionC=0;
        optionD=0;
        optionE=0;
        correct=0;
        incorrect=0;
    }
    public void fruitAns(ArrayList Choices){ //can select multiple choices hence arraylist
        if(Choices.contains("A")){
            optionA++;
        }
        if(Choices.contains("B")){ //conditions
            optionB++;
        }
        if(Choices.contains("C")){ //conditions
            optionC++;
        }
        if(Choices.contains("D")){ //conditions
            optionD++;
        }
        if(Choices.contains("E")){ //conditions
            optionE++;
        }
        if(Choices.contains("B") || Choices.contains("C") || Choices.contains("D")
                || Choices.contains("E")){
            System.out.println("Sorry you are incorrect!");
            incorrect++;
        }
        else if(Choices.contains("A")){
            System.out.println("Nice! You are correct!");
            optionA++;
            correct++;
        }
    }
    public void FruitStat(){ //overall Stat for this q
        System.out.println("The correct answer is: A. Apple.");
        System.out.println(correct + " students have choosen correctly!");
        System.out.println(incorrect + " students have answered incorrectly.");
        System.out.println(optionA + " students have selected A. Apple");
        System.out.println(optionB + " students have selected B. Cauliflower");
        System.out.println(optionC + " students have selected C. Potato");
        System.out.println(optionD + " students have selected D. Lettuce");
        System.out.println(optionE +" students have selected  E. Eggplant");
        //reset variables to 0 so it doesn't save the number for future use
        optionA=0;
        optionB=0;
        optionC=0;
        optionD=0;
        optionE=0;
        correct=0;
        incorrect=0;
    } 
}
