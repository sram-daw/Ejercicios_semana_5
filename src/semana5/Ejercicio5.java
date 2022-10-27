package semana5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int acumulo; //posicion 1-10 de los inputs del usuario
        float totalAcum = 0; //suma acumulada
        Scanner inputEscaner = new Scanner(System.in);
        for (acumulo = 1; acumulo < 11; acumulo++) {
            System.out.print("Introduzca el valor número " + acumulo + ": ");
            int numero = inputEscaner.nextInt(); //valor dado por el usuario
            totalAcum += numero;
            float media = totalAcum / acumulo; //cálculo de la media
            if (acumulo == 10) {
                System.out.println("La media total es: " + media);
                break;
            }
            System.out.println("La media de los valores introducidos hasta el momento es: " + media);
        }
    }
}



