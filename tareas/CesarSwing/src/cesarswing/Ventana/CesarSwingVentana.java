/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesarswing.Ventana;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class CesarSwingVentana extends JFrame {
    FlowLayout Layout;
    JTextField entrada1;
    JTextField entrada2;
    JLabel salida;
    JLabel x;
    JLabel y;
    JLabel z;
    JButton boton;

    public CesarSwingVentana() throws HeadlessException  {
        
        Layout = new FlowLayout();
        this.setLayout(Layout);
        entrada1 = new JTextField(15); 
        entrada2 = new JTextField(15);
        salida = new JLabel("");
        x = new JLabel("Tipo de desplazamiento:");
        y = new JLabel("Ingrese un mensaje:");
        z = new JLabel("Mensaje cifrado:");
        boton = new JButton("Cifrar");
        this.getContentPane().setBackground(new Color(175,228,241));
        this.getContentPane().add(x);
        this.getContentPane().add(entrada1);
        this.getContentPane().add(y);
        this.getContentPane().add(entrada2);
        this.boton.setBackground(new Color(132,190,201));
        this.entrada1.setBackground(new Color(219,243,247));
        this.entrada2.setBackground(new Color(219,243,247));
        this.getContentPane().add(boton);
        this.getContentPane().add(z);
        this.getContentPane().add(salida);
        this.setTitle("Cifrado Cesar");
        this.setSize(500, 400);
        this.pack();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
 
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
               
            }
        });
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String abecedario = "abcdefghijklmnñopqrstuvwxyz";
                int clave = Integer.parseInt(entrada1.getText());
                String letraPlana = entrada2.getText();
                String letraEncriptada = "";
                
                for (int i = 0; i < letraPlana.length (); i++){
                   for(int j = 0 ; j < abecedario.length() ; j ++){
                      if(letraPlana.charAt(i) == abecedario.charAt(j)){
                       if( j + clave < 0){
                      letraEncriptada += abecedario.charAt(abecedario.length() + (clave -j));
                         }
                         else{
                         letraEncriptada += abecedario.charAt( j + clave);
                          }
                           }
                         }}
                
                salida.setText(letraEncriptada);
                
                
            }
        });
            
    }

   
}            

       
                     
