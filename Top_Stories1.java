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
                String data="S-a apasat Butonul TOY STORY din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        messiToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test1();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Messi To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        ronaldoToPSGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test2();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Ronaldo To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        calciopoliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test3();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Calciopoli din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        haland2MilionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test4();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Haland 2 milion din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        mbappeToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test5();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Mbappe To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        allisonToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test6();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Alisson To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        neymarToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test9();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Neymar To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        joaoFelixToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test7();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Joao Felix To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
        suarezToJuveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Top_Stories.test8();
                }catch(Exception ex){

                }
                String data="S-a apasat Butonul Suarez To Juve din cadrul ferestrei Top Stories";
                Log3.setLog(data);
            }
        });
    }
    public static void test() {
        JFrame frame = new JFrame("Top Stories");
        String data="S-a deschis fereastra Top Stories ";
        Log3.setLog(data);
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
