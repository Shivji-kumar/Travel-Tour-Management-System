package traval.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfusername,tfname,tfpass,tfans;
    Choice security;

    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername=new JLabel("username");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblusername.setBounds(50,20,125,25);
        p1.add(lblusername);

         tfusername=new JTextField();
        tfusername.setBounds(190,60,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname=new JLabel("Name :");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblname.setBounds(50,60,185,25);
        p1.add(lblname);

         tfname=new JTextField();
        tfname.setBounds(190,20,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpassword=new JLabel("Password :");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblpassword.setBounds(50,100,185,25);
        p1.add(lblpassword);

         tfpass=new JTextField();
        tfpass.setBounds(190,100,180,25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass);

        JLabel lblsecurity=new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblsecurity.setBounds(50,140,140,25);
        p1.add(lblsecurity);

         security=new Choice();
        security.add("Fav Character from The Boys");
        security.add("Fav Marvel Super Hero");
        security.add("Your lucky number");
        security.add("Your Childhood SuperHere");
        security.setBounds(190,140,180,25);
        p1.add(security);

        JLabel lblans=new JLabel("Answer :");
        lblans.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblans.setBounds(50,180,180,25);
        p1.add(lblans);

         tfans=new JTextField();
        tfans.setBounds(190,180,180,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);

        create=new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground((new Color(133,193,233)));
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(50,250,100,30);
        create.addActionListener(this);
        p1.add(create);

        back=new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(200,250,100,30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);

        

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            String username=tfname.getText();
            String name=tfusername.getText();
            String password=tfpass.getText();
            String question=security.getSelectedItem();
            String answer=tfans.getText();

            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }

        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();

        }

    }

//    public static void main(String [] args){
//        new Signup();
//
//    }
    
}
