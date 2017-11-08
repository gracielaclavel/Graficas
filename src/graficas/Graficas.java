/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//paso 1 - IMPORTAR Libreria graficas
import javax.swing.*;// Libreria gràfica estandar multiplataforma
import java.awt.*; // Libreria Grafica del Sistema operativo

/**
 *
 * @author LAB18
 */
import gui.MiVentana; //paquete.clase
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //paso 9 llama ala clase
    public static void main(String[] args) 
    {
       MiVentana miventana =new JFrame();   // Creamos un Objetos tipo JFrame
      miventana.setVisible(true);// estas sentencia muestra la ventana
      miventana.setBounds(0, 0, 400, 400);//Le asignamos tamaño a la ventana
      miventana.setDefaultOperation(JFrame.EXIT_on_ClOSE);//Esta sentencia cierra la ventana
    }
    
}
