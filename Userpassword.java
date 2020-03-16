import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class UserPassword extends JFrame implements ActionListener
{
	public static final int width=250;
	public static final int height=120;
    JTextField text;
    JPasswordField text1;
    public UserPassword() 
    {
    	super("csc 364E Account Login");
    	setSize(width,height);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new GridLayout(3,1));
    //	setLayout(new BorderLayout());
    	
    	text=new JTextField();
    	text1=new JPasswordField();
    	
    	
    	JLabel lab=new JLabel("UserName:");
    	add(lab,BorderLayout.WEST);
    	add(text,BorderLayout.EAST);
    	
    	JLabel lab1=new JLabel("Password:");
    	add(lab1,BorderLayout.WEST);
    	add(text1,BorderLayout.EAST); 
    		
    	JButton button=new JButton("Login");
    	button.addActionListener(this);
    	add(button,BorderLayout.SOUTH); 
    }
    public void writeTo()
    {
    	PrintWriter write=null;
    	try{
    	
    	write=new PrintWriter(new FileOutputStream("mc.txt"));
    	String b=text.getText();
    	String g=text1.getText();
    	write.println(b);
    	write.print(g);
    	write.close();
    	
    	}
    	catch(FileNotFoundException e)
    	{
    		System.exit(0);
    	}
    }
   public void actionPerformed(ActionEvent e)
   {
   	writeTo();
   } 
    
       
    public static void main(String[]args)
  {
  	UserPassword k=new UserPassword();
  	k.setVisible(true);
  }
     
}
