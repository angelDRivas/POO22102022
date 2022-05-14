/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu.swing.modelo;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author angel
 */
public class NombreComboModelo implements ComboBoxModel<String>{
    private ArrayList<String>datos;
     private String selectedItem;

    public NombreComboModelo() {
    }

    public NombreComboModelo(ArrayList<String> datos, String selectedItem) {
        this.datos = datos;
        this.selectedItem = selectedItem;
    }

    

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selectedItem = (String)anItem;
    }

    @Override
    public int getSize() {
       return datos.size();
    }

    @Override
    public String getElementAt(int index) {
       return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
      
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    @Override
    public String getSelectedItem() {
        return this.selectedItem;
    }

    
    
    

    

   
}
