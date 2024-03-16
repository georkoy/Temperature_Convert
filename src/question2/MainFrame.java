/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author KOURSOS-PC
 */
public class MainFrame extends JFrame {
    
    private JTextField celtext;
    private JTextField fartext;
    
    public MainFrame(){
    super("Temprecure Converter");
       setSize(350, 140);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLocationRelativeTo(null); 
        setLayout(new BorderLayout());
   
       convtofarenait celitofar=new convtofarenait();
       convertocel fartocel=new convertocel();
       Clear clear= new Clear();
  
   JPanel mainpanel=new JPanel();
   
   mainpanel.setLayout(new FlowLayout());
   
   //kelsisioy
    JLabel celslab=new JLabel("Kelisioy");
    celtext=new JTextField(5);
     celtext.addActionListener(celitofar);                                           //celxtext.setHorizontalAlignment(JTextField.CENTER);
    mainpanel.add(celslab);
    mainpanel.add(celtext);
    
    
    JPanel butonpanel=new JPanel(new GridLayout(0, 1));
    
    JButton tofar=new JButton("->");
    tofar.addActionListener(celitofar);
    butonpanel.add(tofar);
    
      JButton tocel=new JButton("<-");
      tocel.addActionListener(fartocel);
    butonpanel.add(tocel);
    
    mainpanel.add(butonpanel);
    
    
     
    //farenait
    JLabel farlab=new JLabel("Farenait");
     fartext=new JTextField(5);
     fartext.addActionListener(fartocel);
    mainpanel.add(farlab);
    mainpanel.add(fartext);
 
    add(mainpanel,BorderLayout.CENTER);
    
    
    JButton Clearbuton=new JButton("Clear");
    setLayout(new FlowLayout());
    Clearbuton.addActionListener(clear);
    
    add(Clearbuton,BorderLayout.SOUTH);    
    }
    
    
    
    
    private class convtofarenait implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
         String cltext=celtext.getText();
           
            int celint=Integer.parseInt(cltext);
          double f = 9.0 / 5.0 * celint + 32;
            fartext.setText(String.format("%d", (int)f));
        }
    }                  
        private class convertocel implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent ae) {
               String far=fartext.getText();
               
               int farint=Integer.parseInt(far);
                double c = 5.0 / 9.0 * (farint - 32);
               celtext.setText(String.format("%d", (int) c));
            }
            
           
        }
        
        public class Clear implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            celtext.setText(null);
            fartext.setText(null);
        }
            
        }
        
        
        
    
    
    
    
    
    
    
    
}
