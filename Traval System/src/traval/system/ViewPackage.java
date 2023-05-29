package traval.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    String username;
    ViewPackage(String username){
        setBounds(450, 200, 900, 455);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text=new JLabel("View Package Details");
        text.setFont(new Font("tahoma", Font.BOLD, 20));
        text.setBounds(60,0,300,30);
        add(text);

        JLabel lblusername=new JLabel("userrname");
        lblusername.setBounds(30,50,100,25);
        add(lblusername);

        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,100,25);
        add(labelusername);

        JLabel lblpackage=new JLabel("Package Name");
        lblpackage.setBounds(30,80,100,25);
        add(lblpackage);

        JLabel labelpackage=new JLabel();
        labelpackage.setBounds(220,80,100,25);
        add(labelpackage);

        JLabel lblnumber=new JLabel("Total Person");
        lblnumber.setBounds(30,120,150,25);
        add(lblnumber);

        JLabel labelperson=new JLabel();
        labelperson.setBounds(220,120,100,25);
        add(labelperson);

        JLabel lblname=new JLabel("Id");
        lblname.setBounds(30,160,150,25);
        add(lblname);

        JLabel labelid=new JLabel();
        labelid.setBounds(220,160,100,25);
        add(labelid);

        JLabel lblgender=new JLabel("Number");
        lblgender.setBounds(30,200,150,25);
        add(lblgender);

        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,200,100,25);
        add(labelnumber);

        JLabel lblcountry=new JLabel("Phone");
        lblcountry.setBounds(30,240,150,25);
        add(lblcountry);

        JLabel labelphone=new JLabel();
        labelphone.setBounds(220,240,100,25);
        add(labelphone);

        JLabel lbladdress=new JLabel("Price");
        lbladdress.setBounds(30,260,150,25);
        add(lbladdress);

        JLabel labelprice=new JLabel();
        labelprice.setBounds(220,260,100,25);
        add(labelprice);


        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(50, 300, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(300,20,600,400);
        add(image); 

        
        try{
            Conn c=new Conn();
            String query="select *from bookpackage where username ='"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelpackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
                labelperson.setText(rs.getString("person"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }

    // public static void main(String args[]){
    //     new ViewPackage("gopal");
    // }
    
}
