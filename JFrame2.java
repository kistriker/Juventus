import javax.swing.*;

import Fotbalist.Rivale;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JFrame2 {
    public static ArrayList<Rivale> rivale = new  ArrayList<Rivale>();
    private JPanel panel;
    private JList list1;
    private JCheckBox juventusCheckBox;
    private JCheckBox napoliCheckBox;
    private JCheckBox interCheckBox;
    private JCheckBox ACMilanCheckBox;
    private JCheckBox lazioCheckBox;
    private JCheckBox ASRomaCheckBox;
    private JCheckBox torinoCheckBox;
    private JTextPane textPane1;
    private StringBuffer msg = new StringBuffer("");
    //private STring msg = "";
    public JFrame2(ArrayList<Rivale> arr) {
        //label.setText("Minge");
        list1.setListData(arr.toArray());//pune vectorul/array-ul in lista/JList
        //list1.setSize(50,50);
        napoliCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(napoliCheckBox.isSelected()) {
                    msg.append("Napoli \n");//msr +="Napoli + \n";
                    textPane1.setText(msg.toString());//textPane1.setText(msg);
                    String data="S-a bifat casuta aferenta lui Napoli";
                    Log3.setLog(data);
                }
                //textPane1.setText("Napoli");
                else {
                    msg.delete(0, 6);
                    textPane1.setText(msg.toString());
                    String data="S-a debifat casuta aferenta lui Napoli";
                    Log3.setLog(data);
                }
            }
        });
        interCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textPane1.setText("Inter");
                //if(textPane1!=null)
                 //   textPane1.setText("\n" +"Napoli");
                //textPane1.append("Napoli"+"\n");
                if(interCheckBox.isSelected()) {
                    msg.append("Inter \n");
                    textPane1.setText(msg.toString());
                    String data="S-a bifat casuta aferenta lui Inter";
                    Log3.setLog(data);
                }
                    //textPane1.setText("Inter");
                //else textPane1.setText("");
                else{
                    msg.delete(7, 13);
                    textPane1.setText(msg.toString());
                    String data="S-a debifat casuta aferenta lui Inter";
                    Log3.setLog(data);
                }
            }
        });
        ACMilanCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textPane1.setText("AC Milan");
                /*
                if(ACMilanCheckBox.isSelected())
                    textPane1.setText("AC Milan");
                else textPane1.setText("");
                */
                if(ACMilanCheckBox.isSelected()){
                    msg.append("AC Milan \n");
                    textPane1.setText(msg.toString());
                    String data="S-a bifat casuta aferenta lui AC Milan";
                    Log3.setLog(data);
                }
                else{
                    msg.delete(14, 23);
                    textPane1.setText(msg.toString());
                    String data="S-a debifat casuta aferenta lui AC Milan";
                    Log3.setLog(data);
                }
            }
        });
        lazioCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textPane1.setText("Lazio");
                /*
                if(lazioCheckBox.isSelected())
                    textPane1.setText("Lazio");
                else textPane1.setText("");
                */
                if(lazioCheckBox.isSelected()){
                    msg.append("Lazio \n");
                    textPane1.setText(msg.toString());
                    String data="S-a bifat casuta aferenta lui Lazio";
                    Log3.setLog(data);
                }
                else{
                    msg.delete(24, 30);
                    textPane1.setText(msg.toString());
                    String data="S-a debifat casuta aferenta lui Lazio";
                    Log3.setLog(data);
                }

            }
        });
        ASRomaCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textPane1.setText("AS Roma");
                /*
                if(ASRomaCheckBox.isSelected())
                    textPane1.setText("AS Roma");
                else textPane1.setText("");
                */
                if(ASRomaCheckBox.isSelected()){
                    msg.append("AS Roma \n");
                    textPane1.setText(msg.toString());
                    String data="S-a bifat casuta aferenta lui AS Roma";
                    Log3.setLog(data);
                }
                else{
                    msg.delete(31, 39);
                    textPane1.setText(msg.toString());
                    String data="S-a debifat casuta aferenta lui AS Roma";
                    Log3.setLog(data);
                }
            }
        });
        torinoCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textPane1.setText("Torino");
                /*
                if(torinoCheckBox.isSelected())
                    textPane1.setText("Torino");
                else textPane1.setText("");
                 */
                if(torinoCheckBox.isSelected()){
                    msg.append("Torino \n");
                    textPane1.setText(msg.toString());
                    String data="S-a bifat casuta aferenta lui Torino";
                    Log3.setLog(data);
                }
                else{
                    msg.delete(40, 47);
                    textPane1.setText(msg.toString());
                    String data="S-a debifat casuta aferenta lui Torino";
                    Log3.setLog(data);
                }
            }
        });
    }

    public static void test(ArrayList<Rivale> arr){
        JFrame frame = new JFrame("Rivale");
        String data="S-a deschis fereastra Rivale";
        Log3.setLog(data);
        frame.setContentPane(new JFrame2(arr).panel);
        frame.setLocation(30,400);
        ImageIcon image= new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
