/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        //CREAR OBJETO
        
        //FORMA 1
        //nombreClase nombraVariable=new nombreClase();
        Autor manzana=new Autor();
        manzana.apellidos="Valladares";
        
        //FORMA 2 solo en Clases
        //Autor tobar;
        Autor tobar=new Autor();
        tobar.apellidos="Tobar";
        tobar.llenarAtributos("MArco Antonio");
    
    Autor a2=new Autor("Gabriela", "Valladares", 0, "Ibarra", "15/11/1992", "Ecuatoriana");
    }
    
}
