/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author USUARIO
 */
public class Docente extends Persona{
    private double sueldo;
    //Se crea el constructor
    public Docente(String n, String a, int e, double sueldo){
        super(n,a,e);
        setSueldo(sueldo);
    
    }
    //Se agrega valor al argumento sueldo
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
        
    
    }
    //Metodo para enviar el valor del argumento sueldo
    public double getSueldo(){
        return sueldo;
    }
    //Se sobreescribe metodo toString que sirve para prezentar datos
    @Override
    public String toString(){
        return String.format("%s - %f", super.toString(),getSueldo());
    
    }
}
