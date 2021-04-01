/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo5;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Trabajo5 {
    private int numero[],Numero;
    Scanner sc = new Scanner(System.in);
    
    public void Numeros(){
        numero = new int[10]; 
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" . Numero: ");
            numero[i]= sc.nextInt();
             }
        }
    public void Resultado(){
        System.out.println("El arreglo original es:");
        for (int i = 0; i < 10; i++) {
            System.out.println( i+" ." + numero[i]);
        }
    }
    public void Buscar(){
        System.out.print(" numero a buscar");
        Numero=sc.nextInt();
        
        int i=0;
        while(i<10 && numero[i]<Numero){
            i++;
            }
        if(i==10){
            System.out.println("No econtrado -1");
        }
        else{
            if(numero[i]==Numero){
                System.out.println("En la pocicion : " + i);
                 }
             }
        }
}
