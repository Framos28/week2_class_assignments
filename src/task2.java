import javax.swing.*;

//Write a program using the JOption Pane class for input and output, that will ask the user to enter 4 test
//scores. Output each test score, and the average score.
public class task2 {
    public static void main(String[] args) {

        double test1,test2,test3,test4;
        String input;


        input = JOptionPane.showInputDialog("Please enter the first score");
        test1 = Double.parseDouble(input);//converts string value from input into a double

        input = JOptionPane.showInputDialog("Please enter the second score");
        test2 = Double.parseDouble(input);//converts string value from input into a double

        input = JOptionPane.showInputDialog("Please enter the third score");
        test3 = Double.parseDouble(input);//converts string value from input into a double

        input = JOptionPane.showInputDialog("Please enter the fourth score");
        test4 = Double.parseDouble(input);//converts string value from input into a double

        double average = (test1+test2+test3+test4)/4.0;

        JOptionPane.showMessageDialog(null,"The score for test1 is: "+test1);

        JOptionPane.showMessageDialog(null,"The score for test2 is: "+test2);

        JOptionPane.showMessageDialog(null,"The score for test3 is: "+test3);

        JOptionPane.showMessageDialog(null,"The score for test4 is: "+test4);

        JOptionPane.showMessageDialog(null,"The average score for all the tests is: "+average);
    }
}
