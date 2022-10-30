import javax.swing.*;
import java.awt.*;

//public class AC_Milan extends JFrame{
public class AC_Milan{
    //JFrame frame;
    //JLabel displayField;
    //ImageIcon image;
    private JPanel panel1;
    private JLabel Milan;
    /*public AC_Milan() {
        frame = new JFrame("Image Display Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            image = new ImageIcon(getClass().getResource("ac milan.jfif"));
            displayField = new JLabel(image);
            frame.add(displayField);

        }catch(Exception e){
            System.out.println("Image cannot be found!");
        }
        frame.setSize(400, 400);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Image i = new Image();
    }*/
    /*public static void test() {
        JFrame frame = new JFrame("AC Milan");
        frame.setSize(300, 325);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/
    /*public static void main(String[] args) {
        JFrame frame = new JFrame("AC Milan");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/
    public static void test() {
        //ImageIcon dabIcon = new ImageIcon("ac milan.jfif");
        //ImageIcon dabIcon = new ImageIcon("src//ac milan1.jfif");
        //ImageIcon dabIcon = new ImageIcon("Images/ac milan1.png");
        ImageIcon dabIcon = new ImageIcon("src//ac milan1.png");
        Image dabImage = dabIcon.getImage();
        Image modifiedDabImage = dabImage.getScaledInstance(600,600,java.awt.Image.SCALE_SMOOTH);
        dabIcon = new ImageIcon(modifiedDabImage);
        //JOptionPane.showMessageDialog(null,"Dab on the haters!","Display Image",JOptionPane.INFORMATION_MESSAGE,dabIcon);
        JOptionPane.showMessageDialog(null,"Losers!","AC Milan",JOptionPane.INFORMATION_MESSAGE,dabIcon);
        //frame.setLocation();
        //setareLocatie();
    }
//public void setareLocatie(){
 //   frame.setLocation(400,200);
//}
}
