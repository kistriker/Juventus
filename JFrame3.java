import Frame3.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame3 {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    //private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button4;
    private JTextArea textArea1;
    private JButton AS_ROMA;
    private JButton topStoriesButton;
    private JButton dietaButton;
    private JButton btnRefresh;
    private JButton btnClear;

    public JFrame3(){

        /*button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //textArea1.setText(Inter.Oras());
                //if(textArea1.getText()=="Dieta") {
                    Inter.test();
                    //textArea1.setText(Inter.test());
                    //String w=Inter.Oras();
                    String f = "";
                    textArea1.setText(Inter.Oras(f));
                    //Main2.test();
                //}
                //else{
                //   JOptionPane.showMessageDialog(null, "Nu avem informatii disponibile!", "Eroare", JOptionPane.ERROR_MESSAGE);
                //}
                String data="S-a apasat Butonul Inter din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea1.setText(AC_Milan1.test1());
                //Main2.test();
                String data="S-a apasat Butonul AC Milan din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //textArea1.setText(FC_Torino.getLevel());
                textArea1.setText(FC_Torino.test());
                //Main2.test();
                String data="S-a apasat Butonul Torino din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Antrenor.exercitii();
                //Antrenor.test();
                textArea1.setText(Antrenor.test());
                String data="S-a apasat Butonul Antrenor din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //textArea1.setText(Stadion.getInstance("Alabala Stadium").getNume());
                textArea1.setText(Stadion.getInstance("Allianz Arena Stadium").getNume());
                String data="S-a apasat Butonul Stadion din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
        */
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Log1.test();
                String data="S-a apasat Butonul Log din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow.test();
                String data="S-a apasat Butonul Return din cadrul ferestrei Surprindema! si s-a revenit la fereastra principala";
                Log3.setLog(data);
            }
        });
        /*AS_ROMA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(AS_Roma.test());
                //Main2.test();
                String data="S-a apasat Butonul AS Roma din cadrul ferestrei Surprindema!";
                Log3.setLog(data);
            }
        });
         */
        topStoriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Top_Stories1.test();
                String data="S-a apasat Butonul Top Stories din cadrul ferestrei Surprindema! si s-a deschis o noua fereastra";
                Log3.setLog(data);
            }
        });
        dietaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main2.test();
                /*String msg=Dialog3.getMsg();
                if(msg.equals("")){
                    textArea1.setText("");
                }
                else
                    textArea1.setText(Dialog3.getMsg());
                */
            }
        });
        btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg=Dialog3.getMsg();
                if(msg.equals("")){
                    textArea1.setText("");
                }
                else
                    textArea1.setText(Dialog3.getMsg());

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }
    public static void test(){
        JFrame frame = new JFrame("Surprindema");
        String data="S-a deschis fereastra Surprindema!";
        Log3.setLog(data);
        frame.setContentPane(new JFrame3().panel1);
        //frame.setLocation(600,300);
        frame.setLocation(400,50);
        frame.setPreferredSize(new Dimension(380,380));
        ImageIcon image= new ImageIcon("src/logo.png");
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
