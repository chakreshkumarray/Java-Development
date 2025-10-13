package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    main_Class(String pin){
        this.pin = pin;

        // main image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        // transaction
        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(460,180,400,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,16));
        l3.add(label);

        // deposit
        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(330,230,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        // cash withdrawal
        b2 = new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(610,230,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        // cash fast
        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(330,280,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        // mini statement
        b4 = new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(610,280,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        // pin change
        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(330,330,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        // balance enquiry
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(610,330,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        // exit
        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(610,380,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        //
        
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource() == b7){
            System.exit(0);
        }else if (e.getSource() == b2){
            new Withdrawal(pin);
            setVisible(false );
        }else if (e.getSource() == b6){
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if (e.getSource() == b3){
            new FastCash(pin);
            setVisible(false);
        }else if (e.getSource() == b5){
            new Pin(pin);
            setVisible(false);
        }else if (e.getSource() == b4){
            new Mini(pin);

        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
