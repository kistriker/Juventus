import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Fotbalist.Rivale;

import java.net.URI;
public class Juventus1 {
    private JLabel Image;
    private JPanel panel;

    public Juventus1() {
    }

    public static void test() throws Exception {
        //JFrame frame = new JFrame("Napoli");
        //frame.setSize(300, 325);
        //frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.juventus.com/en/"));
        //frame.pack();
        //frame.setVisible(true);
    }
}