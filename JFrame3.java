import Frame3.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame3 {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button4;
    private JTextArea textArea1;
    private JButton AS_ROMA;
    private JButton topStoriesButton;

    public JFrame3(){

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea1.setText(Inter.Oras());
                Inter.test();
                //textArea1.setText(Inter.test());
                //String w=Inter.Oras();
                textArea1.setText(Inter.Oras());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea1.setText(AC_Milan1.test1());
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //textArea1.setText(FC_Torino.getLevel());
                textArea1.setText(FC_Torino.test());
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Antrenor.exercitii();
                //Antrenor.test();
                textArea1.setText(Antrenor.test());
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Stadion.getInstance("Alabala Stadium");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Log1.test();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow.test();
            }
        });
        AS_ROMA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(AS_Roma.test());
            }
        });
        topStoriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Top_Stories1.test();
            }
        });
    }
    public static void test(){
        JFrame frame = new JFrame("Surprindema");
        frame.setContentPane(new JFrame3().panel1);
        //frame.setLocation(600,300);
        frame.setLocation(400,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
