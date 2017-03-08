/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Calculador {
    
    Operaciones respuesta=new Operaciones();
    Scanner miEscaner=new Scanner(System.in);
    double num1, num2;
    int opc;
   
    
    
   public void operacion(){
    System.out.println("Digite la operación a realizar: \n");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División\n");
    opc = miEscaner.nextInt();
    System.out.println("Ingrese el primer número: ");
    num1 = miEscaner.nextDouble();
    System.out.println("Ingrese el segundo número");
    num2 = miEscaner.nextDouble();
    
    switch(opc){
       case 1: System.out.println(respuesta.Sumar(num1,num2));break;
       case 2: System.out.println(respuesta.restar(num1,num2));break;
       case 3: System.out.println(respuesta.multipicar(num1,num2));break;
       case 4: System.out.println(respuesta.dividir(num1,num2));break;
   }
    
  }
   
    
}
