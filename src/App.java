import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello, World!"); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the window
        frame.setSize(300, 300); // set the size of the window
        frame.setResizable(false); // disable resizing
        frame.setLocationRelativeTo(null); // center the window
        frame.setVisible(true); // make the window visible
        ImageIcon image = new ImageIcon("cycling.png"); // set the icon of the window
        frame.setIconImage(image.getImage()); // set the icon of the window
        frame.getContentPane().setBackground(Color.BLUE); // set the background color of the window
    }
}
