import javax.swing. *;
public class ShowWindow {

    public static void main(String[]args){
        // declare our variables
        // we are going to make them constants

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        //create window

        JFrame window = new JFrame();
        // set title
        window.setTitle("My Simple Window");

        //setting the size of window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close window and exit program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display window
        // displaying window is a boolean
        window.setVisible(true);


    }
}
