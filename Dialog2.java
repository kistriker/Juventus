import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog2 extends JDialog{
    private String Name="";
    JTextField txtName = new JTextField(20);
    JButton btnOK = new JButton("OK");
    JButton btnCancel = new JButton("Cancel");
    public Dialog2(Frame owner,String title){
        super(owner,title);
        //set size and position
        setBounds(100,100,280,150);
        Container DialogContent = getContentPane();
        DialogContent.setLayout(new FlowLayout());
        //add controls to the dialog
        add(new JLabel("Name:"));
        add(txtName);
        //add(new JLabel("Age:"));
        add(btnOK);
        add(btnCancel);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName(txtName.getText());
                Dialog2.this.setVisible(false);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName("");
                Dialog2.this.setVisible(false);
            }
        });
    }
    public String getName(){return Name;}
    public void setName(String Name){this.Name=Name;}
}
