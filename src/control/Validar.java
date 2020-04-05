/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Aguilar
 */
public class Validar {
    
        public void validarLetras(JTextField campo) {
            campo.addKeyListener(new KeyAdapter() {
                
                @Override
                public void keyTyped (KeyEvent e){
                    
                    char c = e.getKeyChar();
                    
                    if (Character.isDigit(c)) {
                        e.consume();
                        System.out.println("car: " + c);
                    }
                }
            });
        }
        
         public void limitarCaracteres(final JTextField campo, final int contador) {
            campo.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e){
                    char c = e.getKeyChar();
                    int tamano = campo.getText().length();
                    if (tamano >= contador) {
                        e.consume();
                        System.out.println("car: " + c);
                    }
                }
            });
        }
        
         public void validarNumeros(JTextField campo) {
            campo.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e){
                    char c = e.getKeyChar();
                    if (!Character.isDigit(c)) {
                        e.consume();
                        System.out.println("car: " + c);
                    }
                }
            });
        }
}
