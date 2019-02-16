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
public class EjercicioQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DAdo un numero ente 0 y 9999 decir cuantas cifras tiene
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor digite un numero entre 0 y 9999");
        int Numero = leer.nextInt();
        
        System.out.println("El numero tiene "+(String.valueOf(Numero)).length());
        
        if(Numero < 10){
            System.out.println("El numero tiene 1 cifra");
        }else if(Numero<100){
            System.out.println("El numero tiene 2 cifras");
        }else if(Numero<1000){
            System.out.println("El numero tiene 3 cifras");
        }else if(Numero<=9999){
            System.out.println("El numero tiene 4 cifras");
        }else{
            System.out.println("Cantidad mayor a los rangos validos");
        }
        
    }
    
}
