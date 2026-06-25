/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Administrativo extends Personal {

    private int jornada;//1)Matutina 2)Vespertina
    private int numHijos;
    private int[] edades;
    //final -> constante
//    final double sueldo=850.00;
//    double SUELDOFIJO=850.00;
    private final double SUELDOTOTAL = 850.00;

    public Administrativo() {
    }

    public Administrativo(int jornada, int numHijos, int[] edades) {
        this.jornada = jornada;
        this.numHijos = numHijos;
        this.edades = edades;
    }

    public Administrativo(int jornada, int numHijos, int[] edades, int id, String nombres, String direccion, int telefono, double sueldo) {
        super(id, nombres, direccion, telefono, sueldo);
        this.jornada = jornada;
        this.numHijos = numHijos;
        this.edades = edades;
    }

    //Calcular el sueldo del personal administrativo tomando en cuenta la jornada 
    
    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public int[] getEdades() {
        return edades;
    }

    public void setEdades(int[] edades) {
        this.edades = edades;
    }
   
    public double getSueldoTotal() {
        return SUELDOTOTAL;
    }
    
         
    //laboral si es vespertina recibirá 3,50 y si es matutina 2,5, adicional 
    //para cada hijo una bonificación de 20 y en caso de ser menor de edad 15 extras
    //, su sueldo base es 850, calculé el sueldo a recibir.
    //FIRMA ->declaración 
    public void calcularSueldoFinal(){
        //FIRMA O BLOQUE DE IMPLEMENTACIÓN
        double valorAlimentacion=0;
        double sub=0;
        double sueldoRecibir=0;
        if(getJornada()==1){
            valorAlimentacion=2.5*20;
        }else if(getJornada()==2){
            valorAlimentacion=3.50*20;
        }else{
                JOptionPane.showMessageDialog(null, "Recuerde ingresar 1 cuando la jornada es Matutina y 2 cuando es Vespetina");
        }
        edades=this.ingresarEdades(getNumHijos());
        int menores=0;
        for (int i = 0; i < edades.length; i++) {
            if(edades[i]<=18){
                menores++;
            }
        }
         sub=this.calcularSubsidioHijo(menores);
        
    sueldoRecibir=getSueldoTotal()+sub+valorAlimentacion;
    JOptionPane.showMessageDialog(null, "El sueldo a recibir es:"+sueldoRecibir);
    
    }
    //SOBRECARGA 
    public void ingresarEdades(){
        for (int i = 0; i < getNumHijos(); i++) {
            edades[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de sus hijos"));
        }
    }
    
    public int[] ingresarEdades(int numHijos){
        int[] listaEdades=new int[numHijos];
        for (int i = 0; i <listaEdades.length; i++) {
            listaEdades[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de sus hijos"));
        }                  
        return listaEdades;
    }
    public double calcularSubsidioHijo(int m){
        double sub=getNumHijos()*20;
        if(m!=0){
            sub+=m*15;
           // sub=sub+(m*15);
        }
        return sub;
    }
    
   
}
