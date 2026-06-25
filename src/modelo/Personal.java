/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Personal {

    private int id;
    private String nombres;
    private String direccion;
    private int telefono;
    private double sueldo;

    public Personal() {
    }

    public Personal(int id, String nombres, String direccion, int telefono,double sueldo) {
        this.id = id;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo=sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "--PERSONAL--" + "\n"
                + "Nombres:" + getNombres() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Teléfono:" + getTelefono();
    }

}
