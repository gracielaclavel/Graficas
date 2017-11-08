/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//paso 1 - IMPORTAR Libreria graficas
import graficas.*;
import javax.swing.*;// Libreria gràfica estandar multiplataforma
import java.awt.*; // Libreria Grafica del Sistema operativo
//paso 8 - Importar la clase que contiene la gui
import gui.MiVentana; //paquete.clase

/**
 *
 * @author LAB18
 */
//paso 2- Heredar mi clase desde JFrame
public class MiVentana extends JFrame {
    

    //Paso 3- Declarar los elemnetos que vamos a utilizar
    JPanel mipanel; //Creacion de objetos Jpanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    //Paso 4 -Definicion del constructor de la clase
    public MiVentana()//Tiene el mismo nombre de la clase 
    
    {
     //Paso 5- Crear e inicializar los objetos que utilizaremos
        mipanel = new JPanel(); //Creamos el objeto
        milabel = new JLabel();
        mitexto = new JTextField(10);// 10 son los caracteres
        miboton = new JButton ();
        //Paso 6- Agregar los elementos al JFrame
        this.add(mipanel); //Agrego el Jpanel al JFrame
        mipanel.add(milabel);//Agrego los elemntos al JPanel
        mipanel.add(mitexto);
        mipanel.add(miboton);
        //Paso 7 - Propiedades de los elementos
        milabel.setText("campo");//
        miboton.setText("presioname");
        
    }
   /* public static void main(String[] args) 
    {
      JFrame miventana =new JFrame();   // Creamos un Objetos tipo JFrame
      miventana.setVisible(true);// estas sentencia muestra la ventana
      miventana.setBounds(0, 0, 400, 400);//Le asignamos tamaño a la ventana
      miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana
      }*/
    
}
