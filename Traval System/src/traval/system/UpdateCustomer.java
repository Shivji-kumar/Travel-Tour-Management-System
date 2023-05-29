package traval.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UpdateCustomer extends JFrame implements ActionListener{
    JLabel lblusername,labelusername,lblid,lblnumber,labelname;
    Choice security;
    JComboBox comboid;
    JTextField tfnumber,tconuntry,taddress,temail,tphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    //String username;

    UpdateCustomer(String username){
        setBounds(500, 200, 850, 550);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);

        JLabel text=new JLabel("Update Customer Details");
        text.setBounds(50, 20, 250, 25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);


        lblusername=new JLabel("UserName");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);

        labelusername=new JLabel("");
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
       
        
        lblid=new JLabel("ID");
        lblid.setBounds(50,90,150,25);
        add(lblid);

        tfid=new JTextField();
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);

        lblnumber=new JLabel("Number");
        lblnumber.setBounds(25,130,150,25);
        add(lblnumber);
        
        

        tfnumber=new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);

        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,160,150,25);
        add(lblname);
        
        labelname=new JLabel("");
        labelname.setBounds(220,160,150,25);
        add(labelname);
       
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);

        tfgender=new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);


        JLabel conuntry=new JLabel("Country");
        conuntry.setBounds(25,250,150,25);
        add(conuntry);

        tconuntry=new JTextField();
        tconuntry.setBounds(220, 250, 150, 25);
        add(tconuntry);

        JLabel address=new JLabel("Address");
        address.setBounds(25,300,150,25);
        add(address);

        taddress=new JTextField();
        taddress.setBounds(220, 300, 150, 25);
        add(taddress);

        JLabel email=new JLabel("Email Id");
        email.setBounds(25,330,150,25);
        add(email);

        temail=new JTextField();
        temail.setBounds(220, 330, 150, 25);
        add(temail);

        JLabel phone=new JLabel("Phone No");
        phone.setBounds(25,360,150,25);
        add(phone);

        tphone=new JTextField();
        tphone.setBounds(220, 360, 150, 25);
        add(tphone);

        add=new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add.setBounds(70,400,100,25);
        add(add);

        back=new JButton("back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(180,400,100,25);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2=i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,100,450,300);
        add(image);

        try{
            Conn c =new Conn();
            ResultSet rs= c.s.executeQuery("select *from customer where username= '"+username+"'" );
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tconuntry.setText(rs.getString("country"));
                taddress.setText(rs.getString("address"));
                tphone.setText(rs.getString("phone"));
                temail.setText(rs.getString("email"));
               
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username=labelusername.getText();
            String id=tfid.getText();
            String number=tfnumber.getText();
            String name=labelname.getText();
            String gender=tfgender.getText();           
            String country=tconuntry.getText();
            String address=taddress.getText();
            String phone=tphone.getText();
            String email=temail.getText();

            try{
                Conn c=new Conn();
                String query="update customer set username='"+username+"',id='"+id+"', number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Customer Details Updated Succefully");
                setVisible(false);

            }catch(Exception e){
                e.printStackTrace();
            }



        }else{
            setVisible(false);
        }
    }

    // public static void main(String []args){
    //     new UpdateCustomer("");
    // }
    
}
