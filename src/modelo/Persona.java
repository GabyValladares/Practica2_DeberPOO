 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Persona {
    //ATRIBUTOS GLOBALES
    private int id;
    private int cedula;
    private String nombres;
    private String direccion;
    private int telefono;
    private String correoElectronico;

    public Persona() {
    }

    public Persona(int id, int cedula, String nombres, String direccion, int telefono, String correoElectronico) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void imprimir(){
        System.out.println("---PERSONA---"+"\n"+
                "Id:"+getId()+"\n"+
                "Nombres:"+this.nombres+"\n"+
                "Cédula:"+this.cedula+"\n"+
                "Dirección"+direccion+"\n"+
                "Correo Electrónico:"+getCorreoElectronico()+"\n"+
                "Email:"+correoElectronico+"\n"+
                "Teléfono:"+telefono);
    
    }

    @Override
    public String toString() {
        return "---PERSONA---"+"\n"+
                "Id:"+getId()+"\n"+
                "Nombres:"+this.nombres+"\n"+
                "Cédula:"+this.cedula+"\n"+
                "Dirección"+direccion+"\n"+
                "Correo Electrónico:"+getCorreoElectronico()+"\n"+
                "Email:"+correoElectronico+"\n"+
                "Teléfono:"+telefono;  }
    
    
    
    
    
}
