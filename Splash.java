import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Splash extends JFrame implements ActionListener {


    Splash() {
        getContentPane().setBackground(Color.WHITE); //getContentpane--to select whole frame and then background color white
        setLayout(null);
        JLabel heading = new JLabel("Employee Payroll Management System");//the object of Jlabel class is a component for placing text in a container.
        heading.setBounds(200, 30, 1200, 60); //to set heading location
        heading.setFont(new Font("serif", Font.PLAIN, 50));
        heading.setForeground(Color.RED); //font foreground color
        add(heading);  //to add heading in frame

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front1.png"));
        Image i2 = i1.getImage().getScaledInstance(1100, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        JButton addBtn = new JButton("Click here to Continue");
        addBtn.setBounds(300, 300, 300, 70);
        image.add(addBtn); //to add button with respect to image
        addBtn.setForeground(Color.BLUE);
        addBtn.setFont(new Font("serif", Font.PLAIN, 20));
        addBtn.addActionListener(this); // on clicking button this will tell that some function has to be performed which is in the ActionPerformed method


        setSize(1170, 650); //to set size of frame
        setLocation(200, 50); //to set location of frame where to display
        setVisible(true); // to make frame visible
        while (true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae){
   setVisible(false);
   new Login();

    }
    public static void main(String[] args) {

        new Splash();
    }
}

