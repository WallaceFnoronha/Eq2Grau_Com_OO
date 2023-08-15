/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eq2grau_com_oo;

/**
 *
 * @author alunos
 */
public class Eq2Grau {

    private double a, b, c, delta, x1, x2;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }
    
    public double getX2() {
        return x2;
    }
    public void calcularDelta() {
        delta = b * b - 4 * a * c;
    }
    
    public void calcularX1(){
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
    }
    public void calcularX2(){
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
    }
    
}
