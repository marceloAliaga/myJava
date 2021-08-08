// este ejercicio fue sacado de http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html 
// Enunciado: Programa que lea los catetos de un triangulo y de vuelva la long de la hipotenusa

package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del cateto 1: ");
        var cat1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la longitud del cateto 2: ");
        var cat2 = Double.parseDouble(sc.nextLine());
        var hipo = Math.sqrt(Math.pow(cat1,2)+ Math.pow(cat2,2));
        System.out.println("La longitud de la hipotenusa es: " + hipo);
        
    }
}
