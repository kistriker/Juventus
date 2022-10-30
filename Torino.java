import javax.swing.*;
import java.awt.*;

public class Torino {
    public static void test() {
        ImageIcon dabIcon = new ImageIcon("src//torino1.png");
        Image dabImage = dabIcon.getImage();
        Image modifiedDabImage = dabImage.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
        dabIcon = new ImageIcon(modifiedDabImage);
        //JOptionPane.showMessageDialog(null,"Dab on the haters!","Display Image",JOptionPane.INFORMATION_MESSAGE,dabIcon);
        JOptionPane.showMessageDialog(null,"Losers!","Torino",JOptionPane.INFORMATION_MESSAGE,dabIcon);
    }
}
