import javax.swing.*;
import java.awt.*;

public class Napoli1 {
    public static void test() {
        ImageIcon dabIcon = new ImageIcon("src//Napoli1.png");
        Image dabImage = dabIcon.getImage();
        Image modifiedDabImage = dabImage.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
        dabIcon = new ImageIcon(modifiedDabImage);
        JOptionPane.showMessageDialog(null,"Losers!","Napoli",JOptionPane.INFORMATION_MESSAGE,dabIcon);
    }
}
