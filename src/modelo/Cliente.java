/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Cliente extends Persona {
    //1.ATRIBUTOS GLOBALES
    public String formaPago;

    public Cliente() {
        setNombres("Cadena");
        setCedula(1);
    }

    public Cliente(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
    
}
