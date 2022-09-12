/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nominas_edgarortiz;
import java.util.Scanner;
import com.mycompany.nominas_edgarortiz.Operativos.*;


/**
 *
 * @author Edgar O
 */
public class Nominas_EdgarOrtiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion ; 
        do{
            System.out.println("----------- EMPRESA XYZ ----------- \n");
            
            System.out.println("PUESTO DE TRABAJO: \n 1.OPERATIVO \n 2.COMERCIAL" + "\n");
            opcion = input.nextInt();
          

            switch(opcion){
                case 1 -> {
                    System.out.println("----------- MENU PRINCIPAL ----------- ");
                    System.out.println("Ingrese nombre completo del empleado que se va liquidar sin espacios: ");
                    String nombre = input.next();
                    Operativos empleado_nombre = new Operativos(nombre);
                    
                    Operativos empleado;
                    empleado = new Operativos(nombre);
                    empleado.empleado();
                    
                    Operativos empleador;
                    empleador = new Operativos (nombre);
                    empleador.empleador();
                }
                    
                case 2 -> {
                    System.out.println("----------- MENU PRINCIPAL ----------- ");
                    System.out.println("Ingrese nombre completo del empleado que se va liquidar sin espacios: ");
                     String nombre = input.next();
                     Comerciales nombre_empleado = new Comerciales(nombre);
                    
                     Comerciales empleado_Comerciales;
                     empleado_Comerciales = new Comerciales(nombre);
                     empleado_Comerciales.empleado();
        
                     Comerciales empleador_Comerciales;
                     empleador_Comerciales = new Comerciales(nombre);
                     empleador_Comerciales.empleador();
                }
              }
          
            System.out.println("Deseas continuar \n 1.Si \n 2.No");
            opcion = input.nextInt();
        }while(opcion == 1);
        
    }