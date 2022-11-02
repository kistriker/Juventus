import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog extends JFrame {
    public StringBuffer msg = new StringBuffer("");
    public Dialog(String title){
        //set size and position
        super(title);
        setBounds(100,100,350,150);
        Container ControlHost = getContentPane();
        ControlHost.setLayout(new FlowLayout());
        //supporting controls
        //JButton btnDialog = new JButton("...");
        JButton btnDialog = new JButton("+");
        JTextArea ta = new JTextArea(5,25);
        ta.setEditable(false);
        add(ta);
        add(btnDialog);
        //display the dialog
        btnDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strData="";
                //Dialog1 dialog = new Dialog1(Dialog.this,"Person info");
                Dialog1 dialog = new Dialog1(Dialog.this,"Fotbalist info");
                dialog.setModal(true);
                dialog.setVisible(true);
                if(dialog.getAge()==0)
                    strData = "Dialog Cancelled";
                else {
                    strData = "Name = " + dialog.getName() + "\n" + "Age = " + dialog.getAge();
                    //ta.setText(strData);
                    msg.append("Name = " + dialog.getName() + "\n" + "Age = " + dialog.getAge() + "\n");
                    ta.setText(msg.toString());
                }
            }
        });
    }
}
