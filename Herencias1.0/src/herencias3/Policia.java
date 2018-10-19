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
public class Policia extends Persona{
    private String cargo;
    // Se crea el constructor
    public Policia(String n, String a, int e, String cargo){
        super(n,a,e);
        setCargo(cargo);
    
    }
    //Agregar valor al argumento cargo
    public void setCargo(String cargo){
        this.cargo = cargo;
        
    }
    //Metodo para enviar el valor del argumento cargo
    public String getCargo(){
        return cargo;
    }
    //Se sobreescribe metodo toString que sirve para presentar datos 
    @Override
    public String toString(){
        return String.format("%s - %s", super.toString(),getCargo());
    
    }
}
