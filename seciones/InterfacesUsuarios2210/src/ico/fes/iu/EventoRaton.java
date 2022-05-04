/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author angel
 */
public class EventoRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hols click del raton");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Boton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Boton Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Cursor entro al componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Cursor salio del componente");
    }
    
}
