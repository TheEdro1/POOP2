/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 *
 * @author Ethan
 */
public class POOP2 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
       
        System.out.println("############ if ############");
        int a = 5;
        int b = 3;
        if (a<b) {
            System.out.println("b es mayor que a");
        }
       
        System.out.println("############ if ############");
        if (menor(a,b)) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("b es menor que a");
        }
        System.out.println("############ switch ############");
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
        System.out.println("##### switch #####");
        char vocal = 2;
        switch (vocal) {
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("e");
                break;
            case 3:
                System.out.println("i");
                break;
            case 4:
                System.out.println("o");
                break;
            case 5:
                System.out.println("u");
                break;
            default:
                System.out.println("No es vocal");
                throw new AssertionError();
        }
    }
private static boolean menor(int a, int b) {
    return a<b;
}
}