

import javax.swing.*;
public class swing{
    public static void main(String args[]){
        JFrame f=new JFrame();
        JButton b=new JButton("hi");
        JLabel l=new JLabel("Username");
        JTextField t1;
        t1=new JTextField("Welcome!");
        t1.setBounds(25,50,100,25);
        l.setBounds(25,10,110,50);
        b.setBounds(100,100,50,50);
        f.add(b);
        f.add(l);
        f.add(t1);
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }

}