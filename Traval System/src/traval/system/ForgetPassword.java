package traval.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.jar.JarEntry;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ForgetPassword extends JFrame implements ActionListener{
    
    JTextField tfusername,tfname,tfquestion,tfans,tfpass;
    JButton search,retrive,back;

    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 280);
        add(p1);

        JLabel lblusername=new JLabel("username");
        lblusername.setBounds(40,20,100,25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        p1.add(lblusername);

        tfusername=new JTextField();
        tfusername.setBounds(220,20,130,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search=new JButton("Search");
        search.setForeground(Color.GRAY); 
        search.setForeground(Color.WHITE);
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);

        JLabel lblname=new JLabel("Name");
        lblname.setBounds(40,60,100,25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        p1.add(lblname);

        tfname=new JTextField();
        tfname.setBounds(220,60,130,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblquestion=new JLabel("Security Question");
        lblquestion.setBounds(40,100,200,25);
        lblquestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        p1.add(lblquestion);

        tfquestion=new JTextField();
        tfquestion.setBounds(220,100,130,25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);

        JLabel lblans=new JLabel("Answer ");

        lblans.setBounds(40,140,200,25);
        lblans.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        p1.add(lblans);

        tfans=new JTextField();
        tfans.setBounds(220,140,130,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);

        retrive=new JButton("Retrive");
        retrive.setForeground(Color.GRAY); 
        retrive.setForeground(Color.WHITE);
        retrive.setBounds(380,140,100,25);
        retrive.addActionListener(this);
        p1.add(retrive);

        JLabel lblpass=new JLabel("Password");
        lblpass.setBounds(40,180,200,25);
        lblpass.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        p1.add(lblpass);

        tfpass=new JTextField();
        tfpass.setBounds(220,180,130,25);
        tfpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpass);

        back=new JButton("Back");
        back.setForeground(Color.GRAY); 
        back.setForeground(Color.WHITE);
        back.setBounds(150,230,150,25);
        back.addActionListener(this);
        
        p1.add(back);


        
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query="select *from account where username='"+tfusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("security"));

                }
                

            }catch(Exception e){
                e.printStackTrace();
            }

        }else if(ae.getSource()==retrive){
            try{
                String query="select *from account where answer='"+tfans.getText()+"' AND username='"+tfusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfpass.setText(rs.getString("password"));
                   
                }
                

            }catch(Exception e){
                e.printStackTrace();
            }

        }else{
            setVisible(false);
            new Login();
        }


    }
//    public static void main(String [] args){
//        new ForgetPassword();
//    }
    
}
