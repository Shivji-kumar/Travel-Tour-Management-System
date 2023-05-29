package traval.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class About extends JFrame implements ActionListener{
    JButton back;

    About(){
        setBounds(600, 200, 500, 550);
        setLayout(null);
        //setBackground(Color.WHITE);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1=new JLabel("About");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);

        String s="About Projects \n"+
        "A travel management system is a"+
         "software product that manages all components of your business travel."+
         "  Typically they are integrated with travel service providers, offering real-time quotes, bookings, and trip logistics in one place."+
          " Managers can track bookings, cancellations, adjustments, and rescheduling in real-time, eliminating a lot of "+
          "the manual back and forth that previously had to happen through email. "+

        "When done well, these systems help to enforce consistent company guidelines, "+
        "maximize air miles and other loyalty programs, and find cost savings whenever global business travel is required."+
        "  In today’s modern era where travel is such a crucial part of operations, this is a must-have "+
        "for any company that takes their travel seriously." ;

        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        back=new JButton("Back");
        back.setForeground(Color.BLACK);
        back.setBackground(Color.WHITE);
        back.setBounds(200, 420, 100, 20);
        back.addActionListener(this);
        
        add(back);





        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }

    // public static void main(String args[]){
    //     new About();
    // }
    
}
