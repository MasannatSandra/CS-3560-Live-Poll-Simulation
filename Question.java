package simulationdrive;
import java.util.ArrayList;
//public class since there no need to override methods for an abstract class
public class Question extends SimulationDrive {
 
    public void printAndriodApple(){
        //print question for right or wrong
        System.out.println("Android is superior to Apple\n1. Right\n2. Wrong");
    }
    
    public void printAmongUs(){
        //Multiple choice question, single choice ans
        System.out.println("What year did Among Us Came out?"); 
        System.out.println("A. 2016\nB. 2017\nC. 2018\nD. 2019\nE. 2020");
    }
    
    public void printFastFashion(){
        //Select all that apply, Multiple choices, multiple ans
        System.out.println("Which clothing brand is not fast fashion? (Select all that apply)"); 
        System.out.println("A. Zara\nB. Reformation\nC. Forever 21\nD. Levi's\nE. Uniqlo");
    }
    
    public void printFruit(){
        //Select all that apply, multiple choices but only one right ans
        System.out.println("Which food is a fruit? (Select all that apply)"); 
        System.out.println("A. Apple\nB. Cauliflower\nC. Potato\nD. Lettuce"
                + "\nE. Eggplant");
    }
}