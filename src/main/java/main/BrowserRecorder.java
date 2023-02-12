package main;
import java.awt.*;   

import java.awt.*;    
import java.awt.event.*;    
  
// creating class which implements ActionListener interface and inherits Frame class  
public class BrowserRecorder extends Frame implements ActionListener{    
      
    // creating objects of TextField, Label and Button class  
    TextField tf;   
    Label l;   
    Button b;   
  
    // constructor to instantiate the above objects  
    BrowserRecorder() {    
    	Font myFont = new Font("Serif",Font.BOLD,24);
        tf = new TextField();    
        tf.setBounds(350, 200, 400, 60);   
        tf.setFont(myFont);
        
        l = new Label("Enter URL");    
        l.setBounds(200, 200, 150, 60);    
        l.setFont(myFont);
        
        b = new Button("Start Recording");    
        b.setBounds(275,450,250,60); 
        b.setFont(myFont);
        b.addActionListener(this);   
  
        add(b);  
        add(tf);  
        add(l);   
  
        setSize(900,900);    
        setLayout(null);    
        setVisible(true);    
    }    
  
    // defining actionPerformed method to generate an event  
    public void actionPerformed(ActionEvent e) {    
        try {    
	        String url = tf.getText(); 
	        OpenBrowser browser = new OpenBrowser(url);
	        browser.openWindow();
        }   
        catch (Exception ex) {  
            System.out.println(ex);  
        }    
    }    
  
    // main method  
    public static void main(String[] args) {    
        new BrowserRecorder();    
    }   
}