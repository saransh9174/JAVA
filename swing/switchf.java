import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class switchf implements ActionListener{
    static JFrame frame1;
    static JFrame frame2;
    static JButton next;

    public static void main(String args[]){
        frame1 = new JFrame("Frame1");
        frame1.setSize(250,250);
        frame1.setLayout(null);
        
        next=new JButton("Next");
        next.setBounds(75,50,100,50);

        frame1.add(next);

        switchf obj=new switchf();
        next.addActionListener(obj);
        frame1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String button=e.getActionCommand();
        if(button.equals("Next")){
            create_frame2();
        }
    }

    public static void create_frame2(){
        frame2=new JFrame("fRAME2");
        frame2.setSize(250,250);
        frame2.setLayout(null);
        switchf obj=new switchf();
        frame2.setVisible(true);
    }
}