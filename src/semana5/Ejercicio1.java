package semana5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el primer valor: ");
        int valor1 = input.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int valor2 = input.nextInt();
        boolean esMultiplo = valor1 % valor2==0;
        System.out.println(esMultiplo);


    }
}
