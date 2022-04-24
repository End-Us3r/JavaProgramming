package joptionpane_atkinsjames;
//James Atkins
//CSC-151-0901
//JOptionPane Project
//4-24-2022
import javax.swing.JOptionPane;

public class JOptionPane_AtkinsJames {
    
    //Write Method
    public static int calculateArea(int length, int width) {
        int area;
        area = (length * width);
        JOptionPane.showMessageDialog(null,"The Area is " + area + "!");
        return(0);
    }
    
    public static void main(String[] args) {
        String input;
        String name;
        int length;
        int width;
        //Get Length
        //Get Width
        //Calculate Area with Method
        name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null,"Hello, " + name + ", this program "
                + "is used to calculate an area!");
        
        input = JOptionPane.showInputDialog("What is the Length?");
        length = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("What is the Width?");
        width = Integer.parseInt(input);
        
        calculateArea(length, width);
        
    }
    
}