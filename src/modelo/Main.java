/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.Normalizer;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Main {

    public static void main(String[] args) {
        //CREAR OBJETO

//        //FORMA 1
//        //nombreClase nombraVariable=new nombreClase();
//        Autor manzana = new Autor();
//        manzana.apellidos = "Valladares";
//
//        //FORMA 2 solo en Clases
//        //Autor tobar;
//        Autor tobar = new Autor();
//        tobar.apellidos = "Tobar";
//        //  tobar.llenarAtributos("MArco Antonio");
//
//        Autor a2 = new Autor("Gabriela", "Valladares", 0, "Ibarra", "15/11/1992", "Ecuatoriana");
//        //CREACIÓN DE UNA ESTRUCTURA O COLECCIÓN 
//        //LISTA ESTÁTICA
//            Persona[] listaPersonas=new Persona[3];
//        for (int i = 0; i < 3; i++) {
//            Persona p = new Persona();
//            p.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código")));
//            p.setNombres(JOptionPane.showInputDialog("Ingrese sus nombres completos"));
//            p.setDireccion(JOptionPane.showInputDialog("Ingrese su dirección"));
//            p.setCorreoElectronico(JOptionPane.showInputDialog("Ingrese su email"));
//            p.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su # cédula")));
//            p.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus número telefónico")));
//            p.imprimir();
//            listaPersonas[i]=p;
//        }
//        for (int i = 0; i < 3; i++) {
//              System.out.println("Las cédulas son:"+listaPersonas[i].getCedula());
//        }
//        //DEBER
//        Persona[] listaDeber = new Persona[100];
//        for (int i = 0; i < 100; i++) {
//            Persona p1=new Persona();
//            p1.setNombres("persona"+i);
//            p1.imprimir();
//
//        }
////LISTA DE NÚMEROS DEL 1 AL 10
//        int[] listN = new int[10];
//        for (int i = 0; i < 10; i++) {
//            listN[i] = i + 1;
//            System.out.println(listN[i]);
//        }
//
////LISTA DE NÚMEROS PARES 0 AL 1000
//        int[] listaPares = new int[501];
//        int n = 0;
//        for (int i = 0; i <= 1000; i++) {
//            if (i % 2 == 0) {
//                listaPares[n] = i;
//                n++;
//            }
//
//        }
//        for (int i : listaPares) {
//           // System.out.println(i);
//        }
//
//        //EJERCICIO 
//        
//        int[] l3 = new int[10];
//        
//        String n1=JOptionPane.showInputDialog("Ingrese 10 números enteros separados por -");
//        String n2=JOptionPane.showInputDialog("Ingrese 10 números enteros separados por -");
//        
//        String[] l1 = (n1.split("-"));
//        String[] l2 = (n2.split("-"));
//        for (int i = 0; i < l1.length; i++) {
//            System.out.println("*****"+l1[i]);
//            l3[i]=Integer.parseInt(l1[i])*Integer.parseInt(l2[i]);
//            JOptionPane.showMessageDialog(null,l1[i]+"*"+l2[i]+"="+ l3[i]);
//        }
        

//  CORRECCIÓN EVALUACIÓN 

    Administrativo a=new Administrativo();
    a.setNombres("Gaby Valladres");
    a.setDireccion("Ibarra");
    a.setNumHijos(2);
    a.setJornada(2);
    a.calcularSueldoFinal();
    }
}
