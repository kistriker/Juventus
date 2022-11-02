import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog1 extends JDialog {
    private String Name="";
    private int age=0;
    JTextField txtName = new JTextField(20);
    JComboBox cAge = new JComboBox();
    JButton btnOK = new JButton("OK");
    JButton btnCancel = new JButton("Cancel");
    public Dialog1(Frame owner,String title){
        super(owner,title);
        //set size and position
        setBounds(100,100,280,150);
        Container DialogContent = getContentPane();
        DialogContent.setLayout(new FlowLayout());
        //prepare combobox with age
        for(int i=0;i<120;i++){
            cAge.addItem(i);
        }
        //add controls to the dialog
        add(new JLabel("Name:"));
        add(txtName);
        add(new JLabel("Age:"));
        add(cAge);
        add(btnOK);
        add(btnCancel);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName(txtName.getText());
                setAge((int) cAge.getSelectedItem());
                Dialog1.this.setVisible(false);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName("");
                setAge(0);
                Dialog1.this.setVisible(false);
            }
        });
    }
    public String getName(){return Name;}
    public void setName(String Name){this.Name=Name;}
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}
}
