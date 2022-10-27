package semana5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabraUsuario= input.nextLine();
    for(int posicionLetra=0; posicionLetra<palabraUsuario.length();posicionLetra++){
        System.out.println(palabraUsuario.charAt(posicionLetra));
    }
    }
}
