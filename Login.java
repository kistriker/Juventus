import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JPanel panel1;
    private JTextField txtUsername;
    private JButton resetButton;
    private JButton loginButton;
    private JButton closeButton;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JPasswordField passwordfield;

    public Login() {
            JFrame frame =new JFrame();
            labelUsername.setForeground(Color.white);
            labelPassword.setForeground(Color.white);

            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                }
            });
            resetButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txtUsername.setText("");
                    passwordfield.setText("");
                }
            });
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (txtUsername.getText().toString().equals("Zsolt") && passwordfield.getText().toString().equals("kistriker")) {
                        JOptionPane.showMessageDialog(frame, "Login succesful!");
                        //JOptionPane.showMessageDialog((null, "Login succesful!"));
                        MainWindow.test();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid User");
                        //JOptionPane.showMessageDialog((null, "Login succesful!"));
                    }
                /*else if(!(txtUsername.getText().toString().equals("Zsolt"))){
                    JOptionPane.showMessageDialog((frame,"Wrong username!"));
                }
                else if(!(txtPassword.getText().toString().equals("kistriker"))){
                    JOptionPane.showMessageDialog((frame,"Wrong password!"));
                }*/
                }
            });
        }
    public static void main(String args[]) {
        JFrame frame = new JFrame("Juventus");
        ImageIcon image= new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());
        frame.setContentPane(new Login().panel1);
        frame.setPreferredSize(new Dimension(380,350));
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    /*public static void test() {
        JFrame frame = new JFrame("Juventus");
        ImageIcon image= new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());
        frame.setContentPane(new Login().panel1);
        frame.setPreferredSize(new Dimension(380,350));
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/
}
