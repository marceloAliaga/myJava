// este ejercicio fue sacado de http://puntocomnoesunlenguaje.blogspot.com/p/ejercicios.html 
// Enunciado: Programa que lea los lados de un triangulo y de vuelva el area del triangulo

package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud del lado 1: ");
        var lad1 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la longitud del lado 2: ");
        var lad2 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese la longitud del lado 3: ");
        var lad3 = Double.parseDouble(sc.nextLine());
        var p = ( lad1 + lad2 + lad3 )/2;
        var area = Math.sqrt(p * (p - lad1) * (p - lad2) * (p - lad3));
        System.out.println("El area del triangulo es: " + area);
        
    }
}
