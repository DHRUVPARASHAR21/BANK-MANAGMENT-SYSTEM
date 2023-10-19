
package bankmanagementsystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

 
public class Login extends JFrame implements ActionListener {
    
    JButton signIn, clear, signUp;
    JTextField cardTextField;
    JPasswordField PINTextField;
    
    Login(){
        setTitle("ATM");
        setLayout(null); 
        
        getContentPane().setBackground(Color.YELLOW);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(250,30,400,40);
        add(text);
        
        JLabel cardno = new JLabel("CARD NUMBER:");
        cardno.setFont(new Font("Raleway", Font.BOLD | Font.ITALIC, 24));
        cardno.setBounds(150,150,200,25);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(400, 150,200,25);
        add(cardTextField);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 16));
        

      
       
        
        JLabel PIN = new JLabel("PIN:");
        PIN.setFont(new Font("Raleway", Font.BOLD | Font.ITALIC, 25));
        PIN.setBounds(150,200,400,25);
        add(PIN);
        
        
        PINTextField = new JPasswordField();
        PINTextField.setBounds(400, 200,200,25);
        add(PINTextField);
       
        
        
        signIn = new JButton("SIGN IN");
        signIn.setBounds(275, 300, 200, 30);
        add(signIn);
        signIn.setBackground(Color.RED);
        signIn.setForeground(Color.white);
        signIn.addActionListener(this);
        
       
        
        clear = new JButton("Clear");
        clear.setBounds(400, 350, 200, 30);
        add(clear);
        clear.setBackground(Color.RED);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        
        signUp = new JButton("Create Account");
        signUp.setBounds(150, 350, 200, 30);
        add(signUp);
        signUp.setBackground(Color.RED);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);
        
        setSize(800,600);
        setLocation(350,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText(""); 
            PINTextField.setText("");
        }
        else if(ae.getSource() == signIn){
            
        }
        else if(ae.getSource() == signUp){
            
        }
    }
    
    public static void main(String args[]){
        
        new Login();
    } 
    
}
