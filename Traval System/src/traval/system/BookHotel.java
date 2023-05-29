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

public class BookHotel extends JFrame implements ActionListener{

    Choice chotel,cac,cfood;
    JTextField tperson,tdays;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    String username;

    JButton checkprice,bookpackegae,back,bookhotel;

    BookHotel(String username){
        this.username=username;
        setBounds(350, 200, 1100, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text=new JLabel("Book Hotel");
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

        JLabel lblpackage=new JLabel("Select Hotel");
        lblpackage.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblpackage.setBounds(50,80,150,30);
        add(lblpackage);

        chotel=new Choice();
        
        chotel.setBounds(220, 80, 150, 30);
        add(chotel);

        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select *from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel lblperson=new JLabel("Total Person");
        lblperson.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblperson.setBounds(50,120,150,30);
        add(lblperson);

        tperson=new JTextField("1");
        tperson.setBounds(220, 120, 150, 25);
        add(tperson);

        JLabel lbldays=new JLabel("No of Days");
        lbldays.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbldays.setBounds(50,190,150,30);
        add(lbldays);

        tdays=new JTextField("1");
        tdays.setBounds(220, 190, 150, 25);
        add(tdays);

        JLabel lblac=new JLabel("Ac/ Non-Ac");
        lblac.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblac.setBounds(50,240,150,30);
        add(lblac);

        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250, 240, 150, 30);
        add(cac);

        JLabel lblfood=new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblfood.setBounds(50,280,150,30);
        add(lblfood);

        cfood=new Choice();
        cfood.add("YES");
        cfood.add("No");
        cfood.setBounds(250, 280, 150, 30);
        add(cfood);

        JLabel lblid=new JLabel("Id");
        lblid.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblid.setBounds(50,320,150,30);
        add(lblid);
        
        labelid=new JLabel();
        labelid.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelid.setBounds(220,320,150,30);
        add(labelid);
        
        

        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblnumber.setBounds(50,360,150,30);
        add(lblnumber);
        
        labelnumber=new JLabel();
        labelnumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelnumber.setBounds(220,360,150,30);
        add(labelnumber);

        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblphone.setBounds(50,400,150,30);
        add(lblphone);

        labelphone=new JLabel();
        labelphone.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelphone.setBounds(220,400,150,30);
        add(labelphone);

        JLabel lbltotal=new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma", Font.BOLD, 16));
        lbltotal.setBounds(50,440,150,30);
        add(lbltotal);

        labelprice=new JLabel();
        labelprice.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelprice.setBounds(220,440,150,30);
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

        checkprice=new JButton("CheckPrice");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBounds(60,480,120,25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookhotel=new JButton("Book Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBounds(200,480,120,25);
        bookhotel.addActionListener(this);
        add(bookhotel);

        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,480,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l13=new JLabel(i3);
        l13.setBounds(500, 50, 600, 300);
        add(l13);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==checkprice){
            try{

                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select *from hotel where name='"+chotel.getSelectedItem()+"'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("costperson"));
                    int food=Integer.parseInt(rs.getString("foodincluded"));
                    int ac=Integer.parseInt(rs.getString("acroom"));

                    int person=Integer.parseInt(tperson.getText());
                    int days=Integer.parseInt(tdays.getText());
                    String accSelected=cac.getSelectedItem();
                    String foodSeleceted=cfood.getSelectedItem();

                    if(person*days>0){
                        int total=0;
                        total +=accSelected.equals("AC")?ac:0;
                        total +=foodSeleceted.equals("Yes") ? food:0;

                        total +=cost;
                        total =total*person*days;
                        labelprice.setText("Rs"+total);
                    }else{
                        JOptionPane.showMessageDialog(null,"Please Enter a Valid No");
                    }
                }
                                
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            else if(ae.getSource()==bookhotel){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tperson.getText()+"','"+tdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"') ");
                JOptionPane.showMessageDialog(null,"Hotel Booked Succefully");
                setVisible(false);

            }catch(Exception e){
                e.printStackTrace();
            }
           
            
        }else{
            setVisible(false);

        }
    }

    // public static void main(String [] args){
    //     new BookHotel("gopal");
    // }
    
}
