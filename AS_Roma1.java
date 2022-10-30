import javax.swing.*;
import java.awt.*;

public class AS_Roma1 {
    public static void test() {
        ImageIcon dabIcon = new ImageIcon("src//roma.png");
        Image dabImage = dabIcon.getImage();
        Image modifiedDabImage = dabImage.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
        dabIcon = new ImageIcon(modifiedDabImage);

        JOptionPane.showMessageDialog(null,"Losers!","AS Roma",JOptionPane.INFORMATION_MESSAGE,dabIcon);
    }
}
