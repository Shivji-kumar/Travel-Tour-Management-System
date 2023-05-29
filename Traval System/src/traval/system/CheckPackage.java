package traval.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class CheckPackage extends JFrame implements ActionListener{
   // JPanel p1,p2,p3;
   String[] Package1={"Gold Package"," 6 days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Soft Drinks Free","Full Days 3 Island Crusise","English Spkeaing Guide","Booka Package","Summer Special","Rs 12000/-","package1.jpg"};
   String[] Package2={"Silver Package","5 days and 6 Nights","Toll Fress And Entrance free Ticket","Meet and Greet at Airport","Welcome Drinks onArrival","Night Safari","Crusie With Dinner","Book Package","Winter Special","RS 18000/-","","package2.jpg"};
   String[] Package3={"Bronze Package","6 Days and 5 Nights","Return Airfare","Free Clubing Rose & other Games","Hard Drinks Free","Dailly Buffet","BBQ Dinner","Book Package","Winter Specail ","Rs 24000/-","","package3.jpg"};
   JButton back;

    CheckPackage(){
        setBounds(450, 200, 900, 600);
        //setLayout(null);

        JTabbedPane tab=new JTabbedPane();

        JPanel p1=createPackage(Package1);
        tab.addTab("Package 1",null,p1);

        JPanel p2=createPackage(Package2);
        tab.addTab("Package 2",null,p2);

        JPanel p3=createPackage(Package3 );
        tab.addTab("Package 3",null,p3);

        add(tab);

        // back=new JButton("Back");
        // back.setBounds(350, 50, 80, 40);
        // back.setForeground(Color.RED);
        // back.addActionListener(this);
        // tab.add(back);

        


        setVisible(true);
        
    }

    public JPanel createPackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1=new JLabel(pack[0]);
         l1.setBounds(50, 5, 300, 30);
         l1.setForeground(Color.BLUE);
         l1.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l1);

         JLabel l2=new JLabel(pack[1]);
         l2.setBounds(30,60, 400, 30);
         l2.setForeground(Color.RED);
         l2.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l2);

         JLabel l3=new JLabel(pack[2]);
         l3.setBounds(30, 100, 400, 30);
         l3.setForeground(Color.GREEN);
         l3.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l3);

         JLabel l4=new JLabel(pack[3]);
         l4.setBounds(30, 140, 400, 30);
         l4.setForeground(Color.BLUE);
         l4.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l4);

         JLabel l5=new JLabel(pack[4]);
         l5.setBounds(30, 180, 400, 30);
         l5.setForeground(Color.YELLOW);
         l5.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l5);

         JLabel l7=new JLabel(pack[5]);
         l7.setBounds(30, 220, 400, 30);
         l7.setForeground(Color.BLUE);
         l7.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l7);

         JLabel l8=new JLabel(pack[6]);
         l8.setBounds(30, 260, 400, 30);
         l8.setForeground(Color.GREEN);
         l8.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l8);

         JLabel l9=new JLabel(pack[7]);
         l9.setBounds(30, 300, 400, 30);
         l9.setForeground(Color.RED);
         l9.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l9);

         JLabel l10=new JLabel(pack[8]);
         l10.setBounds(80, 340, 400, 30);
         l10.setForeground(Color.BLUE);
         l10.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l10);

         JLabel l11=new JLabel(pack[9]);
         l11.setBounds(100, 380, 400, 30);
         l11.setForeground(Color.RED);
         l11.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l11);

         JLabel l12=new JLabel(pack[10]);
         l12.setBounds(500, 380, 400, 30);
         l12.setForeground(Color.YELLOW);
         l12.setFont(new Font("Tahoma", Font.BOLD, 30));
         p1.add(l12);

         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
         Image i2=i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel l13=new JLabel(i3);
         l13.setBounds(350, 20, 500, 300);
        p1.add(l13);

        back=new JButton("Back");
        back.setBounds(550, 100, 80, 40);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        p1.add(back);

        return p1;

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }

    // public static void main(String [] args){
    //     new CheckPackage();
    // }
    
}
