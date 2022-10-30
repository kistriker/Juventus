import javax.swing.*;
import java.awt.*;

public class Lazio {
    public static void test() {
        ImageIcon dabIcon = new ImageIcon("src//lazio.png");
        Image dabImage = dabIcon.getImage();
        Image modifiedDabImage = dabImage.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
        dabIcon = new ImageIcon(modifiedDabImage);

        JOptionPane.showMessageDialog(null,"Losers!","Lazio Roma",JOptionPane.INFORMATION_MESSAGE,dabIcon);
    }
}
