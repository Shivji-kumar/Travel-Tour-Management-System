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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookPackage extends JFrame implements ActionListener{

    Choice cpackage;
    JTextField tperson;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    String username;

    JButton checkPrice,bookpackegae,back;

    BookPackage(String username){
        this.username=username;
        setBounds(350, 200, 1100, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text=new JLabel("Book Package");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text);

        JLabel lblusername=new JLabel("userrname");
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblusername.setBounds(50,50,200,25);
        add(lblusername);

        labelusername=new JLabel();
        labelusername.setBounds(220,50,100,25);
        add(labelusername);

        JLabel lblpackage=new JLabel("Select Package");
        lblpackage.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblpackage.setBounds(50,80,150,30);
        add(lblpackage);

        cpackage=new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(220, 80, 150, 30);
        add(cpackage);

        JLabel lblperson=new JLabel("Total Person");
        lblperson.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblperson.setBounds(50,120,150,30);
        add(lblperson);

        tperson=new JTextField("1");
        tperson.setBounds(220, 120, 150, 25);
        add(tperson);

        JLabel lblid=new JLabel("Id");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblid.setBounds(50,160,150,30);
        add(lblid);
        
        labelid=new JLabel();
        labelid.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelid.setBounds(220,160,150,30);
        add(labelid);
        
        

        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblnumber.setBounds(50,200,150,30);
        add(lblnumber);
        
        labelnumber=new JLabel();
        labelnumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelnumber.setBounds(220,200,150,30);
        add(labelnumber);

        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblphone.setBounds(50,250,150,30);
        add(lblphone);

        labelphone=new JLabel();
        labelphone.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelphone.setBounds(220,250,150,30);
        add(labelphone);

        JLabel lbltotal=new JLabel("Total Person");
        lbltotal.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbltotal.setBounds(50,300,150,30);
        add(lbltotal);

        labelprice=new JLabel();
        labelprice.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelprice.setBounds(220,300,150,30);
        add(labelprice);

        try{
            Conn c=new Conn();
            String query="select *from customer where username ='"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        checkPrice=new JButton("CheckPrice");
        checkPrice.setBackground(Color.BLACK);
        checkPrice.setForeground(Color.WHITE);
        checkPrice.setBounds(60,420,120,25);
        checkPrice.addActionListener(this);
        add(checkPrice);

        bookpackegae=new JButton("Book Packegae");
        bookpackegae.setBackground(Color.BLACK);
        bookpackegae.setForeground(Color.WHITE);
        bookpackegae.setBounds(200,420,120,25);
        bookpackegae.addActionListener(this);
        add(bookpackegae);

        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,420,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l13=new JLabel(i3);
        l13.setBounds(550, 50, 500, 300);
        add(l13);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==checkPrice){
            String pack=cpackage.getSelectedItem();
            int cost=0;
            if(pack.equals("Gold Package")){
                cost+=12000;

            }else if(pack.equals("Silver Package")){
                cost+=16000;
            }else{
                cost+=24000;

            }

            int person=Integer.parseInt(tperson.getText());
            cost*=person;
            labelprice.setText("RS "+cost);
            
        }else if(ae.getSource()==bookpackegae){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tperson.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"') ");
                JOptionPane.showMessageDialog(null,"Package Booked Succefully");
                setVisible(false);

            }catch(Exception e){
                e.printStackTrace();
            }
           
            
        }else{
            setVisible(false);

        }
    }

//     public static void main(String [] args){
//         new BookPackage("gopal");
//     }
    
}
