package traval.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DashBoard extends JFrame implements ActionListener{

    String username;
    JButton addPerson,viewPerson,updatePerson,deletePerson,checkPakage,bookPakage,viewPakage,checkHotel,destination,bookHotel,vbookHotel,payment,calculator,notepad,about,Exits;
    DashBoard(String username){
        this.username=username;
       // setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));

        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0,65   ,300,900);
        add(p2);

        addPerson=new JButton("Add Personal Details");
        addPerson.setBounds(0, 0, 300, 50);
        addPerson.setBackground(new Color(0, 0, 102));
        addPerson.setForeground(Color.WHITE);
        addPerson.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPerson.setMargin(new Insets(0, 0, 0, 60));
        addPerson.addActionListener(this);
        p2.add(addPerson);

        updatePerson=new JButton("Update Personal Details");
        updatePerson.setBounds(0, 50, 300, 50);
        updatePerson.setBackground(new Color(0, 0, 102));
        updatePerson.setForeground(Color.WHITE);
        updatePerson.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePerson.setMargin(new Insets(0, 0, 0, 30));
        updatePerson.addActionListener(this);
        p2.add(updatePerson);

        viewPerson=new JButton("View Details");
        viewPerson.setBounds(0, 100, 300, 50);
        viewPerson.setBackground(new Color(0, 0, 102));
        viewPerson.setForeground(Color.WHITE);
        viewPerson.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPerson.setMargin(new Insets(0, 0, 0, 130));
        viewPerson.addActionListener(this);
        p2.add(viewPerson);

        deletePerson=new JButton("Delete Details");
        deletePerson.setBounds(0, 150, 300, 50);
        deletePerson.setBackground(new Color(0, 0, 102));
        deletePerson.setForeground(Color.WHITE);
        deletePerson.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePerson.setMargin(new Insets(0, 0, 0, 120));
        deletePerson.addActionListener(this);
        p2.add(deletePerson);

        checkPakage=new JButton("Check Pakages");
        checkPakage.setBounds(0, 200, 300, 50);
        checkPakage.setBackground(new Color(0, 0, 102));
        checkPakage.setForeground(Color.WHITE);
        checkPakage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPakage.setMargin(new Insets(0, 0, 0, 110));
        checkPakage.addActionListener(this);
        p2.add(checkPakage);

        bookPakage=new JButton("Book Pakage");
        bookPakage.setBounds(0, 250, 300, 50);
        bookPakage.setBackground(new Color(0, 0, 102));
        bookPakage.setForeground(Color.WHITE);
        bookPakage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPakage.setMargin(new Insets(0, 0, 0, 125));
        bookPakage.addActionListener(this);
        p2.add(bookPakage);

        viewPakage=new JButton("ViewBooked Pakage");
        viewPakage.setBounds(0, 300, 300, 50);
        viewPakage.setBackground(new Color(0, 0, 102));
        viewPakage.setForeground(Color.WHITE);
        viewPakage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPakage.setMargin(new Insets(0, 0, 0, 125));
        viewPakage.addActionListener(this);
        p2.add(viewPakage);

        checkHotel=new JButton("Check Hotels");
        checkHotel.setBounds(0, 350, 300, 50);
        checkHotel.setBackground(new Color(0, 0, 102));
        checkHotel.setForeground(Color.WHITE);
        checkHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkHotel.setMargin(new Insets(0, 0, 0, 130));
        checkHotel.addActionListener(this);
        p2.add(checkHotel);

        bookHotel=new JButton("Book Hotels");
        bookHotel.setBounds(0, 400, 300, 50);
        bookHotel.setBackground(new Color(0, 0, 102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotel.setMargin(new Insets(0, 0, 0, 130));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);

        vbookHotel=new JButton("View Booked Hotels");
        vbookHotel.setBounds(0, 450, 300, 50);
        vbookHotel.setBackground(new Color(0, 0, 102));
        vbookHotel.setForeground(Color.WHITE);
        vbookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        vbookHotel.setMargin(new Insets(0, 0, 0, 60));
        vbookHotel.addActionListener(this);
        p2.add(vbookHotel);

        destination=new JButton("Destination");
        destination.setBounds(0, 500, 300, 50);
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destination.setMargin(new Insets(0, 0, 0, 130));
        destination.addActionListener(this);
        p2.add(destination);

        payment=new JButton("Payments");
        payment.setBounds(0, 550, 300, 50);
        payment.setBackground(new Color(0, 0, 102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payment.setMargin(new Insets(0, 0, 0, 140));
        payment.addActionListener(this);
        p2.add(payment);

        calculator=new JButton("Calculator");
        calculator.setBounds(0, 590, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 140));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad=new JButton("Notpad");
        notepad.setBounds(0, 630, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 160));
        notepad.addActionListener(this);
        p2.add(notepad);

        about=new JButton("Abouts");
        about.setBounds(0, 680, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 170));
        about.addActionListener(this);
        p2.add(about);
        
        Exits=new JButton("Exits");
        Exits.setBounds(0, 720, 300, 50);
        Exits.setBackground(new Color(0, 0, 102));
        Exits.setForeground(Color.WHITE);
        Exits.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Exits.setMargin(new Insets(0, 0, 0, 170));
        Exits.addActionListener(this);
        p2.add(Exits);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"), getName());
        Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);

        add(image);
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,60));

        image.add(text);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPerson){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPerson){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePerson){
            new UpdateCustomer(username);
        }else if(ae.getSource()==deletePerson){
            new DeleteDetails(username);
        }else if(ae.getSource()==checkPakage){
            new CheckPackage();
        }else if(ae.getSource()==bookPakage){
            new BookPackage(username);
        }else if(ae.getSource()==viewPakage){
            new ViewPackage(username);
        }else if(ae.getSource()==checkHotel){
            new CheckHotels();
        }else if(ae.getSource()==destination){
            new Destinations();
        }else if(ae.getSource()==bookHotel){
            new BookHotel(username);
        }else if(ae.getSource()==vbookHotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()== payment){
            new Payments();
        }else if(ae.getSource()==calculator){
            try{

                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }

        }else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");

            }catch(Exception e){
                e.printStackTrace();
            }

        }else if(ae.getSource()==about){
            new About();
        }else{
            setVisible(false);
        }
    }

//    public static void main(String args[]){
//        //new Splash();
       
//        new DashBoard("");

//    }
   
}
