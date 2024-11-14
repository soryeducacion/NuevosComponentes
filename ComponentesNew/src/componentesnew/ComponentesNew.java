/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentesnew;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author soryl
 */
public class ComponentesNew extends JFrame{
       private String[] lista = {"Bueno", "Malo","Regular"}; // arreglo estandar, este arrelo de este tipo se crear 
       //ya que nuestro combo lista recibe la lista de este tipo.
       
       private JTextArea textArea = new JTextArea();
       private ButtonGroup botonGrupo1 = new ButtonGroup();
       private JRadioButton radio1 = new JRadioButton();
       private JRadioButton radio2 = new JRadioButton();
       private JCheckBox check1 = new JCheckBox();
       private JCheckBox check2 = new JCheckBox();
       private JComboBox combolista = new JComboBox(lista);//agregamos el listado

    public ComponentesNew() {
       setTitle("Copiar Pegar");
       setSize(350,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

    }
    
    public void AddComponentes(JPanel panel1){
        //setBounds(X,Y,ancho, alto);  Resive 4 parametros, recuerda que el parametro ancho y alto son datos en pixeles 
        
        textArea.setBounds(10, 20, 300, 100); // iniciamos a dibujar un area con un tamaño mayor a los demas componente 
        //ya que este es una caja que se usa para agregar comentarios (esto seria un ejemplo del uso de un area de texto).
        panel1.add(textArea);
        
        //el componente ButtonGroup su funcion principal es para agrupar los radiobutton y cuando el usuario decida que opcion  
        //elegir este solo le permitira elegir una opcion y no todas.
        botonGrupo1.add(radio1);//con el metodo add le decimos los radios que quiero que le pertenezcan
        botonGrupo1.add(radio2);// puedes tener N ButtonGroup para agrupar un rupo de JRadioButton
        
        //damos la posición donde queremos dibujar en la ventana nuestro radiobutton
        radio1.setBounds(10, 130, 80, 30);
        radio1.setText("Radio 1"); // confiuramos el valor de radio mediante el metodo setText
        panel1.add(radio1);
        radio2.setBounds(100, 130, 80, 30);
        radio2.setText("Radio 2");
        panel1.add(radio2);
        
        //CheckBox cajas de seleccion multiple
        //COMPLETAR LAS COORDENADAS DE LOS SIGUIENTES COMPONENTES TAMBIEN DEBERAS AGREGAR LOS 
        //DEMAS COMPONENTES PARA MOSTRARLOS EN LA VENTANA.
        check1.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT);
        check1.setText("Check 1");
        panel1.add(check1);
        
        
        //ComboBox o lista desplegable 
        combolista.setBounds(WIDTH, WIDTH, WIDTH, HEIGHT); 
        combolista.addItem("Excelente");// con este metodo podemos agregar metodo agregamos mas elementos a nuestro combo
        panel1.add(combolista);
        
    }
    
    public static void main(String[] args) {
        ComponentesNew ventana = new ComponentesNew();
        
        JPanel panel1 = new JPanel();//contenedor para agrupar componentes
        panel1.setLayout(null); 
        ventana.getContentPane().add(panel1); //Agregamos el panel a nuestra ventana con el metodo getContentPane

        ventana.AddComponentes(panel1); //llamamos el metodo AddComponentes y le pasamos el objeto de nuestro JPanel que hemos creado
        
        ventana.setVisible(true); //hacemos visible nuestra ventana
        
    }
}
