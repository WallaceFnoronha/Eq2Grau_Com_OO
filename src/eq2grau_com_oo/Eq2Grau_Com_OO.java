/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eq2grau_com_oo;

public class Eq2Grau_Com_OO {

    public static void main(String[] args) {
        Eq2Grau eq = new Eq2Grau();
        
        eq.setA(1);
        eq.setB(-5);
        eq.setC(6);
        
        eq.calcularDelta();
        eq.calcularX1();
        eq.calcularX2();
        
        System.out.println("x1: " + eq.getX1());
        System.out.println("x2: " + eq.getX2());
    }
    
}
