import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog3 extends JFrame{
    public StringBuffer msg = new StringBuffer("");
    public Dialog3(String title){
        //set size and position
        super(title);
        setBounds(100,100,350,150);
        Container ControlHost = getContentPane();
        ControlHost.setLayout(new FlowLayout());
        //supporting controls
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
                Dialog2 dialog = new Dialog2(Dialog3.this,"Info Mancare");
                dialog.setModal(true);
                dialog.setVisible(true);
                if(dialog.getName()=="")
                    strData = "Dialog Cancelled";
                else{
                    strData = dialog.getName() + "\n";
                    //ta.setText(strData);
                    msg.append(dialog.getName() + "\n");
                    ta.setText(msg.toString());
                }
            }
        });
    }
}
