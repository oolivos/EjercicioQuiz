/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioquiz;

import java.util.Scanner;

/**
 *
 * @author ojo
 */
public class SalarioMensual {
    public static void main(String arg[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la hora");
        double precioHora = leer.nextDouble();
        
        System.out.println("Ingrese el numero de horas trabajadas");
        int numeroHoras = leer.nextInt();
        
        System.out.println("Ingrese nombre del empleado");
        String nombre = leer.next();
        
        double salarioBruto  = 0;
        
        if(numeroHoras <= 35){
            salarioBruto = numeroHoras * precioHora;
        }else{
            int horasExtras = numeroHoras - 35;
            salarioBruto = (35 * precioHora) + (horasExtras * precioHora * 1.5);
        }
        
        double impuesto = 0;
        if(salarioBruto > 100000 && salarioBruto < 200000){
            impuesto = salarioBruto * 0.1;
        }else{
            impuesto = salarioBruto * 0.3;
        }
        
        double salarioNeto = salarioBruto - impuesto;
        System.out.println("******** UNISANGIL********");
        System.out.println();
        System.out.println();
        System.out.println("Empleado: "+nombre);
        System.out.println();
        System.out.println("Liquidacion de Nómina");
        System.out.println();
        System.out.println("Hora Trabajadas: "+numeroHoras+"\t\tValor Hora: "+precioHora+"\t\tImpuestos: "+impuesto);
        System.out.println("Valor Bruto "+salarioBruto+"\t\tTotal a Pagar: "+salarioNeto);
        
        
        //System.out.println("El total a pagar es "+salarioNeto);
        
        
        
        
    }
    
}
