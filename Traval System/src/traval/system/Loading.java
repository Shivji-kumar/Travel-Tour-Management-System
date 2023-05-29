package traval.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Loading extends JFrame implements Runnable{
    Thread th;
    JLabel text,loading,usern;
    JProgressBar bar;
    String username;

    int s;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                s=s+1;
                int max=bar.getMaximum();
                int value=bar.getValue();
                if(value<max){ 
                    //101<100;
                    bar.setValue(bar.getValue()+1);

                }else{
                    i=201;
                    setVisible(false);
                    new DashBoard(username);                   
                }
                th.sleep(50);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    Loading(String username){
        this.username=username;
        th=new Thread(this);
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        text=new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);

        bar=new JProgressBar();
        bar.setBounds(150, 100, 300, 50);
        bar.setStringPainted(true);
        add(bar);

        loading=new JLabel("Loading Please Wait....");
        loading.setBounds(180, 140, 400, 40);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(loading);

        usern=new JLabel("Welcome "+username);
        usern.setBounds(50, 310, 400, 40);
        usern.setForeground(Color.RED);
        usern.setFont(new Font("Raleway",Font.BOLD,35));
        add(usern);

        th.start();
        setVisible(true);

    }

    // public static void main(String args[]){
    //     new Loading("");
    // }
    
}
