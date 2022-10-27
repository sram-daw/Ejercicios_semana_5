package semana5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el tamaño del lado: ");
        int lado = input.nextInt();
        System.out.print("Introduzca el tamaño de la altura: ");
        int altura = input.nextInt();
        calculoArea(lado, altura);
        System.out.println("El resultado del área es " + calculoArea(lado, altura));
    }

    public static int calculoArea(int n1, int n2) {
        return n1 * n2;
    }
}
