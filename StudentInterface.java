package simulationdrive;

import java.util.ArrayList;

//put everything that belongs to student in a interface
//ID, Name, their answer/option
public interface StudentInterface {
    public void createID(); //generate a random ID of 6 digits
    public String getID(); //return the ID made
    public void createNames(int numberStudents); //numberStudents determine by rand in driver
    public String getNames();
    public void setOption();
    public char getAnswer();
    public void setMCsAns();
    public ArrayList getMCS(); //return multiple choices that been selected
    public void right_or_wrong(); //generate random right/wrong for student to select
    public String get_right_or_wrong();

    
}
