/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Autor {
    //ATRIBUTOS VARIABLES GLOBALES
    public String nombre;
    public String apellidos;
    public int cedula;
    public String direccion;
    public String fechaNacimiento;
    public String nacionalidad;
   
    
    //MÉTODO CONSTRUCTOR=SIRVE PARA INICIALIZAR LOS ATRIBUTOS  int n=10;
//    public void llenarAtributos(String nombre1){
//        nombre1="Juan";
//        
//        
//     }
    //CONSTRUCTOR VACÍO Y ME PERMITE PERSONALIZAR
    //LOS ATRIBUTOS QUE QUIERO INICIALIZAR
    public Autor(){
       
    }
    //CONSTRUCTOR CON ARGUMENTOS->VARIABLE LOCAL
    public Autor(String nombre,String apellidos,int cedula,String direccion,String fechaNacimiento,String nacionalidad){
       this.nombre=nombre;
       this.apellidos=apellidos;
       this.cedula=cedula;
       this.direccion=direccion;
       this.fechaNacimiento=fechaNacimiento;
       this.nacionalidad=nacionalidad;
    }
}
