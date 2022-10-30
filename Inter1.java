import javax.swing.*;
import java.awt.*;

public class Inter1 {
    private JPanel panel1;

    //JFrame frame;
    //JLabel displayField;
    //ImageIcon image;
        public static void test() {
            ImageIcon dabIcon = new ImageIcon("src//inter.png");
            Image dabImage = dabIcon.getImage();
            Image modifiedDabImage = dabImage.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
            dabIcon = new ImageIcon(modifiedDabImage);
            //JOptionPane.showMessageDialog(null,"Dab on the haters!","Display Image",JOptionPane.INFORMATION_MESSAGE,dabIcon);
            JOptionPane.showMessageDialog(null,"Losers!","Inter Milano",JOptionPane.INFORMATION_MESSAGE,dabIcon);
        }

}
