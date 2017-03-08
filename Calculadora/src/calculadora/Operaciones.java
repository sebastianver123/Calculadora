/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JTextField;

/**
 *
 * @author Estudiantes
 */
public class Operaciones{
        
    
    
    public double Sumar(double num1, double num2){
        
    double Suma;
    Suma=num1+num2;
    return Suma;
}
    public double restar(double num1, double num2){
        double resta;
        resta=num1-num2;
        return resta;
    }
    public double multipicar(double num1, double num2){
        double multiplicacion;
        multiplicacion=num1*num2;
        return multiplicacion;
    }
    
    public double dividir(double num1, double num2){
        double division;
        division=num1/num2;
        return division;
    }

    
}
