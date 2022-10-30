import Fotbalist.Fotbalist;
import Fotbalist.Rivale;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;

public class MainWindow {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JTextArea txtText;
    private JPanel panel;
    private JLabel jlb;
    private JButton button8;
    private JButton surprindemaButton;
    String NUME;
    double suma = 0.0;
    private static final int BURSA=20;
    /*public void MainWindow1(){
            Frame f=new Frame();
            Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\Images\\logo.jpg");
            f.setIconImage(icon);
            f.setLayout(null);
            f.setSize(400,400);
            f.setVisible(true);
    }*/
    public MainWindow() {

        ArrayList<Rivale> rivale = new ArrayList<Rivale>();

        rivale.add(new Rivale("Napoli"));
        rivale.add(new Rivale("Inter"));
        rivale.add(new Rivale("AC Milan"));
        rivale.add(new Rivale("Lazio"));
        rivale.add(new Rivale("AS Roma"));
        rivale.add(new Rivale("Torino"));




        Fotbalist s1 = new Fotbalist("Kevin", "De_Bruyne", "13", "30.000.000");
        s1.sumaTransfer = 180;
        Fotbalist s2 = new Fotbalist("Lionel", "Messi", "30", "100.000.000");
        s2.sumaTransfer = 0;

        Fotbalist s3 = new Fotbalist("Cristiano", "Ronaldo", "7", "100.000.000");
        s3.sumaTransfer = -35;
        int opt = -1;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtText.setText("");//sa curete text boxul la fiecare apasare de buton
                suma = s1.getSumaTransfer() + s2.getSumaTransfer() + s3.getSumaTransfer();
                //System.out.println("Suma este:" + suma + " de milioane!");
                jlb.setText("Suma este:" + suma + " de milioane!");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //txtText.setText("");
                //System.out.print("Nume jucator: ");//se scrie in caseta nume apoi apesi butonul
                jlb.setText("Nume jucator: ");
                if(NUME==null ) {
                    JOptionPane.showMessageDialog(null, "Introduce nume jucator!",
                            "Eroare", JOptionPane.ERROR_MESSAGE);
                }
                NUME = txtText.getText();
                if (s1.getNume().equals(NUME)) {
                    //System.out.println("Jucatorul exista in echipa:" + NUME + "- Juventus");
                     jlb.setText("Jucatorul exista in echipa:" + NUME + "- Juventus");
                } else if (s2.getNume().equals(NUME)) {
                    //System.out.println("Jucatorul exista in echipa:" + NUME + "- Juventus");
                    jlb.setText("Jucatorul exista in echipa:" + NUME + "- Juventus");
                } else if (s3.getNume().equals(NUME)) {
                    //System.out.println("Jucatorul exista in echipa:" + NUME + "- Juventus");
                    jlb.setText("Jucatorul exista in echipa:" + NUME + "- Juventus");
                } else {
                    //System.out.println("Jucatorul nu exista in echipa! Cauta la alta echipa!");
                    jlb.setText("Jucatorul nu exista in echipa! Cauta la alta echipa!");
                }
                txtText.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtText.setText("");

                if (suma > -10.0)
                    //System.out.println("Nicio sanctiune!");
                    jlb.setText("Nicio sanctiune!");
                else
                    //System.out.println("Out din Europa!");
                    jlb.setText("Out din Europa!");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//de perfectionat 4-ule
                //txtText.setText("");
                try {
                    //System.out.println("Care jucator: De Bruyne(1) Messi(2) sau Ronaldo(3)");
                    jlb.setText("Care jucator: De Bruyne(1) Messi(2) sau Ronaldo(3) " + "\n" + "Alege cifra corespunzatoare jucatorului dorit!");
                    //System.out.println("Alege cifra corespunzatoare jucatorului dorit!");
                    //jlb.setText("Alege cifra corespunzatoare jucatorului dorit!");
                    int ctt;
                    String Text = txtText.getText();
                    ctt = Integer.parseInt(Text);
                    if(ctt!=1 && ctt!=2 && ctt!=3 ) {
                        JOptionPane.showMessageDialog(null, "Introduce numar intre 1,2 sau 3!",
                                "Eroare", JOptionPane.ERROR_MESSAGE);
                    }
                    if (ctt == 1) {
                        if (s1.transferSauNuJucator(100.0))
                            //System.out.println("Transfera jucator!");
                            jlb.setText("Transfera jucator!");
                        else
                            //System.out.println("Nu transfera jucator!");
                            jlb.setText("Nu transfera jucator!");
                    }
                    if (ctt == 2) {
                        if (s2.transferSauNuJucator(100.0))
                            //System.out.println("Transfera jucator!");
                            jlb.setText("Transfera jucator!");
                        else
                            //System.out.println("Nu transfera jucator!");
                            jlb.setText("Nu transfera jucator!");
                    }
                    if (ctt == 3) {
                        if (s3.transferSauNuJucator(100.0))
                            //System.out.println("Transfera jucator!");
                            jlb.setText("Transfera jucator!");
                        else
                            //System.out.println("Nu transfera jucator!");
                            jlb.setText("Nu transfera jucator!");
                    }
                    //txtText.setText("");
                } catch (NumberFormatException nfe) {
                    if (NUME == null) {
                        JOptionPane.showMessageDialog(null, "Introduce date intai!",
                                "Eroare", JOptionPane.ERROR_MESSAGE);
                        txtText.setText("");
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e){
                    //System.out.println(s1.toString());
                    //System.out.println(s2.toString());
                    //System.out.println(s3.toString());
                    //txtText.setBackground(Color.GRAY);
                    txtText.setText("");
                    txtText.setText(s1.toString() + "\n" + s2.toString() + "\n" + s3.toString());
                }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtText.setText("");
                txtText.setText(rivale.get(0).nume + "\n" + rivale.get(1).nume + "\n" +rivale.get(2).nume + "\n" +rivale.get(3).nume + "\n" +rivale.get(4).nume + "\n" +rivale.get(5).nume + "\n");

                JFrame2.test(rivale);
                //try {
                //    Napoli.test();
                //}catch(Exception exc){}
                AC_Milan.test();
                Inter1.test();
                Torino.test();
                Napoli1.test();
                Lazio.test();
                AS_Roma1.test();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtText.setText("");
                //System.out.println("Multumim ca ati apelat la noi, va mai asteptam!");
                //jlb.setText("Multumim ca ati apelat la noi, va mai asteptam!");
                //sleep(2000);
                System.exit(0);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtText.setText("");
                try {
                    Juventus1.test();
                }catch(Exception exc){}
            }
        });
        surprindemaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame3.test();
            }
        });
    }

        public static void main(String[] args) {
        JFrame frame = new JFrame("Juventus");
            //ImageIcon icon = new ImageIcon("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\Images\\logo.jpg");
            //frame.setIconImage(icon.getImage());
            //Image icon = Toolkit.getDefaultToolkit().getImage("logo.jpg");
            //setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.);
            //frame.setIconImage(icon);
            //frame.setLayout(null);
            //ImageIcon img = new ImageIcon("./logo.jpg");
                       ImageIcon image= new ImageIcon("src/logo.png");
            //ImageIcon image= new ImageIcon("src/logo.png");
                       frame.setIconImage(image.getImage());
        frame.setContentPane(new MainWindow().panel);
        frame.setPreferredSize(new Dimension(380,380));
            frame.getContentPane().setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void sleep(int time) {
        try{
            Thread.sleep(time);
        }catch (Exception e){}
    }

}
