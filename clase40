// este ejercicio consiste en pedirle al usuario que ingrese el puntaje de un examen y devolvera la calificacion
package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona un valor entre 0 y 10: ");
    var calificacion = Double.parseDouble(consola.nextLine());
    var calificacionTexto = "calificacion desconocida";
    if (calificacion >= 9 && calificacion <= 10){
        calificacionTexto = "A";
    } else if (calificacion >= 8 && calificacion < 9){
        calificacionTexto = "B";
    } else if (calificacion >= 7 && calificacion < 8){
        calificacionTexto = "C";
    } else if (calificacion >= 6 && calificacion < 7){
        calificacionTexto = "D";
    } else if (calificacion >= 0 && calificacion < 6){
        calificacionTexto = "F";
    } else {
        calificacionTexto = "Valor desconocido";        
    }
    System.out.println("Su calificacion es: " + calificacionTexto);
  }
