// este ejercicio consiste en pedirle al usuario que ingrese el numero del mes del año y el programa devolvera 
// la estacion del año en la que este, es un programa simple para ver la estructura de if, else if, else

package ejercicios;

import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Ingrese el numero del mes del año: ");
    var mes =Integer.parseInt(consola.nextLine());
    var estacion ="Estacion desconocida";
    if (mes == 1 || mes == 2 || mes == 12){
        estacion = "Verano";
    }else if (mes == 3 || mes == 4 || mes == 5){
        estacion = "Otoño";       
    }else if (mes == 6 || mes == 7 || mes == 8){
        estacion = "Invierno";
    }else if (mes == 9 || mes == 10 || mes == 11){
        estacion = "Primavera";
    }else{
        estacion = "no existe ese numero de mes";
        }
    System.out.println("La estacion es: " + estacion);
    }
}
