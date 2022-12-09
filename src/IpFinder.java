import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpFinder extends JFrame implements ActionListener {
    JLabel label;
    JTextField textField;
    JButton button;
    IpFinder(){
        super("Ip finder App");
        label = new JLabel("Enter your Address /URL");
        label.setBounds(50,70, 150,20);
        textField = new JTextField();
        textField.setBounds(50,100,200,20);
        button = new JButton("Find Ip");
        button.setBounds(50,150,80,30);
        button.addActionListener(this);
        add(label);
        add(textField);
        add(button);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent e){
        String url = textField.getText();
        try{
            InetAddress internetAddress = InetAddress.getByName(url);
            String ip = internetAddress.getHostAddress();
            JOptionPane.showMessageDialog(this, ip);
        }
        catch (UnknownHostException e1){
            JOptionPane.showMessageDialog(this, e1.toString());
        }
    }

    public static void main(String[] args) {
        new IpFinder();

    }
}
