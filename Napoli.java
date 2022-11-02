import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Fotbalist.Rivale;

import java.net.URI;
/*import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;*/
//public class Napoli extends MainWindow {
    public class Napoli {

    private JLabel Image;
    private JPanel panel;
    //JFrame frame = new JFrame("Napoli");
    //JLabel jl = new JLabel();
    //JPanel jp = new JPanel();
    //ImageIcon logo = new ImageIcon("logo.jpg");

    public Napoli() {
        //Image img = icon.getImage();
        //Image imgScale = img.getScaledInstance(icon.getIconWidth()-3556,icon.getIconHeight()-2000);
        //JFrame frame = new JFrame("Napoli");
        //JLabel Image = new JLabel(new ImageIcon("logo.jpg"));
        //JLabel jl = new JLabel();
        //JPanel jp = new JPanel();
        /*jl.setIcon(new ImageIcon("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\Images\\logo.jpg"));
        jp.add(jl);*/
        //add(jp);
        //validate();
        //frame.Image.createUIComponents();

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        //frame.setVisible(true);
    }

    public static void test() throws Exception{
        JFrame frame = new JFrame("Napoli");
        frame.setSize(300, 325);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://sscnapoli.it/en/"));
        frame.pack();
        frame.setVisible(true);
        //JLabel jl = new JLabel();
        //JPanel jp = new JPanel();
        //frame.setResizable(false);
        //frame.setLocationRelativeTo(null);
        //ImageIcon icon = new ImageIcon("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\Images\\logo.jpg");
        /*JLabel label = new JLabel();
        label.setIcon(new ImageIcon("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\Images\\logo.jpg"));
        frame.add(label);*/
        /* frame.setBounds(100, 200, 350, 300);
        Container c = frame.getContentPane();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\logo.jpg"));
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 30, size.width, size.height);
        c.add(label);*/
        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/image.png")));
        /*JLabel jl = new JLabel();
        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/image.png")));
        //jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\logo.jpg")));
        jl.setIcon(new ImageIcon("D:\\Games\\Exercitii\\Incercare proiect 2 lab POO\\Proiect2\\logo.jpg"));
        jl.validate();
        frame.add(jl);*/

    }
    /*JLabel website ;
    private void goWebsite(JLabel website, final String url, String text) {
        website.setText("<html> Website : <a href=\"\">" + text + "</a></html>");
        website.setCursor(new Cursor(Cursor.HAND_CURSOR));
        website.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(url));
                } catch (URISyntaxException | IOException ex) {
                    //It looks like there's a problem
                }
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() > 0) {
            if (Desktop.isDesktopSupported()) {
                try {
                    String osName = System.getProperty("os.name");
                    String urlPath = "http://download.oracle.com/javase/1.4.2/docs/api/java/text/SimpleDateFormat.html";

                    if (osName.startsWith("Windows"))
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + urlPath);
                    else {
                        String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
                        String browser = null;
                        for (int count = 0; count < browsers.length && browser == null; count++)
                            if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0)
                                browser = browsers[count];
                        Runtime.getRuntime().exec(new String[]{browser, urlPath});
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error in opening browser" + ":\n" + ex.getLocalizedMessage());
                }
            }
        }
    }*/
    /*public static void main(String[] args) {
        JFrame frame = new JFrame("Napoli");
        frame.setSize(300, 325);
        //JLabel image = new JLabel();
        //frame.setContentPane(frame.panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/
}
