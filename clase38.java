// este ejercicio consiste en pedirle al usuario que ingrese el numero de la semana, este programa es para practicar la estructura de switch, case, default
package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Ingrese que numero de dia de semana es hoy: ");
    var dia = Integer.parseInt(consola.nextLine());
    var diaTexto = "dia desconocido";
    switch (dia){
        case 1:
            diaTexto = "Lunes";
            break;
        case 2:
            diaTexto = "Martes";
            break;
        case 3:
            diaTexto = "Miercoles";
            break;
        case 4:
            diaTexto = "Jueves";
            break;
        case 5:
            diaTexto = "Viernes";
            break;
        case 6:
            diaTexto = "Sabado";
            break;
        case 7:
            diaTexto = "Domingo";
            break;
        default:
            diaTexto = "La semana solo tiene 7 dias";
    }    
    System.out.println("hoy dia es: " + diaTexto);
  }
}
