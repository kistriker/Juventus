import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Top_Stories1 {
    private JPanel panel;
    private JButton suarezToJuveButton;
    private JButton TOYSTORYButton;
    private JButton joaoFelixToJuveButton;
    private JButton neymarToJuveButton;
    private JButton allisonToJuveButton;
    private JButton mbappeToJuveButton;
    private JButton haland2MilionButton;
    private JButton calciopoliButton;
    private JButton ronaldoToPSGButton;
    private JButton messiToJuveButton;

    public Top_Stories1() {
        TOYSTORYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test();
                }catch(Exception ex){

                }
            }
        });
        messiToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test1();
                }catch(Exception ex){

                }
            }
        });
        ronaldoToPSGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test2();
                }catch(Exception ex){

                }
            }
        });
        calciopoliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test3();
                }catch(Exception ex){

                }
            }
        });
        haland2MilionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test4();
                }catch(Exception ex){

                }
            }
        });
        mbappeToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test5();
                }catch(Exception ex){

                }
            }
        });
        allisonToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test6();
                }catch(Exception ex){

                }
            }
        });
        neymarToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test9();
                }catch(Exception ex){

                }
            }
        });
        joaoFelixToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test7();
                }catch(Exception ex){

                }
            }
        });
        suarezToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test8();
                }catch(Exception ex){

                }
            }
        });
    }
    public static void test() {
        JFrame frame = new JFrame("Top Stories");
        ImageIcon image= new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());
        frame.setContentPane(new Top_Stories1().panel);
        frame.setPreferredSize(new Dimension(380,380));
        frame.setLocation(800,50);
        frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
