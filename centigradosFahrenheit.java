// este ejercicio fue sacado de http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html 
// Enunciado: Programa que lea una cantidad de grados centigrados y los pase a fahrenheit

package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        var c = Double.parseDouble(sc.nextLine());
        var f = 32 + ( 9 * c / 5);
        System.out.println("La temperatura en grados Fahrenheit es: " + f);
        
    }
}
