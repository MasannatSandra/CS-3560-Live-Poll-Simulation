package simulationdrive;

import java.util.Random;

public class SimulationDrive {

    public static void main(String[] args) {
        Random num=new Random();
        int studentSize=num.nextInt(10)+1; //Randomly generate a # of students between 1-10
        Student students=new Student(); //Create object from student class
        System.out.println("Welcome! We are currently configuring the number of students "
                + "playing and the questions bank");
        System.out.println("There are " +studentSize + " students this game!");
        for(int x=1; x<=studentSize; x++){ //Print each students ID # and their name
            students.createID(); //use createID method from student class
            System.out.print(students.getID() + ": "); //read ID and get
            students.createNames(x); //use createNames method to generate x # of names
            System.out.println(students.getNames());  //get and print name
        }
        Question q=new Question(); //Create question object to use method from class
        VotingService ivote=new VotingService(); //create object from voting
        System.out.println();
        System.out.println("Question #1"); //2 choice only, 1 right ans
        q.printAndriodApple();
        for(int x=1; x<=studentSize; x++){ //Have studentSize amount of people answer the question
            students.createNames(x); //associate which student answered what
            students.right_or_wrong(); //student choice (t or f)
            ivote.changeAnswer(students.getNames(), 1); //randomize if they changed their answer or not
            //Print what they choose
            System.out.println(students.getNames() + " choose " + students.get_right_or_wrong());
            ivote.right_wrong_ans(students.get_right_or_wrong()); //if students was correct or not
        }
        System.out.println();
        ivote.phoneStat(); //overall stat for that q
        
        System.out.println();
        System.out.println("Question #2"); //multiple choice, one ans
        q.printAmongUs(); //print actual q
        for(int x=1; x<=studentSize; x++){ //Have studentSize amount of people answer the question
            students.createNames(x); //associate which student answered what
            students.setOption(); //student choice (A-E)
            ivote.changeAnswer(students.getNames(), 2); ///randomize if they changed their answer or not
            //Print what they choose
            System.out.println(students.getNames() + " choose " + students.getAnswer() );
            ivote.amongUsAns(students.getAnswer()); //Check if students was correct or not

        }
        System.out.println();
        ivote.amongUsStat(); //overall stat for that q
        
        System.out.println();
        System.out.println("Question #3"); //multiples choices, multiple ans
        q.printFastFashion();
        for(int x=1; x<=studentSize; x++){ //Have studentSize amount of people answer the question
            students.createNames(x); //associate which student answered what
            students.setMCsAns(); //student choice, can choose multiple (A-E) 
            ivote.changeAnswer(students.getNames(), 3); //randomize if they changed their ans or not
            //Print what they choose
            System.out.println(students.getNames() + " choose " + students.getMCS());
            ivote.fastFashionAns(students.getMCS());  //Check if students were correct or not     

        }
        System.out.println();
        ivote.FastFashionStat(); //overall stat for that q
        
        System.out.println();   
        System.out.println("Question #4"); //multiples choices, 1 ans
        q.printFruit();
        for(int x=1; x<=studentSize; x++){ //Have studentSize amount of people answer the question
            students.createNames(x); //associate which student answered what
            students.setMCsAns(); //student choice (A-E) can choose multiple 
            ivote.changeAnswer(students.getNames(), 4); //randomize if they changed their ans or not
            //Print what they choose
            System.out.println(students.getNames() + " choose " + students.getMCS());
            ivote.fruitAns(students.getMCS()); //Check if students were correct or not        
        }
        System.out.println();
        ivote.FruitStat(); //overall stat for that q
    }
}