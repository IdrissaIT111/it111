import javax.swing. *;
public class SimpleWindow extends JFrame {

    // no main method
    // Constructor - special method that displays attributes of class

    public SimpleWindow() {
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window.");

        setSize( WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }


}
