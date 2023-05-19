import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {
    public static void main(String[] args) {
//        declare our variables;
//        we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

//
//        set the title of the window
        JFrame window = new JFrame();
        window.setTitle("A Simple Window");

//        set the size of the window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        set the color of the window
        window.getContentPane().setBackground(Color.red);


        JLabel myLabel = new JLabel("My First Big Label!!!");
        myLabel.setFont(new Font("Times", Font.PLAIN, 24));
        myLabel.setBounds(50,50,200,30);
        window.add(myLabel);


        JTextField input1 = new JTextField();
        input1.setBounds(50, 90, 200, 30);
        window.add(input1);


        JLabel myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setFont(new Font("Times", Font.BOLD, 16));
        myLabel2.setBounds(50,150,200,20);
        window.add(myLabel2);


        JTextField input2 = new JTextField();
        input2.setBounds(50, 180, 200, 20);
        window.add(input2);

//        display what is set above
        window.setLayout(null);

//        set the window location
        window.setLocationRelativeTo(null);

//        displaying the window is a boolean
        window.setVisible(true);

    }
}