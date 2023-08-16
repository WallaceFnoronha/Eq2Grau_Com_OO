package eq2grau_com_oo;

import java.util.Scanner;

public class Eq2Grau_Com_OO {

    public static void main(String[] args) {
        Eq2Grau eq = new Eq2Grau();
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        System.out.println("Digite o valor de A:");
        a = scan.nextDouble();

        System.out.println("Digite o valor de B:");
        b = scan.nextDouble();

        System.out.println("Digite o valor de C:");
        c = scan.nextDouble();

        eq.setA(a);
        eq.setB(b);
        eq.setC(c);

        // eq.setA(1);
        // eq.setB(-5);
        // eq.setC(6);

        eq.calcularDelta();
        eq.calcularX1();
        eq.calcularX2();

        System.out.println("x1: " + eq.getX1());
        System.out.println("x2: " + eq.getX2());

        scan.close();
    }

}
