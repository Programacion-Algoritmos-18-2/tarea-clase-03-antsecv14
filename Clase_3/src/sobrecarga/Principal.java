/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();
        
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        
        }
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("Angregar un sueldo mensual =1\nAgregar un sueldo cada semana=2 ");
        int cantidad_sueldos = scanner.nextInt();
        if (cantidad_sueldos ==1) {
            System.out.println("Ingrese el sueldo mensual");
            double sueldo_mensual = scanner.nextDouble();
            t.agregar_sueldo(sueldo_mensual);
        }else if(cantidad_sueldos == 2){
            double s1,s2,s3,s4;
            System.out.println("Ingrese el sueldo 1: ");
            s1 = scanner.nextDouble();
            
            System.out.println("Ingrese el sueldo 2: ");
            s2 = scanner.nextDouble();
            
            System.out.println("Ingrese el sueldo 3: ");
            s3 = scanner.nextDouble();
            
            System.out.println("Ingrese el sueldo 4: ");
            s4 = scanner.nextDouble();
            
            t.agregar_sueldo(s1,s2,s3,s4);
            
        }else{
            System.out.println("Ingrese los sueldos de cada semana ");
            double [] sueldo_semanal = new double[4];
            for (int i = 0; i < sueldo_semanal.length; i++) {
                System.out.println("Ingrese el sueldo de la semana "+(i+1)+" :");
                sueldo_semanal[i] = scanner.nextDouble();
            }
        }

        
        System.out.printf("Los datos del trabajador son: %s\n", t.presentar_datos());
        
                
    }
}
