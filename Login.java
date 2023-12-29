import javax.swing.*;
import java.awt.*;
public class Login extends JFrame {

    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusrname=new JLabel("Username    :");
        lblusrname.setBounds(40,20,100,30);
        add(lblusrname);
        JTextField tfusername=new JTextField();
        tfusername.setBounds(150,25,120,28);
        add(tfusername);


        JLabel password=new JLabel("Password    :");
        password.setBounds(40,60,100,30);
        add(password);
        JTextField tfpassword=new JTextField();
        tfpassword.setBounds(150,65,120,30);
        add(tfpassword);

        JButton addBtn = new JButton("Login");
        addBtn.setBounds(150, 125, 120, 30);

        add(addBtn);
        addBtn.setForeground(Color.white);
        addBtn.setBackground(Color.black);
        addBtn.setFont(new Font("serif", Font.PLAIN, 15));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600,300);
        setLocation(450,200);
        setVisible(true);

    }
    public static void main(String[] args) {
       new Login();
    }
}

