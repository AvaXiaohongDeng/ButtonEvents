import javax.swing.*;
import java.awt.event.*;

public class ActionEvents extends JFrame implements ActionListener {
    JPanel pnl = new JPanel();

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JTextArea txtArea = new JTextArea(5,48);

    public ActionEvents(){
        super("Swing Window");
        setSize( 500,500 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        add(pnl);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(txtArea);

        btn2.setEnabled(false);
        txtArea.setText("Button 2 is Disable");

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txtArea.setText(e.getActionCommand() + " Clicked and Disabled");

        if(e.getSource()==btn1){
            btn2.setEnabled(true);
            btn1.setEnabled(false);
        }
        if(e.getSource()==btn2){
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        ActionEvents gui = new ActionEvents();
    }
}
